# NotebooksApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notebooksWorkspaceTeamspaceArrayEndTimestampsGet**](NotebooksApi.md#notebooksWorkspaceTeamspaceArrayEndTimestampsGet) | **GET** /notebooks/{workspace}/{teamspace}/{array}/end_timestamps |  |
| [**notebooksWorkspaceTeamspaceArrayPrunePost**](NotebooksApi.md#notebooksWorkspaceTeamspaceArrayPrunePost) | **POST** /notebooks/{workspace}/{teamspace}/{array}/prune |  |


<a id="notebooksWorkspaceTeamspaceArrayEndTimestampsGet"></a>
# **notebooksWorkspaceTeamspaceArrayEndTimestampsGet**
> ArrayEndTimestampData notebooksWorkspaceTeamspaceArrayEndTimestampsGet(workspace, teamspace, array, page, perPage)



retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebooksApi;

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

    NotebooksApi apiInstance = new NotebooksApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      ArrayEndTimestampData result = apiInstance.notebooksWorkspaceTeamspaceArrayEndTimestampsGet(workspace, teamspace, array, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#notebooksWorkspaceTeamspaceArrayEndTimestampsGet");
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
| **array** | **String**| name/uri of array that is url-encoded | |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**ArrayEndTimestampData**](ArrayEndTimestampData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of timestamps in milliseconds, paginated |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="notebooksWorkspaceTeamspaceArrayPrunePost"></a>
# **notebooksWorkspaceTeamspaceArrayPrunePost**
> notebooksWorkspaceTeamspaceArrayPrunePost(workspace, teamspace, array, keepVersions)



prune fragments of the notebook

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebooksApi;

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

    NotebooksApi apiInstance = new NotebooksApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer keepVersions = 56; // Integer | The number of most recents fragment to preserve
    try {
      apiInstance.notebooksWorkspaceTeamspaceArrayPrunePost(workspace, teamspace, array, keepVersions);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#notebooksWorkspaceTeamspaceArrayPrunePost");
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
| **array** | **String**| name/uri of array that is url-encoded | |
| **keepVersions** | **Integer**| The number of most recents fragment to preserve | [optional] |

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
| **204** | notebook pruned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

