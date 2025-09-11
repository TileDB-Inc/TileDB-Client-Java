# FilesApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleCreateFile**](FilesApi.md#handleCreateFile) | **POST** /files/{workspace}/{teamspace} |  |
| [**handleExportFile**](FilesApi.md#handleExportFile) | **POST** /files/{workspace}/{teamspace}/{file}/export |  |
| [**handleUploadFile**](FilesApi.md#handleUploadFile) | **POST** /files/{workspace}/{teamspace}/upload |  |


<a id="handleCreateFile"></a>
# **handleCreateFile**
> FileCreated handleCreateFile(workspace, teamspace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME)



Create a tiledb file at the specified location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    FileCreate fileCreate = new FileCreate(); // FileCreate | Input/Output information to create a new TileDB file
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    try {
      FileCreated result = apiInstance.handleCreateFile(workspace, teamspace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#handleCreateFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **fileCreate** | [**FileCreate**](FileCreate.md)| Input/Output information to create a new TileDB file | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |

### Return type

[**FileCreated**](FileCreated.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File created |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="handleExportFile"></a>
# **handleExportFile**
> FileExported handleExportFile(workspace, teamspace, _file, fileExport)



Export a TileDB File back to its original file format

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String _file = "_file_example"; // String | The file identifier
    FileExport fileExport = new FileExport(); // FileExport | Export configuration information
    try {
      FileExported result = apiInstance.handleExportFile(workspace, teamspace, _file, fileExport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#handleExportFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **_file** | **String**| The file identifier | |
| **fileExport** | [**FileExport**](FileExport.md)| Export configuration information | |

### Return type

[**FileExported**](FileExported.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File exported |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="handleUploadFile"></a>
# **handleUploadFile**
> FileUploaded handleUploadFile(workspace, teamspace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name)



Upload a tiledb file at the specified location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    File inputFile = new File("/path/to/file"); // File | the file to upload
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    String outputUri = "outputUri_example"; // String | output location of the TileDB File
    String name = "name_example"; // String | name to set for registered file
    try {
      FileUploaded result = apiInstance.handleUploadFile(workspace, teamspace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#handleUploadFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **inputFile** | **File**| the file to upload | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |
| **outputUri** | **String**| output location of the TileDB File | [optional] |
| **name** | **String**| name to set for registered file | [optional] |

### Return type

[**FileUploaded**](FileUploaded.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File uploaded |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

