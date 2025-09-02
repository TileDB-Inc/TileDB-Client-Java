# InvitationsApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvitations**](InvitationsApi.md#createInvitations) | **POST** /invitations/admin/{workspace} | Create one or more invitations |
| [**getInvitation**](InvitationsApi.md#getInvitation) | **POST** /invitations/{invitation_id} | Retrieve an invitation |
| [**listInvitations**](InvitationsApi.md#listInvitations) | **GET** /invitations/admin/{workspace} | Retrieve all sent invitations |
| [**respondInvitation**](InvitationsApi.md#respondInvitation) | **PATCH** /invitations/{invitation_id} | Respond to an invitation |
| [**revokeInvitation**](InvitationsApi.md#revokeInvitation) | **DELETE** /invitations/admin/{workspace}/{invitation_id} | Revoke an invitation |


<a id="createInvitations"></a>
# **createInvitations**
> createInvitations(workspace, invitationsCreateRequestInner)

Create one or more invitations

Create one or more invitations

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.InvitationsApi;

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

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    List<InvitationsCreateRequestInner> invitationsCreateRequestInner = Arrays.asList(); // List<InvitationsCreateRequestInner> | The request body containing the invitation to create
    try {
      apiInstance.createInvitations(workspace, invitationsCreateRequestInner);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#createInvitations");
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
| **invitationsCreateRequestInner** | [**List&lt;InvitationsCreateRequestInner&gt;**](InvitationsCreateRequestInner.md)| The request body containing the invitation to create | |

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
| **201** | Invitations created |  -  |
| **0** | An error occurred |  -  |

<a id="getInvitation"></a>
# **getInvitation**
> InvitationRetrieveResponse getInvitation(invitationId, invitationRetrieveRequest)

Retrieve an invitation

Invitee retrieves an invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.InvitationsApi;

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

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    String invitationId = "invitationId_example"; // String | The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g
    InvitationRetrieveRequest invitationRetrieveRequest = new InvitationRetrieveRequest(); // InvitationRetrieveRequest | The request body for retrieving an invitation
    try {
      InvitationRetrieveResponse result = apiInstance.getInvitation(invitationId, invitationRetrieveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#getInvitation");
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
| **invitationId** | **String**| The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g | |
| **invitationRetrieveRequest** | [**InvitationRetrieveRequest**](InvitationRetrieveRequest.md)| The request body for retrieving an invitation | |

### Return type

[**InvitationRetrieveResponse**](InvitationRetrieveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invitation retrieved |  -  |
| **0** | An error occurred |  -  |

<a id="listInvitations"></a>
# **listInvitations**
> InvitationsListResponse listInvitations(workspace, page, perPage)

Retrieve all sent invitations

Retrieve all invitations that the user has sent

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.InvitationsApi;

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

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      InvitationsListResponse result = apiInstance.listInvitations(workspace, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#listInvitations");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**InvitationsListResponse**](InvitationsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invitations list retrieved |  -  |
| **0** | An error occurred |  -  |

<a id="respondInvitation"></a>
# **respondInvitation**
> respondInvitation(invitationId, invitationRespondRequest)

Respond to an invitation

Invitee responds to an invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.InvitationsApi;

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

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    String invitationId = "invitationId_example"; // String | The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g
    InvitationRespondRequest invitationRespondRequest = new InvitationRespondRequest(); // InvitationRespondRequest | The request body for responding to an invitation
    try {
      apiInstance.respondInvitation(invitationId, invitationRespondRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#respondInvitation");
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
| **invitationId** | **String**| The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g | |
| **invitationRespondRequest** | [**InvitationRespondRequest**](InvitationRespondRequest.md)| The request body for responding to an invitation | |

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
| **204** | Invitation responded to |  -  |
| **0** | An error occurred |  -  |

<a id="revokeInvitation"></a>
# **revokeInvitation**
> revokeInvitation(workspace, invitationId)

Revoke an invitation

Inviter revokes a previously-sent invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.InvitationsApi;

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

    InvitationsApi apiInstance = new InvitationsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String invitationId = "invitationId_example"; // String | The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g
    try {
      apiInstance.revokeInvitation(workspace, invitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationsApi#revokeInvitation");
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
| **invitationId** | **String**| The invitation ID in the form inv_9m4e2mr0ui3e8a215n4g | |

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
| **204** | Invitation revoked |  -  |
| **0** | An error occurred |  -  |

