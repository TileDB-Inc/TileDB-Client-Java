# RegisteredTaskGraphsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#deleteRegisteredTaskGraph) | **DELETE** /taskgraphs/{workspace}/registered/{name} |  |
| [**getRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#getRegisteredTaskGraph) | **GET** /taskgraphs/{workspace}/registered/{name} |  |
| [**getRegisteredTaskGraphSharingPolicies**](RegisteredTaskGraphsApi.md#getRegisteredTaskGraphSharingPolicies) | **GET** /taskgraphs/{workspace}/registered/{name}/share |  |
| [**registerRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#registerRegisteredTaskGraph) | **POST** /taskgraphs/{workspace}/registered/{name} |  |
| [**shareRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#shareRegisteredTaskGraph) | **PATCH** /taskgraphs/{workspace}/registered/{name}/share |  |
| [**updateRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#updateRegisteredTaskGraph) | **PATCH** /taskgraphs/{workspace}/registered/{name} |  |


<a id="deleteRegisteredTaskGraph"></a>
# **deleteRegisteredTaskGraph**
> deleteRegisteredTaskGraph(workspace, name)



Delete the given registered task graph. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String name = "name_example"; // String | The name of the registered task graph.
    try {
      apiInstance.deleteRegisteredTaskGraph(workspace, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#deleteRegisteredTaskGraph");
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
| **name** | **String**| The name of the registered task graph. | |

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
| **204** | Task graph successfully deleted. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getRegisteredTaskGraph"></a>
# **getRegisteredTaskGraph**
> RegisteredTaskGraph getRegisteredTaskGraph(workspace, name)



Fetch the contents of this registered task graph. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String name = "name_example"; // String | The name of the registered task graph.
    try {
      RegisteredTaskGraph result = apiInstance.getRegisteredTaskGraph(workspace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#getRegisteredTaskGraph");
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
| **name** | **String**| The name of the registered task graph. | |

### Return type

[**RegisteredTaskGraph**](RegisteredTaskGraph.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The contents of the registered task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getRegisteredTaskGraphSharingPolicies"></a>
# **getRegisteredTaskGraphSharingPolicies**
> List&lt;TaskGraphSharing&gt; getRegisteredTaskGraphSharingPolicies(workspace, name)



Get sharing policies for the task graph.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | The workspace that owns the registered task graph.
    String name = "name_example"; // String | The name of the task graph.
    try {
      List<TaskGraphSharing> result = apiInstance.getRegisteredTaskGraphSharingPolicies(workspace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#getRegisteredTaskGraphSharingPolicies");
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
| **workspace** | **String**| The workspace that owns the registered task graph. | |
| **name** | **String**| The name of the task graph. | |

### Return type

[**List&lt;TaskGraphSharing&gt;**](TaskGraphSharing.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all specific sharing policies |  -  |
| **404** | The task graph does not exist (or the user does not have permission to view policies)  |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="registerRegisteredTaskGraph"></a>
# **registerRegisteredTaskGraph**
> registerRegisteredTaskGraph(workspace, name, graph)



Register a task graph in the given namespace, with the given name. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String name = "name_example"; // String | The name of the registered task graph.
    RegisteredTaskGraph graph = new RegisteredTaskGraph(); // RegisteredTaskGraph | Task graph to register.
    try {
      apiInstance.registerRegisteredTaskGraph(workspace, name, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#registerRegisteredTaskGraph");
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
| **name** | **String**| The name of the registered task graph. | |
| **graph** | [**RegisteredTaskGraph**](RegisteredTaskGraph.md)| Task graph to register. | [optional] |

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
| **204** | Task graph registered successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="shareRegisteredTaskGraph"></a>
# **shareRegisteredTaskGraph**
> shareRegisteredTaskGraph(workspace, name, taskGraphSharing)



Share a task graph.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | The workspace that owns the registered task graph.
    String name = "name_example"; // String | The name of the task graph.
    TaskGraphSharing taskGraphSharing = new TaskGraphSharing(); // TaskGraphSharing | Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the UDF will not be shared with the namespace at all. 
    try {
      apiInstance.shareRegisteredTaskGraph(workspace, name, taskGraphSharing);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#shareRegisteredTaskGraph");
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
| **workspace** | **String**| The workspace that owns the registered task graph. | |
| **name** | **String**| The name of the task graph. | |
| **taskGraphSharing** | [**TaskGraphSharing**](TaskGraphSharing.md)| Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the UDF will not be shared with the namespace at all.  | |

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
| **204** | UDF shared successfully |  -  |
| **404** | UDF does not exist or user does not have permissions to share UDF |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="updateRegisteredTaskGraph"></a>
# **updateRegisteredTaskGraph**
> updateRegisteredTaskGraph(workspace, name, graph)



Update the contents of an existing registered task graph. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String name = "name_example"; // String | The name of the registered task graph.
    RegisteredTaskGraph graph = new RegisteredTaskGraph(); // RegisteredTaskGraph | The new contents of the task graph.
    try {
      apiInstance.updateRegisteredTaskGraph(workspace, name, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#updateRegisteredTaskGraph");
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
| **name** | **String**| The name of the registered task graph. | |
| **graph** | [**RegisteredTaskGraph**](RegisteredTaskGraph.md)| The new contents of the task graph. | [optional] |

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
| **204** | Task graph updated successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

