# GeneralspacesApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGeneralSpace**](GeneralspacesApi.md#getGeneralSpace) | **GET** /generalspaces/{workspace}/{generalspace} | Retrieve a generalspace |
| [**getGeneralspaceByWorkspace**](GeneralspacesApi.md#getGeneralspaceByWorkspace) | **GET** /generalspaces/{workspace} | Retrieve a generalspace |
| [**updateGeneralspaceByID**](GeneralspacesApi.md#updateGeneralspaceByID) | **PATCH** /generalspaces/{workspace}/{generalspace} | Update the given generalspace |
| [**updateGeneralspaceByWorkspace**](GeneralspacesApi.md#updateGeneralspaceByWorkspace) | **PATCH** /generalspaces/{workspace} | Update the given generalspace |


<a id="getGeneralSpace"></a>
# **getGeneralSpace**
> GeneralspaceGetResponse getGeneralSpace(workspace, generalspace)

Retrieve a generalspace

Retrieve the given general space

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.GeneralspacesApi;

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

    GeneralspacesApi apiInstance = new GeneralspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String generalspace = "ts_9m4e2mr0ui3e8a215n4g or general"; // String | The generalspace id or name
    try {
      GeneralspaceGetResponse result = apiInstance.getGeneralSpace(workspace, generalspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralspacesApi#getGeneralSpace");
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
| **generalspace** | **String**| The generalspace id or name | |

### Return type

[**GeneralspaceGetResponse**](GeneralspaceGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Generalspace retrieved |  -  |
| **404** | Generalspace does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="getGeneralspaceByWorkspace"></a>
# **getGeneralspaceByWorkspace**
> GeneralspaceGetResponse getGeneralspaceByWorkspace(workspace)

Retrieve a generalspace

Retrieve the given general space

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.GeneralspacesApi;

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

    GeneralspacesApi apiInstance = new GeneralspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    try {
      GeneralspaceGetResponse result = apiInstance.getGeneralspaceByWorkspace(workspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralspacesApi#getGeneralspaceByWorkspace");
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

### Return type

[**GeneralspaceGetResponse**](GeneralspaceGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Generalspace retrieved |  -  |
| **404** | Generalspace does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="updateGeneralspaceByID"></a>
# **updateGeneralspaceByID**
> updateGeneralspaceByID(workspace, generalspace, generalspaceUpdateRequest)

Update the given generalspace

Update a generalspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.GeneralspacesApi;

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

    GeneralspacesApi apiInstance = new GeneralspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String generalspace = "ts_9m4e2mr0ui3e8a215n4g or general"; // String | The generalspace id or name
    GeneralspaceUpdateRequest generalspaceUpdateRequest = new GeneralspaceUpdateRequest(); // GeneralspaceUpdateRequest | The request body containing the generalspace to update
    try {
      apiInstance.updateGeneralspaceByID(workspace, generalspace, generalspaceUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralspacesApi#updateGeneralspaceByID");
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
| **generalspace** | **String**| The generalspace id or name | |
| **generalspaceUpdateRequest** | [**GeneralspaceUpdateRequest**](GeneralspaceUpdateRequest.md)| The request body containing the generalspace to update | |

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
| **204** | Generalspace updated |  -  |
| **0** | An error occurred |  -  |

<a id="updateGeneralspaceByWorkspace"></a>
# **updateGeneralspaceByWorkspace**
> updateGeneralspaceByWorkspace(workspace, generalspaceUpdateRequest)

Update the given generalspace

Update a generalspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.GeneralspacesApi;

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

    GeneralspacesApi apiInstance = new GeneralspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    GeneralspaceUpdateRequest generalspaceUpdateRequest = new GeneralspaceUpdateRequest(); // GeneralspaceUpdateRequest | The request body containing the generalspace to update
    try {
      apiInstance.updateGeneralspaceByWorkspace(workspace, generalspaceUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralspacesApi#updateGeneralspaceByWorkspace");
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
| **generalspaceUpdateRequest** | [**GeneralspaceUpdateRequest**](GeneralspaceUpdateRequest.md)| The request body containing the generalspace to update | |

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
| **204** | Generalspace updated |  -  |
| **0** | An error occurred |  -  |

