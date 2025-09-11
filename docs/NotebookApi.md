# NotebookApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNotebookServerStatus**](NotebookApi.md#getNotebookServerStatus) | **GET** /notebooks/server/{workspace}/{teamspace}/status |  |
| [**handleCopyNotebook**](NotebookApi.md#handleCopyNotebook) | **POST** /notebooks/{workspace}/{teamspace}/{array}/copy |  |
| [**handleUploadNotebook**](NotebookApi.md#handleUploadNotebook) | **POST** /notebooks/{workspace}/{teamspace}/upload |  |
| [**shutdownNotebookServer**](NotebookApi.md#shutdownNotebookServer) | **DELETE** /notebooks/server/{workspace}/{teamspace} |  |
| [**updateNotebookName**](NotebookApi.md#updateNotebookName) | **PATCH** /notebooks/{workspace}/{teamspace}/{array}/rename |  |


<a id="getNotebookServerStatus"></a>
# **getNotebookServerStatus**
> NotebookStatus getNotebookServerStatus(workspace, teamspace)



Get status of the notebook server

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebookApi;

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

    NotebookApi apiInstance = new NotebookApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    try {
      NotebookStatus result = apiInstance.getNotebookServerStatus(workspace, teamspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebookApi#getNotebookServerStatus");
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

### Return type

[**NotebookStatus**](NotebookStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | status of running notebook |  -  |
| **402** | Payment required |  -  |
| **404** | Notebook is not running |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="handleCopyNotebook"></a>
# **handleCopyNotebook**
> NotebookCopied handleCopyNotebook(workspace, teamspace, array, notebookCopy, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, endTimestamp)



Copy a tiledb notebook at the specified location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebookApi;

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

    NotebookApi apiInstance = new NotebookApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | The name of the notebook
    NotebookCopy notebookCopy = new NotebookCopy(); // NotebookCopy | Input/Output information to create a new TileDB file
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    Integer endTimestamp = 56; // Integer | Milliseconds since Unix epoch, copy will use open_at functionality to copy notebook created at the specific timestamp
    try {
      NotebookCopied result = apiInstance.handleCopyNotebook(workspace, teamspace, array, notebookCopy, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, endTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebookApi#handleCopyNotebook");
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
| **array** | **String**| The name of the notebook | |
| **notebookCopy** | [**NotebookCopy**](NotebookCopy.md)| Input/Output information to create a new TileDB file | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |
| **endTimestamp** | **Integer**| Milliseconds since Unix epoch, copy will use open_at functionality to copy notebook created at the specific timestamp | [optional] |

### Return type

[**NotebookCopied**](NotebookCopied.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Notebook copied |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="handleUploadNotebook"></a>
# **handleUploadNotebook**
> FileUploaded handleUploadNotebook(workspace, teamspace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name)



Upload a notebook at the specified location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebookApi;

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

    NotebookApi apiInstance = new NotebookApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    File inputFile = new File("/path/to/file"); // File | the notebook to upload
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    String outputUri = "outputUri_example"; // String | output location of the TileDB File
    String name = "name_example"; // String | name to set for registered file
    try {
      FileUploaded result = apiInstance.handleUploadNotebook(workspace, teamspace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebookApi#handleUploadNotebook");
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
| **inputFile** | **File**| the notebook to upload | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |
| **outputUri** | **String**| output location of the TileDB File | [optional] |
| **name** | **String**| name to set for registered file | [optional] |

### Return type

[**FileUploaded**](FileUploaded.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File uploaded |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="shutdownNotebookServer"></a>
# **shutdownNotebookServer**
> shutdownNotebookServer(workspace, teamspace)



Shutdown a notebook server

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebookApi;

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

    NotebookApi apiInstance = new NotebookApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    try {
      apiInstance.shutdownNotebookServer(workspace, teamspace);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebookApi#shutdownNotebookServer");
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
| **204** | Notebook shutdown successfully |  -  |
| **404** | Notebook is not running |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="updateNotebookName"></a>
# **updateNotebookName**
> updateNotebookName(workspace, teamspace, array, notebookMetadata)



update name on a notebok, moving related S3 object to new location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.NotebookApi;

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

    NotebookApi apiInstance = new NotebookApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | name/uri of notebook (array) that is url-encoded
    ArrayInfoUpdate notebookMetadata = new ArrayInfoUpdate(); // ArrayInfoUpdate | notebook (array) metadata to update
    try {
      apiInstance.updateNotebookName(workspace, teamspace, array, notebookMetadata);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebookApi#updateNotebookName");
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
| **array** | **String**| name/uri of notebook (array) that is url-encoded | |
| **notebookMetadata** | [**ArrayInfoUpdate**](ArrayInfoUpdate.md)| notebook (array) metadata to update | |

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
| **204** | notebook name updated successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

