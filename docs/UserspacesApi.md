# UserspacesApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserspace**](UserspacesApi.md#getUserspace) | **GET** /userspaces/{workspace}/{userspace} | Retrieve a userspace |
| [**updateUserspace**](UserspacesApi.md#updateUserspace) | **PATCH** /userspaces/{workspace}/{userspace} | Update the given userspace |


<a id="getUserspace"></a>
# **getUserspace**
> UserspaceGetResponse getUserspace(workspace, userspace)

Retrieve a userspace

Retrieve the given userspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.UserspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserspacesApi apiInstance = new UserspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String userspace = "ts_9m4e2mr0ui3e8a215n4g or alice"; // String | The userspace id or the user's username
    try {
      UserspaceGetResponse result = apiInstance.getUserspace(workspace, userspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserspacesApi#getUserspace");
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
| **workspace** | **String**| The workspace name or id | |
| **userspace** | **String**| The userspace id or the user&#39;s username | |

### Return type

[**UserspaceGetResponse**](UserspaceGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Userspace retrieved |  -  |
| **404** | Userspace does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="updateUserspace"></a>
# **updateUserspace**
> updateUserspace(workspace, userspace, userspaceUpdateRequest)

Update the given userspace

Update a userspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.UserspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserspacesApi apiInstance = new UserspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String userspace = "ts_9m4e2mr0ui3e8a215n4g or alice"; // String | The userspace id or the user's username
    UserspaceUpdateRequest userspaceUpdateRequest = new UserspaceUpdateRequest(); // UserspaceUpdateRequest | The request body containing the userspace to update
    try {
      apiInstance.updateUserspace(workspace, userspace, userspaceUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserspacesApi#updateUserspace");
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
| **workspace** | **String**| The workspace name or id | |
| **userspace** | **String**| The userspace id or the user&#39;s username | |
| **userspaceUpdateRequest** | [**UserspaceUpdateRequest**](UserspaceUpdateRequest.md)| The request body containing the userspace to update | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Userspace updated |  -  |
| **0** | An error occurred |  -  |

