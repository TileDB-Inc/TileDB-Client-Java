# InvitationApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptInvitation**](InvitationApi.md#acceptInvitation) | **POST** /invitations/{invitation} |  |
| [**cancelJoinOrganization**](InvitationApi.md#cancelJoinOrganization) | **DELETE** /invitations/{invitation}/{organization}/join |  |
| [**cancelShareArrayByInvite**](InvitationApi.md#cancelShareArrayByInvite) | **DELETE** /invitations/{invitation}/{workspace}/{teamspace}/{array}/share |  |
| [**cancelShareGroupByInvite**](InvitationApi.md#cancelShareGroupByInvite) | **DELETE** /invitations/group/{invitation}/{workspace}/{teamspace}/{group_name}/share |  |
| [**cancelSharePayment**](InvitationApi.md#cancelSharePayment) | **DELETE** /invitations/share_payment/{workspace}/{teamspace}/{target} |  |
| [**fetchInvitations**](InvitationApi.md#fetchInvitations) | **GET** /invitations |  |
| [**joinOrganization**](InvitationApi.md#joinOrganization) | **POST** /invitations/{organization}/join |  |
| [**shareArrayByInvite**](InvitationApi.md#shareArrayByInvite) | **POST** /invitations/{workspace}/{teamspace}/{array}/share |  |
| [**shareGroupByInvite**](InvitationApi.md#shareGroupByInvite) | **POST** /invitations/group/{workspace}/{teamspace}/{group}/share |  |
| [**sharePayment**](InvitationApi.md#sharePayment) | **POST** /invitations/share_payment/{workspace}/{teamspace} |  |


<a id="acceptInvitation"></a>
# **acceptInvitation**
> acceptInvitation(invitation)



Accepts invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String invitation = "invitation_example"; // String | the ID of invitation about to be accepted
    try {
      apiInstance.acceptInvitation(invitation);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#acceptInvitation");
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
| **invitation** | **String**| the ID of invitation about to be accepted | |

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
| **204** | Invitation was accepted successfully |  -  |
| **404** | Could not find invitation identifier |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="cancelJoinOrganization"></a>
# **cancelJoinOrganization**
> cancelJoinOrganization(invitation, organization)



Cancels join organization invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String invitation = "invitation_example"; // String | the ID of invitation about to be cancelled
    String organization = "organization_example"; // String | name or UUID of organization
    try {
      apiInstance.cancelJoinOrganization(invitation, organization);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelJoinOrganization");
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
| **invitation** | **String**| the ID of invitation about to be cancelled | |
| **organization** | **String**| name or UUID of organization | |

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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="cancelShareArrayByInvite"></a>
# **cancelShareArrayByInvite**
> cancelShareArrayByInvite(workspace, teamspace, invitation, array)



Cancels array sharing invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String invitation = "invitation_example"; // String | the ID of invitation about to be cancelled
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      apiInstance.cancelShareArrayByInvite(workspace, teamspace, invitation, array);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelShareArrayByInvite");
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
| **invitation** | **String**| the ID of invitation about to be cancelled | |
| **array** | **String**| name/uri of array that is url-encoded | |

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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="cancelShareGroupByInvite"></a>
# **cancelShareGroupByInvite**
> cancelShareGroupByInvite(workspace, teamspace, invitation, groupName)



Cancels group sharing invitation

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String invitation = "invitation_example"; // String | the ID of invitation about to be cancelled
    String groupName = "groupName_example"; // String | name/uuid of group that is url-encoded
    try {
      apiInstance.cancelShareGroupByInvite(workspace, teamspace, invitation, groupName);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelShareGroupByInvite");
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
| **invitation** | **String**| the ID of invitation about to be cancelled | |
| **groupName** | **String**| name/uuid of group that is url-encoded | |

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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="cancelSharePayment"></a>
# **cancelSharePayment**
> cancelSharePayment(workspace, teamspace, target)



Revokes invitation from the source namespace to the target.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String target = "target_example"; // String | name or UUID of recipient namespace
    try {
      apiInstance.cancelSharePayment(workspace, teamspace, target);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelSharePayment");
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
| **target** | **String**| name or UUID of recipient namespace | |

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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **0** | error response |  -  |

<a id="fetchInvitations"></a>
# **fetchInvitations**
> InvitationData fetchInvitations(organization, array, group, start, end, page, perPage, type, status, orderby)



Fetch a list of invitations

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String organization = "organization_example"; // String | name or ID of organization to filter
    String array = "array_example"; // String | name/uri of array that is url-encoded to filter
    String group = "group_example"; // String | name or ID of group to filter
    Integer start = 56; // Integer | start time for tasks to filter by
    Integer end = 56; // Integer | end time for tasks to filter by
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String type = "type_example"; // String | invitation type, \"ARRAY_SHARE\", \"JOIN_ORGANIZATION\"
    String status = "status_example"; // String | Filter to only return \"PENDING\", \"ACCEPTED\"
    String orderby = "orderby_example"; // String | sort by which field valid values include timestamp, array_name, organization_name
    try {
      InvitationData result = apiInstance.fetchInvitations(organization, array, group, start, end, page, perPage, type, status, orderby);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#fetchInvitations");
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
| **organization** | **String**| name or ID of organization to filter | [optional] |
| **array** | **String**| name/uri of array that is url-encoded to filter | [optional] |
| **group** | **String**| name or ID of group to filter | [optional] |
| **start** | **Integer**| start time for tasks to filter by | [optional] |
| **end** | **Integer**| end time for tasks to filter by | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **type** | **String**| invitation type, \&quot;ARRAY_SHARE\&quot;, \&quot;JOIN_ORGANIZATION\&quot; | [optional] |
| **status** | **String**| Filter to only return \&quot;PENDING\&quot;, \&quot;ACCEPTED\&quot; | [optional] |
| **orderby** | **String**| sort by which field valid values include timestamp, array_name, organization_name | [optional] |

### Return type

[**InvitationData**](InvitationData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of invitations and pagination metadata |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="joinOrganization"></a>
# **joinOrganization**
> joinOrganization(organization, emailInvite)



Sends email to multiple recipients with joining information regarding an organization

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String organization = "organization_example"; // String | name or UUID of organization
    InvitationOrganizationJoinEmail emailInvite = new InvitationOrganizationJoinEmail(); // InvitationOrganizationJoinEmail | list of email recipients
    try {
      apiInstance.joinOrganization(organization, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#joinOrganization");
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
| **organization** | **String**| name or UUID of organization | |
| **emailInvite** | [**InvitationOrganizationJoinEmail**](InvitationOrganizationJoinEmail.md)| list of email recipients | |

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
| **204** | Email sent successfully to user for email confirmation link |  -  |
| **207** | Only a portion of the invitations succeeded, some failed |  -  |
| **500** | Could not reach any recipients |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="shareArrayByInvite"></a>
# **shareArrayByInvite**
> shareArrayByInvite(workspace, teamspace, array, emailInvite)



Sends email to multiple recipients with sharing information regarding an array

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | name/uri of array that is url-encoded
    InvitationArrayShareEmail emailInvite = new InvitationArrayShareEmail(); // InvitationArrayShareEmail | list of email recipients
    try {
      apiInstance.shareArrayByInvite(workspace, teamspace, array, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#shareArrayByInvite");
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
| **emailInvite** | [**InvitationArrayShareEmail**](InvitationArrayShareEmail.md)| list of email recipients | |

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
| **204** | Email sent successfully to user for email confirmation link |  -  |
| **207** | Only a portion of the invitations succeeded, some failed |  -  |
| **500** | Could not reach any recipients |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="shareGroupByInvite"></a>
# **shareGroupByInvite**
> shareGroupByInvite(workspace, teamspace, group, emailInvite)



Sends email to multiple recipients with sharing information regarding a group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String group = "group_example"; // String | name/uri of group that is url-encoded
    InvitationGroupShareEmail emailInvite = new InvitationGroupShareEmail(); // InvitationGroupShareEmail | list of email/namespace recipients
    try {
      apiInstance.shareGroupByInvite(workspace, teamspace, group, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#shareGroupByInvite");
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
| **group** | **String**| name/uri of group that is url-encoded | |
| **emailInvite** | [**InvitationGroupShareEmail**](InvitationGroupShareEmail.md)| list of email/namespace recipients | |

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
| **204** | Email sent successfully to user with an email confirmation link |  -  |
| **207** | Only a portion of the invitations succeeded, some failed |  -  |
| **500** | Could not reach any recipients |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="sharePayment"></a>
# **sharePayment**
> sharePayment(workspace, teamspace, emailInvite)



Sends email to multiple recipients allowing them to use the payment instrument provided by the source namespace. 

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    SharePaymentRequest emailInvite = new SharePaymentRequest(); // SharePaymentRequest | Recipients of the invitation. These may only be namespaces, not email addresses. 
    try {
      apiInstance.sharePayment(workspace, teamspace, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#sharePayment");
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
| **emailInvite** | [**SharePaymentRequest**](SharePaymentRequest.md)| Recipients of the invitation. These may only be namespaces, not email addresses.  | [optional] |

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
| **204** | Email sent successfully to user for email confirmation link |  -  |
| **207** | Only a portion of the invitations succeeded, some failed |  -  |
| **500** | Could not reach any recipients |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

