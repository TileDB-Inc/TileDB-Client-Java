package examples;

// Import classes:
import io.tiledb.cloud.Pair;
import io.tiledb.cloud.TileDBClient;
import io.tiledb.cloud.TileDBLogin;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;
import io.tiledb.cloud.rest_api.model.*;
import org.apache.arrow.vector.ValueVector;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.tiledb.cloud.TileDBUtils.serializeArgs;

public class Examples
{
    public static void main(String[] args) throws ApiException {
        String token = "";
        String URL = "";

//      if using cloud for the first time create the client with a Login object to pass your credentials.
        TileDBClient tileDBClient = new TileDBClient(
                new TileDBLogin(null,
                        null,
                        token,
                        false,
                        true,
                        true,
                        URL));

//      If the "RememberME" option is set to true in your first login you can access TileDB-Cloud without the need
//      to pass any credentials from now on. Just create the client as follows:
//      TileDBClient tileDBClient = new TileDBClient();
        tileDBClient.setDebugging(true);

//        runNextflowMethods(tileDBClient);
    }

    public static void runNextflowMethods(TileDBClient tileDBClient) throws ApiException {
        String namespace = "";
        TaskGraphNode node = new TaskGraphNode();
        node.name("dstara");
        String uuid = "23be1141-e11a-4853-bf00-b5e5ec64315d";
        node.clientNodeId(uuid);

        // TODO: set retry strategy
        node.retryStrategy(new RetryStrategy().limit(0));

        // TODO: set timeout
        // task.config.getTime()

        TGUDFNodeData nodeData = new TGUDFNodeData();

        TGUDFArgument workDirArg = new TGUDFArgument();
        workDirArg.setName("workDirS3Path");
        workDirArg.setValue("s3://tiledb-dstara");
        nodeData.addArgumentsItem(workDirArg);

        TGUDFEnvironment environment = new TGUDFEnvironment();
        environment.setLanguage(UDFLanguage.NEXTFLOW);
        environment.setImageName("debian:latest");
        environment.setAccessCredentialsName("");

        TGUDFEnvironmentResources environmentResources = new TGUDFEnvironmentResources();
        environmentResources.setCpu("1");
//        environmentResources.setGpu(1);
        environmentResources.setMemory("4Gi");
        environment.resources(environmentResources);

        //storage
        TGUDFStorage storage = new TGUDFStorage();
        storage.setPath("/tmp");
        storage.setTiledbUri("tiledb:" + "" + "/" + "");
        List<TGUDFStorage> myStorageList = new ArrayList<>();
        myStorageList.add(storage);
        environment.setStorage(myStorageList);

        nodeData.environment(environment);
        node.setUdfNode(nodeData);


        // Begin task graph
        TaskGraph tg = new TaskGraph();
        tg.name("dstara");
        tg.addNodesItem(node);
        TaskGraphsApi taskGraphsApi = new TaskGraphsApi(tileDBClient.getApiClient());
        TaskGraph res = taskGraphsApi.createTaskGraph(namespace, tg);
        taskGraphsApi.submitTaskGraph(namespace, res.getUuid(), "");
    }
}
