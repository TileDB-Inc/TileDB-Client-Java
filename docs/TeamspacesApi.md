# TeamspacesApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTeamspaceUsers**](TeamspacesApi.md#createTeamspaceUsers) | **POST** /teamspaces/{workspace}/{teamspace}/users | Create one or more teamspace users in a teamspace |
| [**createTeamspaces**](TeamspacesApi.md#createTeamspaces) | **POST** /teamspaces/{workspace} | Create a teamspace |
| [**deleteTeamspace**](TeamspacesApi.md#deleteTeamspace) | **DELETE** /teamspaces/{workspace}/{teamspace} | Delete a teamspace |
| [**deleteTeamspaceUser**](TeamspacesApi.md#deleteTeamspaceUser) | **DELETE** /teamspaces/{workspace}/{teamspace}/users/{user_id} | Delete a teamspace user |
| [**deleteTeamspaceUsers**](TeamspacesApi.md#deleteTeamspaceUsers) | **POST** /actions/teamspaces/{workspace}/{teamspace}/users/bulk_delete | Delete the given teamspace users in a teamspace |
| [**deleteTeamspaces**](TeamspacesApi.md#deleteTeamspaces) | **DELETE** /teamspaces/{workspace} | Delete all teamspaces in the workspace |
| [**getTeamspace**](TeamspacesApi.md#getTeamspace) | **GET** /teamspaces/{workspace}/{teamspace} | Retrieve a teamspace |
| [**getTeamspaceUser**](TeamspacesApi.md#getTeamspaceUser) | **GET** /teamspaces/{workspace}/{teamspace}/users/{user_id} | Retrieve a teamspace user |
| [**joinTeamspace**](TeamspacesApi.md#joinTeamspace) | **POST** /actions/teamspaces/{workspace}/{teamspace}/users/join | Join the given public teamspace |
| [**leaveTeamspace**](TeamspacesApi.md#leaveTeamspace) | **POST** /actions/teamspaces/{workspace}/{teamspace}/users/leave | Leave the given teamspace |
| [**listTeamspaceUsers**](TeamspacesApi.md#listTeamspaceUsers) | **GET** /teamspaces/{workspace}/{teamspace}/users | Retrieve all teamspace users in a teamspace |
| [**listTeamspaces**](TeamspacesApi.md#listTeamspaces) | **GET** /teamspaces/{workspace} | Retrieve teamspaces in the workspace |
| [**updateTeamspace**](TeamspacesApi.md#updateTeamspace) | **PATCH** /teamspaces/{workspace}/{teamspace} | Update the given teamspace |
| [**updateTeamspaceUser**](TeamspacesApi.md#updateTeamspaceUser) | **PATCH** /teamspaces/{workspace}/{teamspace}/users/{user_id} | Update a teamspace user |
| [**updateTeamspaceUsers**](TeamspacesApi.md#updateTeamspaceUsers) | **PATCH** /actions/teamspaces/{workspace}/{teamspace}/users/bulk_update | Update multiple teamspace users in a teamspace |


<a id="createTeamspaceUsers"></a>
# **createTeamspaceUsers**
> TeamspaceUsersCreateResponse createTeamspaceUsers(workspace, teamspace, teamspaceUsersCreateRequestInner)

Create one or more teamspace users in a teamspace

Create one or more teamspace users in a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    List<TeamspaceUsersCreateRequestInner> teamspaceUsersCreateRequestInner = Arrays.asList(); // List<TeamspaceUsersCreateRequestInner> | The request body containing the teamspace users to create
    try {
      TeamspaceUsersCreateResponse result = apiInstance.createTeamspaceUsers(workspace, teamspace, teamspaceUsersCreateRequestInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#createTeamspaceUsers");
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
| **teamspaceUsersCreateRequestInner** | [**List&lt;TeamspaceUsersCreateRequestInner&gt;**](TeamspaceUsersCreateRequestInner.md)| The request body containing the teamspace users to create | |

### Return type

[**TeamspaceUsersCreateResponse**](TeamspaceUsersCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Teamspace users created |  -  |
| **0** | An error occurred |  -  |

<a id="createTeamspaces"></a>
# **createTeamspaces**
> TeamspacesCreateResponse createTeamspaces(workspace, teamspacesCreateRequest)

Create a teamspace

Create a teamspace. The user creating the teamspace will be the teamspace owner. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    TeamspacesCreateRequest teamspacesCreateRequest = new TeamspacesCreateRequest(); // TeamspacesCreateRequest | The request body containing the teamspace to create
    try {
      TeamspacesCreateResponse result = apiInstance.createTeamspaces(workspace, teamspacesCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#createTeamspaces");
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
| **teamspacesCreateRequest** | [**TeamspacesCreateRequest**](TeamspacesCreateRequest.md)| The request body containing the teamspace to create | |

### Return type

[**TeamspacesCreateResponse**](TeamspacesCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Teamspaces created |  -  |
| **0** | An error occurred |  -  |

<a id="deleteTeamspace"></a>
# **deleteTeamspace**
> deleteTeamspace(workspace, teamspace, deleteAssets)

Delete a teamspace

Delete the given teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    Boolean deleteAssets = false; // Boolean | If `true`, the entity's assets will be deregistered in TileDB *and* deleted from the underlying storage (e.g., S3). If `false`, the entity's assets will be deregistered in TileDB but remain in the underlying storage. 
    try {
      apiInstance.deleteTeamspace(workspace, teamspace, deleteAssets);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#deleteTeamspace");
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
| **204** | Teamspace deleted |  -  |
| **0** | An error occurred |  -  |

<a id="deleteTeamspaceUser"></a>
# **deleteTeamspaceUser**
> deleteTeamspaceUser(workspace, teamspace, userId)

Delete a teamspace user

Delete the given teamspace user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String userId = "userId_example"; // String | The user ID in the form usr_9m4e2mr0ui3e8a215n4g
    try {
      apiInstance.deleteTeamspaceUser(workspace, teamspace, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#deleteTeamspaceUser");
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
| **userId** | **String**| The user ID in the form usr_9m4e2mr0ui3e8a215n4g | |

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
| **204** | Teamspace user deleted |  -  |
| **404** | Teamspace user ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="deleteTeamspaceUsers"></a>
# **deleteTeamspaceUsers**
> deleteTeamspaceUsers(workspace, teamspace, requestBody)

Delete the given teamspace users in a teamspace

Delete the given teamspace users in a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    List<String> requestBody = Arrays.asList(); // List<String> | The request body containing the teamspace users to delete
    try {
      apiInstance.deleteTeamspaceUsers(workspace, teamspace, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#deleteTeamspaceUsers");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| The request body containing the teamspace users to delete | |

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
| **204** | Teamspace users deleted |  -  |
| **404** | One or more of the given teamspace users do not exist |  -  |
| **0** | An error occurred |  -  |

<a id="deleteTeamspaces"></a>
# **deleteTeamspaces**
> deleteTeamspaces(workspace)

Delete all teamspaces in the workspace

Delete all teamspaces in the workspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    try {
      apiInstance.deleteTeamspaces(workspace);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#deleteTeamspaces");
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

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Teamspaces deleted |  -  |
| **0** | An error occurred |  -  |

<a id="getTeamspace"></a>
# **getTeamspace**
> TeamspaceGetResponse getTeamspace(workspace, teamspace)

Retrieve a teamspace

Retrieve the given teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    try {
      TeamspaceGetResponse result = apiInstance.getTeamspace(workspace, teamspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#getTeamspace");
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

### Return type

[**TeamspaceGetResponse**](TeamspaceGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Teamspace retrieved |  -  |
| **404** | Teamspace does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="getTeamspaceUser"></a>
# **getTeamspaceUser**
> TeamspaceUserGetResponse getTeamspaceUser(workspace, teamspace, userId)

Retrieve a teamspace user

Retrieve the given teamspace user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String userId = "userId_example"; // String | The user ID in the form usr_9m4e2mr0ui3e8a215n4g
    try {
      TeamspaceUserGetResponse result = apiInstance.getTeamspaceUser(workspace, teamspace, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#getTeamspaceUser");
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
| **userId** | **String**| The user ID in the form usr_9m4e2mr0ui3e8a215n4g | |

### Return type

[**TeamspaceUserGetResponse**](TeamspaceUserGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Teamspace user retrieved |  -  |
| **404** | Teamspace user ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="joinTeamspace"></a>
# **joinTeamspace**
> TeamspaceUsersJoinResponse joinTeamspace(workspace, teamspace)

Join the given public teamspace

Allows users to join a public teamspace if they are a member of the corresponding workspace 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    try {
      TeamspaceUsersJoinResponse result = apiInstance.joinTeamspace(workspace, teamspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#joinTeamspace");
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

### Return type

[**TeamspaceUsersJoinResponse**](TeamspaceUsersJoinResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Teamspace joined |  -  |
| **404** | Teamspace ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="leaveTeamspace"></a>
# **leaveTeamspace**
> leaveTeamspace(workspace, teamspace)

Leave the given teamspace

Allows teamspace members to leave a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    try {
      apiInstance.leaveTeamspace(workspace, teamspace);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#leaveTeamspace");
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
| **204** | Teamspace left |  -  |
| **404** | Teamspace ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="listTeamspaceUsers"></a>
# **listTeamspaceUsers**
> TeamspaceUsersListResponse listTeamspaceUsers(workspace, teamspace)

Retrieve all teamspace users in a teamspace

Retrieve a list of all teamspace users in a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    try {
      TeamspaceUsersListResponse result = apiInstance.listTeamspaceUsers(workspace, teamspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#listTeamspaceUsers");
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

### Return type

[**TeamspaceUsersListResponse**](TeamspaceUsersListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Teamspace users list retrieved |  -  |
| **404** | Teamspace ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="listTeamspaces"></a>
# **listTeamspaces**
> TeamspacesListResponse listTeamspaces(workspace, orderBy, order, memberships)

Retrieve teamspaces in the workspace

If &#x60;memberships&#x3D;true&#x60;, fetches teamspaces the user is a member of. If &#x60;memberships&#x3D;false&#x60;, fetches public teamspaces the user is not a member of. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String orderBy = "name"; // String | The field to order the results by. Defaults to `created_at`. Can be one of the following: - name - created_at - updated_at 
    String order = "asc"; // String | Specifies the sorting direction for the results returned by the query. Defaults to `desc`. Can be one of the following: - asc - desc 
    Boolean memberships = true; // Boolean | If true, returns teamspaces the user is a member of. If false, returns public teamspaces in the workspace that the user is NOT a member of. 
    try {
      TeamspacesListResponse result = apiInstance.listTeamspaces(workspace, orderBy, order, memberships);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#listTeamspaces");
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
| **orderBy** | **String**| The field to order the results by. Defaults to &#x60;created_at&#x60;. Can be one of the following: - name - created_at - updated_at  | [optional] [enum: name, created_at, updated_at] |
| **order** | **String**| Specifies the sorting direction for the results returned by the query. Defaults to &#x60;desc&#x60;. Can be one of the following: - asc - desc  | [optional] [enum: asc, desc] |
| **memberships** | **Boolean**| If true, returns teamspaces the user is a member of. If false, returns public teamspaces in the workspace that the user is NOT a member of.  | [optional] [default to true] |

### Return type

[**TeamspacesListResponse**](TeamspacesListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Teamspaces retrieved |  -  |
| **404** | Workspace ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="updateTeamspace"></a>
# **updateTeamspace**
> updateTeamspace(workspace, teamspace, teamspaceUpdateRequest)

Update the given teamspace

Update a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    TeamspaceUpdateRequest teamspaceUpdateRequest = new TeamspaceUpdateRequest(); // TeamspaceUpdateRequest | The request body containing the teamspace to update
    try {
      apiInstance.updateTeamspace(workspace, teamspace, teamspaceUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#updateTeamspace");
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
| **teamspaceUpdateRequest** | [**TeamspaceUpdateRequest**](TeamspaceUpdateRequest.md)| The request body containing the teamspace to update | |

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
| **204** | Teamspace updated |  -  |
| **0** | An error occurred |  -  |

<a id="updateTeamspaceUser"></a>
# **updateTeamspaceUser**
> updateTeamspaceUser(workspace, teamspace, userId, teamspaceUserUpdateRequest)

Update a teamspace user

Update the given teamspace user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String userId = "userId_example"; // String | The user ID in the form usr_9m4e2mr0ui3e8a215n4g
    TeamspaceUserUpdateRequest teamspaceUserUpdateRequest = new TeamspaceUserUpdateRequest(); // TeamspaceUserUpdateRequest | The request body containing the teamspace user to update
    try {
      apiInstance.updateTeamspaceUser(workspace, teamspace, userId, teamspaceUserUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#updateTeamspaceUser");
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
| **userId** | **String**| The user ID in the form usr_9m4e2mr0ui3e8a215n4g | |
| **teamspaceUserUpdateRequest** | [**TeamspaceUserUpdateRequest**](TeamspaceUserUpdateRequest.md)| The request body containing the teamspace user to update | |

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
| **204** | Teamspace user updated |  -  |
| **404** | Teamspace user ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="updateTeamspaceUsers"></a>
# **updateTeamspaceUsers**
> updateTeamspaceUsers(workspace, teamspace, teamspaceUsersBulkUpdateRequestInner)

Update multiple teamspace users in a teamspace

Update multiple teamspace users in a teamspace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.TeamspacesApi;

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

    TeamspacesApi apiInstance = new TeamspacesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    List<TeamspaceUsersBulkUpdateRequestInner> teamspaceUsersBulkUpdateRequestInner = Arrays.asList(); // List<TeamspaceUsersBulkUpdateRequestInner> | The request body containing the teamspace users to update
    try {
      apiInstance.updateTeamspaceUsers(workspace, teamspace, teamspaceUsersBulkUpdateRequestInner);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamspacesApi#updateTeamspaceUsers");
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
| **teamspaceUsersBulkUpdateRequestInner** | [**List&lt;TeamspaceUsersBulkUpdateRequestInner&gt;**](TeamspaceUsersBulkUpdateRequestInner.md)| The request body containing the teamspace users to update | |

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
| **204** | Teamspace users updated successfully |  -  |
| **0** | An error occurred |  -  |

