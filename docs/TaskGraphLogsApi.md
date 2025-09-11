# TaskGraphLogsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskGraphLog**](TaskGraphLogsApi.md#createTaskGraphLog) | **POST** /taskgraphs/{workspace}/log |  |
| [**getTaskGraphLog**](TaskGraphLogsApi.md#getTaskGraphLog) | **GET** /taskgraphs/{workspace}/logs/{id} |  |
| [**listTaskGraphLogs**](TaskGraphLogsApi.md#listTaskGraphLogs) | **GET** /taskgraphs/logs |  |
| [**reportClientNode**](TaskGraphLogsApi.md#reportClientNode) | **POST** /taskgraphs/{workspace}/logs/{id}/report_client_node |  |
| [**resubmitTaskGraphExecution**](TaskGraphLogsApi.md#resubmitTaskGraphExecution) | **POST** /taskgraphs/{workspace}/executions/{id}/resubmit |  |
| [**retryTaskGraphExecution**](TaskGraphLogsApi.md#retryTaskGraphExecution) | **POST** /taskgraphs/{workspace}/executions/{id}/retry |  |
| [**stopTaskGraphExecution**](TaskGraphLogsApi.md#stopTaskGraphExecution) | **POST** /taskgraphs/{workspace}/executions/{id}/stop |  |
| [**submitTaskGraph**](TaskGraphLogsApi.md#submitTaskGraph) | **POST** /taskgraphs/{workspace}/graphs/{id}/submit |  |
| [**updateTaskGraphLog**](TaskGraphLogsApi.md#updateTaskGraphLog) | **PATCH** /taskgraphs/{workspace}/logs/{id} |  |


<a id="createTaskGraphLog"></a>
# **createTaskGraphLog**
> TaskGraphLog createTaskGraphLog(workspace, log)



Create a task graph log.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    TaskGraphLog log = new TaskGraphLog(); // TaskGraphLog | 
    try {
      TaskGraphLog result = apiInstance.createTaskGraphLog(workspace, log);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#createTaskGraphLog");
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
| **log** | [**TaskGraphLog**](TaskGraphLog.md)|  | |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The task graph was created. The returned TaskGraphLog will include the data the client sent, with the server-defined fields added in.  |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getTaskGraphLog"></a>
# **getTaskGraphLog**
> TaskGraphLog getTaskGraphLog(workspace, id)



Fetch information about a single task graph execution. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph log entry.
    try {
      TaskGraphLog result = apiInstance.getTaskGraphLog(workspace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#getTaskGraphLog");
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
| **id** | **String**| The UUID of the task graph log entry. | |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the execution of a single task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listTaskGraphLogs"></a>
# **listTaskGraphLogs**
> TaskGraphLogsData listTaskGraphLogs(namespace, createdBy, status, search, startTime, endTime, page, perPage)



Fetch the task graph logs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String namespace = "namespace_example"; // String | Include logs for this namespace.
    String createdBy = "createdBy_example"; // String | Include logs from only this user.
    String status = "status_example"; // String | Filter to only return these statuses
    String search = "search_example"; // String | search string that will look at name.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Include logs created after this time.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Include logs created before this time.
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      TaskGraphLogsData result = apiInstance.listTaskGraphLogs(namespace, createdBy, status, search, startTime, endTime, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#listTaskGraphLogs");
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
| **namespace** | **String**| Include logs for this namespace. | [optional] |
| **createdBy** | **String**| Include logs from only this user. | [optional] |
| **status** | **String**| Filter to only return these statuses | [optional] |
| **search** | **String**| search string that will look at name. | [optional] |
| **startTime** | **OffsetDateTime**| Include logs created after this time. | [optional] |
| **endTime** | **OffsetDateTime**| Include logs created before this time. | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**TaskGraphLogsData**](TaskGraphLogsData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task graph logs that matched the user&#39;s query. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="reportClientNode"></a>
# **reportClientNode**
> reportClientNode(workspace, id, report)



### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph log entry.
    TaskGraphClientNodeStatus report = new TaskGraphClientNodeStatus(); // TaskGraphClientNodeStatus | The node status to report.
    try {
      apiInstance.reportClientNode(workspace, id, report);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#reportClientNode");
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
| **id** | **String**| The UUID of the task graph log entry. | |
| **report** | [**TaskGraphClientNodeStatus**](TaskGraphClientNodeStatus.md)| The node status to report. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Status reported successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="resubmitTaskGraphExecution"></a>
# **resubmitTaskGraphExecution**
> TaskGraphLog resubmitTaskGraphExecution(workspace, id)



Resubmits a task graph in the given namespace using the associated execution id.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph execution (TaskGraphLog).
    try {
      TaskGraphLog result = apiInstance.resubmitTaskGraphExecution(workspace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#resubmitTaskGraphExecution");
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
| **id** | **String**| The UUID of the task graph execution (TaskGraphLog). | |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Information about the task graph execution. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="retryTaskGraphExecution"></a>
# **retryTaskGraphExecution**
> TaskGraphLog retryTaskGraphExecution(workspace, id)



Retries failed tasks of a task graph in the given namespace using the associated execution id.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph execution (TaskGraphLog).
    try {
      TaskGraphLog result = apiInstance.retryTaskGraphExecution(workspace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#retryTaskGraphExecution");
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
| **id** | **String**| The UUID of the task graph execution (TaskGraphLog). | |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Information about the task graph execution. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="stopTaskGraphExecution"></a>
# **stopTaskGraphExecution**
> stopTaskGraphExecution(workspace, id)



Stops a task graph execution in the given namespace using the associated associated execution id.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph execution (TaskGraphLog).
    try {
      apiInstance.stopTaskGraphExecution(workspace, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#stopTaskGraphExecution");
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
| **id** | **String**| The UUID of the task graph execution (TaskGraphLog). | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Graph stopped successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="submitTaskGraph"></a>
# **submitTaskGraph**
> TaskGraphLog submitTaskGraph(workspace, id, rootTaskGraphUuid)



Submit a single task graph for execution. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph entry.
    String rootTaskGraphUuid = "rootTaskGraphUuid_example"; // String | UUID of the root taskgraph that this graph is assosiated with
    try {
      TaskGraphLog result = apiInstance.submitTaskGraph(workspace, id, rootTaskGraphUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#submitTaskGraph");
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
| **id** | **String**| The UUID of the task graph entry. | |
| **rootTaskGraphUuid** | **String**| UUID of the root taskgraph that this graph is assosiated with | [optional] |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Information about the execution of a single task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="updateTaskGraphLog"></a>
# **updateTaskGraphLog**
> updateTaskGraphLog(workspace, id, log)



Update information about a single task graph execution. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphLogsApi;

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

    TaskGraphLogsApi apiInstance = new TaskGraphLogsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph log entry.
    TaskGraphLog log = new TaskGraphLog(); // TaskGraphLog | Updates to make to the task graph log. The only manual update that a client should need to make to a task graph log is to update its completion status to `succeeded`, `failed`, or `cancelled`. 
    try {
      apiInstance.updateTaskGraphLog(workspace, id, log);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphLogsApi#updateTaskGraphLog");
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
| **id** | **String**| The UUID of the task graph log entry. | |
| **log** | [**TaskGraphLog**](TaskGraphLog.md)| Updates to make to the task graph log. The only manual update that a client should need to make to a task graph log is to update its completion status to &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Log entry updated successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

