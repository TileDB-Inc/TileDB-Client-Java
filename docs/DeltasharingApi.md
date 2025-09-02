# DeltasharingApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShare**](DeltasharingApi.md#getShare) | **GET** /deltasharing/shares/{workspace} | get a delta share |
| [**listShareAllTables**](DeltasharingApi.md#listShareAllTables) | **GET** /deltasharing/shares/{workspace}/all-tables | list delta share schema tables |
| [**listShareSchemaTables**](DeltasharingApi.md#listShareSchemaTables) | **GET** /deltasharing/shares/{workspace}/schemas/{teamspace}/tables | list delta share schema tables |
| [**listShareSchemas**](DeltasharingApi.md#listShareSchemas) | **GET** /deltasharing/shares/{workspace}/schemas | list delta share schemas |
| [**listShares**](DeltasharingApi.md#listShares) | **GET** /deltasharing/shares | list delta shares |
| [**queryTable**](DeltasharingApi.md#queryTable) | **POST** /deltasharing/shares/{workspace}/schemas/{teamspace}/tables/{asset}/query | query table |
| [**queryTableChanges**](DeltasharingApi.md#queryTableChanges) | **GET** /deltasharing/shares/{workspace}/schemas/{teamspace}/tables/{asset}/changes | query table changes |
| [**queryTableMetadata**](DeltasharingApi.md#queryTableMetadata) | **GET** /deltasharing/shares/{workspace}/schemas/{teamspace}/tables/{asset}/metadata | fetch table metadata |
| [**queryTableVerison**](DeltasharingApi.md#queryTableVerison) | **GET** /deltasharing/shares/{workspace}/schemas/{teamspace}/tables/{asset}/version | fetch table version |


<a id="getShare"></a>
# **getShare**
> ShareResponse getShare(workspace)

get a delta share

This is the API to get the metadata of a share.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    try {
      ShareResponse result = apiInstance.getShare(workspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#getShare");
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

[**ShareResponse**](ShareResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched share details |  -  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="listShareAllTables"></a>
# **listShareAllTables**
> ListTablesResponse listShareAllTables(workspace, maxResults, pageToken)

list delta share schema tables

This is the API to list tables in a schema.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    Integer maxResults = 56; // Integer | The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated.
    String pageToken = "pageToken_example"; // String | Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available.
    try {
      ListTablesResponse result = apiInstance.listShareAllTables(workspace, maxResults, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#listShareAllTables");
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
| **maxResults** | **Integer**| The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated. | [optional] |
| **pageToken** | **String**| Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available. | [optional] |

### Return type

[**ListTablesResponse**](ListTablesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched listing of share schema tables |  -  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="listShareSchemaTables"></a>
# **listShareSchemaTables**
> ListShareSchemaTablesResponse listShareSchemaTables(workspace, teamspace, maxResults, pageToken)

list delta share schema tables

This is the API to list tables in a schema.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    Integer maxResults = 56; // Integer | The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated.
    String pageToken = "pageToken_example"; // String | Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available.
    try {
      ListShareSchemaTablesResponse result = apiInstance.listShareSchemaTables(workspace, teamspace, maxResults, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#listShareSchemaTables");
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
| **teamspace** | **String**| The teamspace name or id | |
| **maxResults** | **Integer**| The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated. | [optional] |
| **pageToken** | **String**| Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available. | [optional] |

### Return type

[**ListShareSchemaTablesResponse**](ListShareSchemaTablesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched listing of share schema tables |  -  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="listShareSchemas"></a>
# **listShareSchemas**
> ListShareSchemasResponse listShareSchemas(workspace, maxResults, pageToken)

list delta share schemas

This is the API to list schemas in a share.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    Integer maxResults = 56; // Integer | The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated.
    String pageToken = "pageToken_example"; // String | Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available.
    try {
      ListShareSchemasResponse result = apiInstance.listShareSchemas(workspace, maxResults, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#listShareSchemas");
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
| **maxResults** | **Integer**| The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated. | [optional] |
| **pageToken** | **String**| Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available. | [optional] |

### Return type

[**ListShareSchemasResponse**](ListShareSchemasResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched listing of share schemas |  -  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="listShares"></a>
# **listShares**
> ListSharesResponse listShares(maxResults, pageToken)

list delta shares

This is the API to list shares accessible to a recipient.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    Integer maxResults = 56; // Integer | The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated.
    String pageToken = "pageToken_example"; // String | Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available.
    try {
      ListSharesResponse result = apiInstance.listShares(maxResults, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#listShares");
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
| **maxResults** | **Integer**| The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, the response will provide a nextPageToken that can be used to get the next page of results in subsequent list requests. The server may return fewer than maxResults items even if there are more available. The client should check nextPageToken in the response to determine if there are more available. Must be non-negative. 0 will return no results but nextPageToken may be populated. | [optional] |
| **pageToken** | **String**| Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results. nextPageToken will not be returned in a response if there are no more results available. | [optional] |

### Return type

[**ListSharesResponse**](ListSharesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched listing of shares |  -  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="queryTable"></a>
# **queryTable**
> QueryTableResponse queryTable(workspace, teamspace, asset, queryTableRequest)

query table

This is the API for clients to read data from a table.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    QueryTableRequest queryTableRequest = new QueryTableRequest(); // QueryTableRequest | query table request
    try {
      QueryTableResponse result = apiInstance.queryTable(workspace, teamspace, asset, queryTableRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#queryTable");
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
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |
| **queryTableRequest** | [**QueryTableRequest**](QueryTableRequest.md)| query table request | |

### Return type

[**QueryTableResponse**](QueryTableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/x-ndjson, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully queried table |  * Delta-Table-Version - version of table <br>  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="queryTableChanges"></a>
# **queryTableChanges**
> QueryTableChangeResponse queryTableChanges(workspace, teamspace, asset, startingVersion, startingTimestamp, endingVersion, endingTimestamp, includeHistoricalMetadata)

query table changes

This is the API for clients to read change data feed from a table.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    Long startingVersion = 56L; // Long | The starting version of the query, inclusive
    String startingTimestamp = "startingTimestamp_example"; // String | The starting timestamp of the query, a string in the Timestamp Format, which will be converted to a version created greater or equal to this timestamp.
    Long endingVersion = 56L; // Long | The ending version of the query, inclusive
    String endingTimestamp = "endingTimestamp_example"; // String | The ending timestamp of the query, a string in the Timestamp Format, which will be converted to a version created earlier than or at the timestamp.
    Boolean includeHistoricalMetadata = false; // Boolean | If set to true, return the historical metadata if seen in the delta log. This is for the streaming client to check if the table schema is still read compatible.
    try {
      QueryTableChangeResponse result = apiInstance.queryTableChanges(workspace, teamspace, asset, startingVersion, startingTimestamp, endingVersion, endingTimestamp, includeHistoricalMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#queryTableChanges");
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
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |
| **startingVersion** | **Long**| The starting version of the query, inclusive | [optional] |
| **startingTimestamp** | **String**| The starting timestamp of the query, a string in the Timestamp Format, which will be converted to a version created greater or equal to this timestamp. | [optional] |
| **endingVersion** | **Long**| The ending version of the query, inclusive | [optional] |
| **endingTimestamp** | **String**| The ending timestamp of the query, a string in the Timestamp Format, which will be converted to a version created earlier than or at the timestamp. | [optional] |
| **includeHistoricalMetadata** | **Boolean**| If set to true, return the historical metadata if seen in the delta log. This is for the streaming client to check if the table schema is still read compatible. | [optional] [default to false] |

### Return type

[**QueryTableChangeResponse**](QueryTableChangeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-ndjson, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully queried table changes |  * Delta-Table-Version - version of table <br>  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="queryTableMetadata"></a>
# **queryTableMetadata**
> TableMetadataResponse queryTableMetadata(workspace, teamspace, asset)

fetch table metadata

This is the API for clients to query the table schema and other metadata.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    try {
      TableMetadataResponse result = apiInstance.queryTableMetadata(workspace, teamspace, asset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#queryTableMetadata");
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
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |

### Return type

[**TableMetadataResponse**](TableMetadataResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-ndjson, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched table metadata |  * Delta-Table-Version - version of table <br>  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

<a id="queryTableVerison"></a>
# **queryTableVerison**
> queryTableVerison(workspace, teamspace, asset, startingTimestamp)

fetch table version

This is the API for clients to get a table version without any other extra information

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.DeltasharingApi;

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

    DeltasharingApi apiInstance = new DeltasharingApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    String startingTimestamp = "startingTimestamp_example"; // String | The startingTimestamp of the query, a string in the Timestamp Format, the server needs to return the earliest table version at or after the provided timestamp, can be earlier than the timestamp of table version 0.
    try {
      apiInstance.queryTableVerison(workspace, teamspace, asset, startingTimestamp);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeltasharingApi#queryTableVerison");
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
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |
| **startingTimestamp** | **String**| The startingTimestamp of the query, a string in the Timestamp Format, the server needs to return the earliest table version at or after the provided timestamp, can be earlier than the timestamp of table version 0. | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched table version |  * Delta-Table-Version - version of table <br>  |
| **400** | The request is malformed. |  -  |
| **401** | The request is unauthenticated. The bearer token is missing or incorrect. |  -  |
| **403** | The request is forbidden from being fulfilled. |  -  |
| **404** | The requested resource does not exist. |  -  |
| **500** | The request is not handled correctly due to a server error. |  -  |
| **0** | error response |  -  |

