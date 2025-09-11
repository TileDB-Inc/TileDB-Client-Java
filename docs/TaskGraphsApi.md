# TaskGraphsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskGraph**](TaskGraphsApi.md#createTaskGraph) | **POST** /taskgraphs/{workspace}/graphs |  |
| [**getTaskGraph**](TaskGraphsApi.md#getTaskGraph) | **GET** /taskgraphs/{workspace}/graphs/{id} |  |
| [**listTaskGraphs**](TaskGraphsApi.md#listTaskGraphs) | **GET** /taskgraphs/{workspace}/graphs |  |
| [**submitTaskGraph**](TaskGraphsApi.md#submitTaskGraph) | **POST** /taskgraphs/{workspace}/graphs/{id}/submit |  |
| [**updateTaskGraph**](TaskGraphsApi.md#updateTaskGraph) | **PATCH** /taskgraphs/{workspace}/graphs/{id} |  |


<a id="createTaskGraph"></a>
# **createTaskGraph**
> TaskGraph createTaskGraph(workspace, graph)



Create a single task graph for execution. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    TaskGraph graph = new TaskGraph(); // TaskGraph | Create the task graph.
    try {
      TaskGraph result = apiInstance.createTaskGraph(workspace, graph);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#createTaskGraph");
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
| **graph** | [**TaskGraph**](TaskGraph.md)| Create the task graph. | |

### Return type

[**TaskGraph**](TaskGraph.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Task graph created successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getTaskGraph"></a>
# **getTaskGraph**
> TaskGraph getTaskGraph(workspace, id)



Fetch information about a single task graph. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph entry.
    try {
      TaskGraph result = apiInstance.getTaskGraph(workspace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#getTaskGraph");
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

### Return type

[**TaskGraph**](TaskGraph.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the single task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listTaskGraphs"></a>
# **listTaskGraphs**
> TaskGraphs listTaskGraphs(workspace)



Fetch the task graphs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    try {
      TaskGraphs result = apiInstance.listTaskGraphs(workspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#listTaskGraphs");
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

### Return type

[**TaskGraphs**](TaskGraphs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task graphs that matched the user&#39;s query. |  -  |
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
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph entry.
    String rootTaskGraphUuid = "rootTaskGraphUuid_example"; // String | UUID of the root taskgraph that this graph is assosiated with
    try {
      TaskGraphLog result = apiInstance.submitTaskGraph(workspace, id, rootTaskGraphUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#submitTaskGraph");
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

<a id="updateTaskGraph"></a>
# **updateTaskGraph**
> updateTaskGraph(workspace, id, graph)



Update information about a single task graph execution. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String id = "id_example"; // String | The UUID of the task graph entry.
    TaskGraph graph = new TaskGraph(); // TaskGraph | Updates to make to the task graph.
    try {
      apiInstance.updateTaskGraph(workspace, id, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#updateTaskGraph");
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
| **graph** | [**TaskGraph**](TaskGraph.md)| Updates to make to the task graph. | |

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
| **204** | Task graph created successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

