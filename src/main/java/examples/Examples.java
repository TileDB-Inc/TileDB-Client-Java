package examples;

// Import classes:
import io.tiledb.cloud.Pair;
import io.tiledb.cloud.TileDBClient;
import io.tiledb.cloud.TileDBLogin;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;
import io.tiledb.cloud.rest_api.api.TasksApi;
import io.tiledb.cloud.rest_api.model.*;
import org.apache.arrow.vector.ValueVector;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.tiledb.cloud.TileDBUtils.serializeArgs;

public class Examples
{
    private static final double CPU_PRICE_PER_SECOND = 0.04 / 3600.0;
    private static final double RAM_PRICE_PER_SECOND = 0.005 / 3600.0;
    public static void main(String[] args) throws ApiException {
        String token = "";
        String URL = "https://api.staging.tiledb.io";

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


//        TaskGraph tg = new TaskGraph();
//        tg.name("dstara");
//        tg.addNodesItem(node);
        TaskGraphLogsApi taskGraphLogAPI = new TaskGraphLogsApi(tileDBClient.getV1Client());
        TasksApi tasksApi = new TasksApi(tileDBClient.getV1Client());
        try {

//            ArrayTaskData tasks = tasksApi.tasksGet(
//                    "TileDB-Inc-Staging", // namespace
//                    null,           // createdBy
//                    null,           // array
//                    null,           // start
//                    null,           // end
//                    1,              // page
//                    100,            // perPage
//                    null,           // type
//                    null,           // excludeType
//                    null,           // fileType
//                    null,           // excludeFileType
//                    "COMPLETED",    // status
//                    null,           // search
//                    null            // orderby
//            );
            TaskGraphLog taskGraphLog = taskGraphLogAPI.getTaskGraphLog("TileDB-Inc-Staging", "f6b860e3-6b4c-4c3e-b1ab-123576c070cc");
            double totalCost = 0.0;

            List<TaskGraphNodeMetadata> nodes = taskGraphLog.getNodes();


            for (TaskGraphNodeMetadata node : nodes) {

                double nodeCost = 0.0;

                System.out.println("Node: " + node.getName());
                System.out.println("Run location: " + node.getRunLocation().getValue());

                List<ArrayTask> executions = node.getExecutions();
                if (executions == null || executions.isEmpty()) {
                    continue;
                }

                for (ArrayTask exec : executions) {

                    OffsetDateTime start = exec.getStartTime();
                    OffsetDateTime end = exec.getFinishTime();

                    if (start == null || end == null) {
                        continue;
                    }

                    long seconds = Duration.between(start, end).getSeconds();
                    if (seconds <= 0) {
                        continue;
                    }

                    double cpu = exec.getCpu() != null ? exec.getCpu() : 0.0;
                    double ram = exec.getMemory() != null ? exec.getMemory() : 0.0;

                    // Per your requirement
                    if (ram < 0) {
                        ram = 0;
                    }

                    double cpuCost = cpu * seconds * CPU_PRICE_PER_SECOND;
                    double ramCost = ram * seconds * RAM_PRICE_PER_SECOND;
                    double execCost = cpuCost + ramCost;

                    nodeCost += execCost;

                    System.out.printf(
                            "  Execution %s: duration=%ds cpu=%.2f ram=%.2fGiB cost=$%.6f%n",
                            exec.getId(), seconds, cpu, ram, execCost
                    );
                }

                totalCost += nodeCost;
                System.out.printf("Node total cost: $%.6f%n%n", nodeCost);
            }

            System.out.printf("TASKGRAPH TOTAL COST: $%.6f%n", totalCost);
        } catch (Exception e){
            e.printStackTrace();
        }
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
