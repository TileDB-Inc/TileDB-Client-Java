# TasksApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runSQL**](TasksApi.md#runSQL) | **POST** /sql/{workspace}/{teamspace} |  |
| [**taskIdGet**](TasksApi.md#taskIdGet) | **GET** /task/{id} |  |
| [**taskIdResultGet**](TasksApi.md#taskIdResultGet) | **GET** /task/{id}/result |  |
| [**tasksGet**](TasksApi.md#tasksGet) | **GET** /tasks |  |


<a id="runSQL"></a>
# **runSQL**
> List&lt;Map&lt;String, Object&gt;&gt; runSQL(workspace, teamspace, sql, acceptEncoding)



Run a sql query

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the sql query belongs to
    SQLParameters sql = new SQLParameters(); // SQLParameters | sql being submitted
    String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
    try {
      List<Map<String, Object>> result = apiInstance.runSQL(workspace, teamspace, sql, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#runSQL");
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
| **teamspace** | **String**| the teamspace the sql query belongs to | |
| **sql** | [**SQLParameters**](SQLParameters.md)| sql being submitted | |
| **acceptEncoding** | **String**| Encoding to use | [optional] |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON results in array of objects form, if the query returns results |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **204** | SQL executed successfully |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="taskIdGet"></a>
# **taskIdGet**
> ArrayTask taskIdGet(id)



Fetch an array task

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String id = "id_example"; // String | task ID to fetch
    try {
      ArrayTask result = apiInstance.taskIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#taskIdGet");
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
| **id** | **String**| task ID to fetch | |

### Return type

[**ArrayTask**](ArrayTask.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array task |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="taskIdResultGet"></a>
# **taskIdResultGet**
> String taskIdResultGet(id, acceptEncoding)



Retrieve results of an array task

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String id = "id_example"; // String | task ID to retrieve stored results
    String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
    try {
      String result = apiInstance.taskIdResultGet(id, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#taskIdResultGet");
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
| **id** | **String**| task ID to retrieve stored results | |
| **acceptEncoding** | **String**| Encoding to use | [optional] |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | output and format of originating request |  * Content-Type - format results are delivered in <br>  |
| **202** | task is still executing |  -  |
| **404** | results were not saved, or results have expored |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="tasksGet"></a>
# **tasksGet**
> ArrayTaskData tasksGet(namespace, createdBy, array, start, end, page, perPage, type, excludeType, fileType, excludeFileType, status, search, orderby)



Fetch a list of all array tasks a user has access to

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace to filter
    String createdBy = "createdBy_example"; // String | username to filter
    String array = "array_example"; // String | name/uri of array that is url-encoded to filter
    Integer start = 56; // Integer | start time for tasks to filter by
    Integer end = 56; // Integer | end time for tasks to filter by
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String type = "type_example"; // String | task type, \"QUERY\", \"SQL\", \"UDF\", \"GENERIC_UDF\"
    List<String> excludeType = Arrays.asList(); // List<String> | task_type to exclude matching array in results, more than one can be included
    List<String> fileType = Arrays.asList(); // List<String> | match file_type of task array, more than one can be included
    List<String> excludeFileType = Arrays.asList(); // List<String> | exclude file_type of task arrays, more than one can be included
    String status = "status_example"; // String | Filter to only return these statuses
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String orderby = "orderby_example"; // String | sort by which field valid values include start_time, name
    try {
      ArrayTaskData result = apiInstance.tasksGet(namespace, createdBy, array, start, end, page, perPage, type, excludeType, fileType, excludeFileType, status, search, orderby);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#tasksGet");
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
| **namespace** | **String**| namespace to filter | [optional] |
| **createdBy** | **String**| username to filter | [optional] |
| **array** | **String**| name/uri of array that is url-encoded to filter | [optional] |
| **start** | **Integer**| start time for tasks to filter by | [optional] |
| **end** | **Integer**| end time for tasks to filter by | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **type** | **String**| task type, \&quot;QUERY\&quot;, \&quot;SQL\&quot;, \&quot;UDF\&quot;, \&quot;GENERIC_UDF\&quot; | [optional] |
| **excludeType** | [**List&lt;String&gt;**](String.md)| task_type to exclude matching array in results, more than one can be included | [optional] |
| **fileType** | [**List&lt;String&gt;**](String.md)| match file_type of task array, more than one can be included | [optional] |
| **excludeFileType** | [**List&lt;String&gt;**](String.md)| exclude file_type of task arrays, more than one can be included | [optional] |
| **status** | **String**| Filter to only return these statuses | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **orderby** | **String**| sort by which field valid values include start_time, name | [optional] |

### Return type

[**ArrayTaskData**](ArrayTaskData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of all tasks user has access too |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

