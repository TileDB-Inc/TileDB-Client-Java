# AssetsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeAssetCredentials**](AssetsApi.md#changeAssetCredentials) | **POST** /assets/{workspace}/{teamspace}/change_credentials |  |
| [**listAssets**](AssetsApi.md#listAssets) | **GET** /assets/{workspace}/{teamspace} |  |
| [**listPublicAssets**](AssetsApi.md#listPublicAssets) | **GET** /public_assets |  |


<a id="changeAssetCredentials"></a>
# **changeAssetCredentials**
> changeAssetCredentials(workspace, teamspace, changeCredentialsRequest)



Changes the access credentials to the given assets

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.AssetsApi;

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

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    ChangeAssetCredentialsRequest changeCredentialsRequest = new ChangeAssetCredentialsRequest(); // ChangeAssetCredentialsRequest | aws access credentials to store for a namespace
    try {
      apiInstance.changeAssetCredentials(workspace, teamspace, changeCredentialsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#changeAssetCredentials");
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
| **changeCredentialsRequest** | [**ChangeAssetCredentialsRequest**](ChangeAssetCredentialsRequest.md)| aws access credentials to store for a namespace | |

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
| **204** | Credentials changed successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listAssets"></a>
# **listAssets**
> AssetListResponse listAssets(workspace, teamspace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand)



List assets in a namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.AssetsApi;

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

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String assetType = "assetType_example"; // String | asset_type to filter to
    String ownershipLevel = "ownershipLevel_example"; // String | ownership_level to filter to (owned, shared)
    String depth = "depth_example"; // String | depth of assets to be returned
    String search = "search_example"; // String | search string
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String orderBy = "orderBy_example"; // String | order by a specific property, defaults to `created_at desc` supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. `name asc` `name desc` etc. 
    String expand = "expand_example"; // String | expansion option for the AssetInfo object to be added to the response
    try {
      AssetListResponse result = apiInstance.listAssets(workspace, teamspace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#listAssets");
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
| **assetType** | **String**| asset_type to filter to | [optional] |
| **ownershipLevel** | **String**| ownership_level to filter to (owned, shared) | [optional] |
| **depth** | **String**| depth of assets to be returned | [optional] |
| **search** | **String**| search string | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **orderBy** | **String**| order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  | [optional] |
| **expand** | **String**| expansion option for the AssetInfo object to be added to the response | [optional] |

### Return type

[**AssetListResponse**](AssetListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful list of assets |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listPublicAssets"></a>
# **listPublicAssets**
> AssetListResponse listPublicAssets(assetType, depth, search, page, perPage, orderBy)



List public assets

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.AssetsApi;

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

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String assetType = "assetType_example"; // String | asset_type to filter to
    String depth = "depth_example"; // String | depth of assets to be returned
    String search = "search_example"; // String | search string
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String orderBy = "orderBy_example"; // String | order by a specific property, defaults to `created_at desc` supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. `name asc` `name desc` etc. 
    try {
      AssetListResponse result = apiInstance.listPublicAssets(assetType, depth, search, page, perPage, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#listPublicAssets");
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
| **assetType** | **String**| asset_type to filter to | [optional] |
| **depth** | **String**| depth of assets to be returned | [optional] |
| **search** | **String**| search string | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **orderBy** | **String**| order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  | [optional] |

### Return type

[**AssetListResponse**](AssetListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful list of assets |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

