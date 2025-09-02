# FoldersApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolder**](FoldersApi.md#createFolder) | **POST** /folders/{workspace}/{teamspace}/{folder} | Create a folder in the given teamspace |
| [**deleteFolder**](FoldersApi.md#deleteFolder) | **DELETE** /folders/{workspace}/{teamspace}/{folder} | Delete a folder |
| [**getFolder**](FoldersApi.md#getFolder) | **GET** /folders/{workspace}/{teamspace}/{folder} | Retrieve a folder&#39;s content |
| [**getFolderContents**](FoldersApi.md#getFolderContents) | **GET** /folders/{workspace}/{teamspace}/{folder}/contents | Retrieve a folder |
| [**modifyFolderContents**](FoldersApi.md#modifyFolderContents) | **PUT** /folders/{workspace}/{teamspace}/{folder}/contents | Add or remove assets under a folder |
| [**updateFolder**](FoldersApi.md#updateFolder) | **PATCH** /folders/{workspace}/{teamspace}/{folder} | Update the given folder |


<a id="createFolder"></a>
# **createFolder**
> FolderCreateResponse createFolder(workspace, teamspace, folder, folderCreateRequestInner)

Create a folder in the given teamspace

Create a new folder in the given teamspace 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    FolderCreateRequestInner folderCreateRequestInner = new FolderCreateRequestInner(); // FolderCreateRequestInner | folder to create
    try {
      FolderCreateResponse result = apiInstance.createFolder(workspace, teamspace, folder, folderCreateRequestInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#createFolder");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |
| **folderCreateRequestInner** | [**FolderCreateRequestInner**](FolderCreateRequestInner.md)| folder to create | |

### Return type

[**FolderCreateResponse**](FolderCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful folder response |  -  |
| **0** | error response |  -  |

<a id="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(workspace, teamspace, folder, deleteAssets)

Delete a folder

delete a folder

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    Boolean deleteAssets = false; // Boolean | If `true`, the entity's assets will be deregistered in TileDB *and* deleted from the underlying storage (e.g., S3). If `false`, the entity's assets will be deregistered in TileDB but remain in the underlying storage. 
    try {
      apiInstance.deleteFolder(workspace, teamspace, folder, deleteAssets);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#deleteFolder");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |
| **deleteAssets** | **Boolean**| If &#x60;true&#x60;, the entity&#39;s assets will be deregistered in TileDB *and* deleted from the underlying storage (e.g., S3). If &#x60;false&#x60;, the entity&#39;s assets will be deregistered in TileDB but remain in the underlying storage.  | [optional] [default to false] |

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
| **204** | folder deleted |  -  |
| **0** | error response |  -  |

<a id="getFolder"></a>
# **getFolder**
> FolderGetResponse getFolder(workspace, teamspace, folder)

Retrieve a folder&#39;s content

Retrieve the given folder&#39;s content

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    try {
      FolderGetResponse result = apiInstance.getFolder(workspace, teamspace, folder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#getFolder");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |

### Return type

[**FolderGetResponse**](FolderGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder retrieved |  -  |
| **404** | Folder does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="getFolderContents"></a>
# **getFolderContents**
> FolderContentsResponse getFolderContents(workspace, teamspace, folder)

Retrieve a folder

Retrieve the given folder

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    try {
      FolderContentsResponse result = apiInstance.getFolderContents(workspace, teamspace, folder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#getFolderContents");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |

### Return type

[**FolderContentsResponse**](FolderContentsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Folder contents retrieved |  -  |
| **404** | Folder does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="modifyFolderContents"></a>
# **modifyFolderContents**
> modifyFolderContents(workspace, teamspace, folder, foldersContentsModifyInner)

Add or remove assets under a folder

Add or remove assets under a folder 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    FoldersContentsModifyInner foldersContentsModifyInner = new FoldersContentsModifyInner(); // FoldersContentsModifyInner | assets to add or remove
    try {
      apiInstance.modifyFolderContents(workspace, teamspace, folder, foldersContentsModifyInner);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#modifyFolderContents");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |
| **foldersContentsModifyInner** | [**FoldersContentsModifyInner**](FoldersContentsModifyInner.md)| assets to add or remove | |

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
| **204** | Folder contents modified successfully |  -  |
| **0** | error response |  -  |

<a id="updateFolder"></a>
# **updateFolder**
> updateFolder(workspace, teamspace, folder, folderUpdateRequest)

Update the given folder

Update a folder

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.FoldersApi;

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

    FoldersApi apiInstance = new FoldersApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String folder = "folder_example"; // String | The path to the folder or the folder's assetID
    FolderUpdateRequest folderUpdateRequest = new FolderUpdateRequest(); // FolderUpdateRequest | The request body containing the folder to update
    try {
      apiInstance.updateFolder(workspace, teamspace, folder, folderUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#updateFolder");
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
| **folder** | **String**| The path to the folder or the folder&#39;s assetID | |
| **folderUpdateRequest** | [**FolderUpdateRequest**](FolderUpdateRequest.md)| The request body containing the folder to update | |

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
| **204** | Folder updated |  -  |
| **0** | An error occurred |  -  |

