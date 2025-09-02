# StoragesettingsApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStorageSetting**](StoragesettingsApi.md#createStorageSetting) | **POST** /storagesettings/{workspace} | Create a new storage setting |
| [**deleteStorageSettingByID**](StoragesettingsApi.md#deleteStorageSettingByID) | **DELETE** /storagesettings/{workspace}/{stset_id} | Delete storage setting |
| [**getStorageSettingByID**](StoragesettingsApi.md#getStorageSettingByID) | **GET** /storagesettings/{workspace}/{stset_id} | Get storage setting |
| [**listStorageSettings**](StoragesettingsApi.md#listStorageSettings) | **GET** /storagesettings/{workspace} | Get storage settings |
| [**patchStorageSettingByID**](StoragesettingsApi.md#patchStorageSettingByID) | **PATCH** /storagesettings/{workspace}/{stset_id} | Update storage setting |


<a id="createStorageSetting"></a>
# **createStorageSetting**
> StorageSettingsCreateResponse createStorageSetting(workspace, storageSettingsCreateRequest, teamspaceId)

Create a new storage setting

create a storage setting

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.StoragesettingsApi;

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

    StoragesettingsApi apiInstance = new StoragesettingsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    StorageSettingsCreateRequest storageSettingsCreateRequest = new StorageSettingsCreateRequest(); // StorageSettingsCreateRequest | The request body containing the storage setting to create
    String teamspaceId = "teamspaceId_example"; // String | Teamspace id should be empty, if the request is about an action on workspace level
    try {
      StorageSettingsCreateResponse result = apiInstance.createStorageSetting(workspace, storageSettingsCreateRequest, teamspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesettingsApi#createStorageSetting");
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
| **storageSettingsCreateRequest** | [**StorageSettingsCreateRequest**](StorageSettingsCreateRequest.md)| The request body containing the storage setting to create | |
| **teamspaceId** | **String**| Teamspace id should be empty, if the request is about an action on workspace level | [optional] |

### Return type

[**StorageSettingsCreateResponse**](StorageSettingsCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Storage settings created |  -  |
| **0** | error response |  -  |

<a id="deleteStorageSettingByID"></a>
# **deleteStorageSettingByID**
> deleteStorageSettingByID(stsetId, workspace, teamspaceId)

Delete storage setting

Delete the storage setting.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.StoragesettingsApi;

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

    StoragesettingsApi apiInstance = new StoragesettingsApi(defaultClient);
    String stsetId = "stsetId_example"; // String | The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspaceId = "teamspaceId_example"; // String | Teamspace id should be empty, if the request is about an action on workspace level
    try {
      apiInstance.deleteStorageSettingByID(stsetId, workspace, teamspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesettingsApi#deleteStorageSettingByID");
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
| **stsetId** | **String**| The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g | |
| **workspace** | **String**| The workspace name or id | |
| **teamspaceId** | **String**| Teamspace id should be empty, if the request is about an action on workspace level | [optional] |

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
| **204** | storage setting deleted |  -  |
| **0** | error response |  -  |

<a id="getStorageSettingByID"></a>
# **getStorageSettingByID**
> StorageSettingGetResponse getStorageSettingByID(stsetId, workspace, teamspaceId)

Get storage setting

get information about storage setting by ID

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.StoragesettingsApi;

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

    StoragesettingsApi apiInstance = new StoragesettingsApi(defaultClient);
    String stsetId = "stsetId_example"; // String | The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspaceId = "teamspaceId_example"; // String | Teamspace id should be empty, if the request is about an action on workspace level
    try {
      StorageSettingGetResponse result = apiInstance.getStorageSettingByID(stsetId, workspace, teamspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesettingsApi#getStorageSettingByID");
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
| **stsetId** | **String**| The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g | |
| **workspace** | **String**| The workspace name or id | |
| **teamspaceId** | **String**| Teamspace id should be empty, if the request is about an action on workspace level | [optional] |

### Return type

[**StorageSettingGetResponse**](StorageSettingGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful storage setting response |  -  |
| **404** | Storage setting does not exist |  -  |
| **0** | error response |  -  |

<a id="listStorageSettings"></a>
# **listStorageSettings**
> StorageSettingsListResponse listStorageSettings(workspace, teamspaceId, page, perPage)

Get storage settings

list the storage settings available for the user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.StoragesettingsApi;

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

    StoragesettingsApi apiInstance = new StoragesettingsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspaceId = "teamspaceId_example"; // String | Teamspace id should be empty, if the request is about an action on workspace level
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      StorageSettingsListResponse result = apiInstance.listStorageSettings(workspace, teamspaceId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesettingsApi#listStorageSettings");
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
| **teamspaceId** | **String**| Teamspace id should be empty, if the request is about an action on workspace level | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**StorageSettingsListResponse**](StorageSettingsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful storage settings list response |  -  |
| **0** | error response |  -  |

<a id="patchStorageSettingByID"></a>
# **patchStorageSettingByID**
> patchStorageSettingByID(stsetId, workspace, storageSettingUpdateRequest, teamspaceId)

Update storage setting

update storage setting given by the user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.StoragesettingsApi;

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

    StoragesettingsApi apiInstance = new StoragesettingsApi(defaultClient);
    String stsetId = "stsetId_example"; // String | The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    StorageSettingUpdateRequest storageSettingUpdateRequest = new StorageSettingUpdateRequest(); // StorageSettingUpdateRequest | storage setting update details
    String teamspaceId = "teamspaceId_example"; // String | Teamspace id should be empty, if the request is about an action on workspace level
    try {
      apiInstance.patchStorageSettingByID(stsetId, workspace, storageSettingUpdateRequest, teamspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesettingsApi#patchStorageSettingByID");
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
| **stsetId** | **String**| The storage setting id in the form stset_9m4e2mr0ui3e8a215n4g | |
| **workspace** | **String**| The workspace name or id | |
| **storageSettingUpdateRequest** | [**StorageSettingUpdateRequest**](StorageSettingUpdateRequest.md)| storage setting update details | |
| **teamspaceId** | **String**| Teamspace id should be empty, if the request is about an action on workspace level | [optional] |

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
| **204** | The storage setting was updated successfully |  -  |
| **404** | Storage setting does not exist |  -  |
| **0** | error response |  -  |

