package io.tiledb.cloud;

import okhttp3.OkHttpClient;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TileDBClient{

    private static String apiKey;
    private static String username;
    private static String password;
    private static String basePath;

    private static boolean verifyingSsl;

    private static boolean loginInfoIsInJSONFile;

    private static final String homeDir = System.getProperty("user.home");

    private static String cloudFilePath;

    static Logger logger = Logger.getLogger(TileDBClient.class.getName());

    private io.tiledb.cloud.rest_api.ApiClient apiClient;

    // Lazy-initialized versioned clients (v4 is optional and created via reflection)
    private io.tiledb.cloud.rest_api.ApiClient v1Client;
    private io.tiledb.cloud.rest_api.v2.ApiClient v2Client;
    private io.tiledb.cloud.rest_api.v4.ApiClient v4Client;

    public enum ApiVersion { V1, V2, V4 }

    /**
     * Static initialization.
     */
    static
    {
        apiKey = "";
        username = "";
        password = "";
        basePath = "https://api.tiledb.com/v1"; //default is TileDB (v1 for backward compatibility)
        loginInfoIsInJSONFile = true;
        verifyingSsl = true;

        // set path according to OS
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            cloudFilePath = "\\.tiledb\\cloud.json";
        } else{
            cloudFilePath = "/.tiledb/cloud.json";
        }

        boolean ok =  false;
        try {
            ok = loadCloudJSONFileFromHome();
        } catch (Exception e) {
            loginInfoIsInJSONFile = false;
        }
        if (!ok) {
            loginInfoIsInJSONFile = false;
        }
    }

    /**
     * If exists, it reads the cloud.json file which is stored in the home
     * folder to look for stored credentials.
     * @return true if found
     * @throws IOException
     */
    private static boolean loadCloudJSONFileFromHome() throws IOException {
        String fileName = homeDir + cloudFilePath;

        File initialFile = new File(fileName);
        InputStream is = Files.newInputStream(initialFile.toPath());

        JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);

        if (object.has("api_key")){
            JSONObject apiKeyObject = object.getJSONObject("api_key");
            if (apiKeyObject.has("X-TILEDB-REST-API-KEY")) {
                apiKey = apiKeyObject.getString("X-TILEDB-REST-API-KEY");
                logger.log(Level.INFO, "Found apiKey from disk");
            }
        }
        if (object.has("username")){
            username = object.getString("username");
            logger.log(Level.INFO, "Found username from disk");
        }
        if (object.has("password")){
            password = object.getString("password");
            logger.log(Level.INFO, "Found password from disk");
        }
        if (object.has("verify_ssl")){
            boolean verifySSL = object.getBoolean("verify_ssl");
            verifyingSsl = verifySSL;
            logger.log(Level.INFO, "Found verifySSL from disk");
        }

        if (object.has("host")){
            String host = object.getString("host");
            basePath = host;
            logger.log(Level.INFO, "Found host from disk");
        }

        // check if credentials are adequate for logging in
        if ((Objects.equals(apiKey, "") && (Objects.equals(password, "") && !Objects.equals(username, ""))
                        || (Objects.equals(apiKey, "") && ((Objects.equals(password, "") || Objects.equals(username, "")))))){
            return false;
        }

        return true;
    }

    /**
     * Enables debugging logs
     * @param flag True to enable
     */
    public void setDebugging(boolean flag){
        this.apiClient.setDebugging(flag);
    }

    /**
     * This method throws a warning if there is no login information in the json file or passed
     * as a parameter. If the login information has data it calls another helper method to save it.
     * @param tileDBLogin
     */
    private void findCredentials(TileDBLogin tileDBLogin) {
        if (!loginInfoIsInJSONFile) {
            //requires login from user for the first time
            if (tileDBLogin == null || !tileDBLogin.isValid()){
                logger.warning("No login info was provided nor found. " +
                        "Use the Login class to login for the first time");
            } else {
                populateFieldsFromLogin(tileDBLogin);
            }
        } else if (tileDBLogin != null && tileDBLogin.overwritePrevious()){ //in this case the data in the json is overwritten.
            populateFieldsFromLogin(tileDBLogin);
        }
    }

    /**
     * Saves the data from the Login object.
     * @param tileDBLogin The Login object
     */
    private void populateFieldsFromLogin(TileDBLogin tileDBLogin) {
        if (!tileDBLogin.getHost().equals("")){
            basePath = tileDBLogin.getHost();
        } else {
            basePath = "https://api.tiledb.com/v1";
        }
        apiKey = tileDBLogin.getApiKey();
        username = tileDBLogin.getUsername();
        password = tileDBLogin.getPassword();
        verifyingSsl = tileDBLogin.isVerifySSL();
        if (tileDBLogin.rememberMe()) { //save credentials
            writeAuthJSONFileToHome();
        }
    }

    /**
     * Writes the json file to the home folder
     */
    private void writeAuthJSONFileToHome() {
        JSONObject jsonObject = new JSONObject();

        //create nested object for apiKey
        JSONObject apiKeyObject = new JSONObject();
        apiKeyObject.put("X-TILEDB-REST-API-KEY", apiKey);

        //Inserting key-value pairs into the json object
        jsonObject.put("api_key", apiKeyObject);
        jsonObject.put("username", username);
        jsonObject.put("password", password);
        if (basePath.equals("https://api.tiledb.com/v1")){
            jsonObject.put("host", "https://api.tiledb.com");
        }else{
            jsonObject.put("host", basePath);
        }
        jsonObject.put("verify_ssl", verifyingSsl);
        try {
            File file = new File(homeDir + cloudFilePath);
            file.getParentFile().mkdirs(); //create /.tiledb dir if not present
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jsonObject.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Basic constructor with custom OkHttpClient
     *
     * @param client an okhttp3.OkHttpClient object
     * @param tileDBLogin Login object with credentials
     */
    public TileDBClient(OkHttpClient client, TileDBLogin tileDBLogin){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient(client);
        setClientCredentials(tileDBLogin);
        setReadTimeout(0);
    }

    /**
     * Basic constructor with custom OkHttpClient
     *
     * @param client an okhttp3.OkHttpClient object
     */
    public TileDBClient(OkHttpClient client){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient(client);
        setClientCredentials(new TileDBLogin());
        setReadTimeout(0);
    }

    /**
     * Basic constructor
     *
     * @param tileDBLogin Login object with credentials
     */
    public TileDBClient(TileDBLogin tileDBLogin){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient();
        setClientCredentials(tileDBLogin);
        setReadTimeout(0);
    }

    /**
     * Basic constructor
     *
     */
    public TileDBClient(){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient();
        setClientCredentials(new TileDBLogin());
        setReadTimeout(0);
    }

    /**
     * Constructor for TileDBClient to support access token retry on 401/403 configured with base path, client ID, secret, and additional parameters
     *
     * @param basePath base path
     * @param clientId client ID
     * @param clientSecret client secret
     * @param parameters a java.util.Map of parameters
     */
    public TileDBClient(String basePath, String clientId, String clientSecret, Map<String, String> parameters){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient(basePath, clientId, clientSecret, parameters);
        setClientCredentials(new TileDBLogin());
        setReadTimeout(0);
    }

    /**
     * Constructor for TileDBClient to support access token retry on 401/403 configured with base path, client ID, secret, and additional parameters
     *
     * @param basePath base path
     * @param clientId client ID
     * @param clientSecret client secret
     * @param parameters a java.util.Map of parameters
     * @param tileDBLogin Login object with credentials
     */
    public TileDBClient(String basePath, String clientId, String clientSecret, Map<String, String> parameters, TileDBLogin tileDBLogin){
        apiClient = new io.tiledb.cloud.rest_api.ApiClient(basePath, clientId, clientSecret, parameters);
        setClientCredentials(tileDBLogin);
        setReadTimeout(0);
    }

    /**
     * Set timeout timer
     * @param timeout timeout timer in milliseconds
     */
    public void setReadTimeout(int timeout){
        this.apiClient = this.apiClient.setReadTimeout(timeout);
    }

    /**
     * Sets the credentials for the client. Can be called during runtime.
     * @param tileDBLogin A TileDBLogin Object
     */
    public void setClientCredentials(TileDBLogin tileDBLogin) {
        findCredentials(tileDBLogin);
        apiClient.setApiKey(apiKey);
        apiClient.setUsername(username);
        apiClient.setPassword(password);
        apiClient.setBasePath(basePath);
    }

    @Deprecated
    // Replaced by: getV1Client()
    public io.tiledb.cloud.rest_api.ApiClient getApiClient() {
        return apiClient;
    }

    private String normalizeBaseHost(String inputBase) {
        if (inputBase == null || inputBase.isEmpty()) {
            return "https://api.tiledb.com";
        }
        // strip trailing /v{digits}
        String trimmed = inputBase.trim();
        return trimmed.replaceFirst("/v\\d+$", "");
    }

    private String versionedBasePath(ApiVersion version) {
        String hostOnly = normalizeBaseHost(basePath);
        String suffix;
        switch (version) {
            case V2:
                suffix = "/v2";
                break;
            case V4:
                suffix = "/v4";
                break;
            case V1:
            default:
                suffix = "/v1";
                break;
        }
        return hostOnly + suffix;
    }

    public io.tiledb.cloud.rest_api.ApiClient getV1Client() {
        if (v1Client == null) {
            v1Client = new io.tiledb.cloud.rest_api.ApiClient();
            v1Client.setApiKey(apiKey);
            v1Client.setUsername(username);
            v1Client.setPassword(password);
            v1Client.setVerifyingSsl(verifyingSsl);
            v1Client.setBasePath(versionedBasePath(ApiVersion.V1));
            v1Client = v1Client.setReadTimeout(this.apiClient.getReadTimeout());
        }
        return v1Client;
    }

    public io.tiledb.cloud.rest_api.v2.ApiClient getV2Client() {
        if (v2Client == null) {
            v2Client = new io.tiledb.cloud.rest_api.v2.ApiClient();
            v2Client.setApiKey(apiKey);
            v2Client.setUsername(username);
            v2Client.setPassword(password);
            v2Client.setVerifyingSsl(verifyingSsl);
            v2Client.setBasePath(versionedBasePath(ApiVersion.V2));
            v2Client = v2Client.setReadTimeout(this.apiClient.getReadTimeout());
        }
        return v2Client;
    }

    public io.tiledb.cloud.rest_api.v4.ApiClient getV4Client() {
        if (v4Client == null) {
            v4Client = new io.tiledb.cloud.rest_api.v4.ApiClient();
            v4Client.setApiKey(apiKey);
            v4Client.setUsername(username);
            v4Client.setPassword(password);
            v4Client.setVerifyingSsl(verifyingSsl);
            v4Client.setBasePath(versionedBasePath(ApiVersion.V4));
            v4Client = v4Client.setReadTimeout(this.apiClient.getReadTimeout());
        }
        return v4Client;
    }

    public Object getApiClient(ApiVersion version) {
        switch (version) {
            case V1:
                return getV1Client();
            case V2:
                return getV2Client();
            case V4:
            default:
                return getV4Client();
        }
    }
}