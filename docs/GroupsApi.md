# GroupsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeGroupContents**](GroupsApi.md#changeGroupContents) | **POST** /groups/{workspace}/{teamspace}/{group_name}/contents |  |
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /groups/{workspace}/{teamspace}/create |  |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{workspace}/{teamspace}/{group_name} |  |
| [**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{workspace}/{teamspace}/{group_name} |  |
| [**getGroupActivity**](GroupsApi.md#getGroupActivity) | **GET** /groups/{workspace}/{teamspace}/{group_name}/content_activity |  |
| [**getGroupContents**](GroupsApi.md#getGroupContents) | **GET** /groups/{workspace}/{teamspace}/{group_name}/contents |  |
| [**getGroupSharingPolicies**](GroupsApi.md#getGroupSharingPolicies) | **GET** /groups/{workspace}/{teamspace}/{group_name}/share |  |
| [**groupsBrowserOwnedFiltersGet**](GroupsApi.md#groupsBrowserOwnedFiltersGet) | **GET** /groups/browser/owned/filters |  |
| [**groupsBrowserPublicFiltersGet**](GroupsApi.md#groupsBrowserPublicFiltersGet) | **GET** /groups/browser/public/filters |  |
| [**groupsBrowserSharedFiltersGet**](GroupsApi.md#groupsBrowserSharedFiltersGet) | **GET** /groups/browser/shared/filters |  |
| [**groupsWorkspaceTeamspaceGroupNameContentsFiltersGet**](GroupsApi.md#groupsWorkspaceTeamspaceGroupNameContentsFiltersGet) | **GET** /groups/{workspace}/{teamspace}/{group_name}/contents/filters |  |
| [**listOwnedGroups**](GroupsApi.md#listOwnedGroups) | **GET** /groups/browser/owned |  |
| [**listPublicGroups**](GroupsApi.md#listPublicGroups) | **GET** /groups/browser/public |  |
| [**listSharedGroups**](GroupsApi.md#listSharedGroups) | **GET** /groups/browser/shared |  |
| [**registerGroup**](GroupsApi.md#registerGroup) | **POST** /groups/{workspace}/{teamspace}/{array}/register |  |
| [**shareGroup**](GroupsApi.md#shareGroup) | **PATCH** /groups/{workspace}/{teamspace}/{group_name}/share |  |
| [**updateGroup**](GroupsApi.md#updateGroup) | **PATCH** /groups/{workspace}/{teamspace}/{group_name} |  |


<a id="changeGroupContents"></a>
# **changeGroupContents**
> changeGroupContents(workspace, teamspace, groupName, groupChanges)



Changes the contents of the group by adding/removing members.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupChanges groupChanges = new GroupChanges(); // GroupChanges | 
    try {
      apiInstance.changeGroupContents(workspace, teamspace, groupName, groupChanges);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#changeGroupContents");
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
| **groupName** | **String**| The unique name or id of the group | |
| **groupChanges** | [**GroupChanges**](GroupChanges.md)|  | [optional] |

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
| **204** | all changes applied successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="createGroup"></a>
# **createGroup**
> createGroup(workspace, teamspace, groupCreate)



Creates a new group in the namespace.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    GroupCreate groupCreate = new GroupCreate(); // GroupCreate | 
    try {
      apiInstance.createGroup(workspace, teamspace, groupCreate);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **groupCreate** | [**GroupCreate**](GroupCreate.md)|  | [optional] |

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
| **204** | group created successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(workspace, teamspace, groupName)



Deletes the group. The assets are not deleted nor are not relocated to any other group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      apiInstance.deleteGroup(workspace, teamspace, groupName);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroup");
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
| **groupName** | **String**| The unique name or id of the group | |

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
| **204** | group deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getGroup"></a>
# **getGroup**
> GroupInfo getGroup(workspace, teamspace, groupName)



Returns the the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      GroupInfo result = apiInstance.getGroup(workspace, teamspace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroup");
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
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**GroupInfo**](GroupInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group metadata |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getGroupActivity"></a>
# **getGroupActivity**
> GroupContentActivityResponse getGroupActivity(workspace, teamspace, groupName, page, perPage)



Returns the activity of group content

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      GroupContentActivityResponse result = apiInstance.getGroupActivity(workspace, teamspace, groupName, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupActivity");
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
| **groupName** | **String**| The unique name or id of the group | |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**GroupContentActivityResponse**](GroupContentActivityResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity logs of group contents along with the pagination metadata |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getGroupContents"></a>
# **getGroupContents**
> GroupContents getGroupContents(workspace, teamspace, groupName, page, perPage, namespace, search, orderby, tag, excludeTag, memberType, excludeMemberType)



Returns the contents of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    Integer page = 56; // Integer | pagination offset for assets
    Integer perPage = 56; // Integer | pagination limit for assets
    String namespace = "namespace_example"; // String | namespace to search for
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    List<String> memberType = Arrays.asList(); // List<String> | member type to search for, more than one can be included
    List<String> excludeMemberType = Arrays.asList(); // List<String> | member type to exclude matching groups in results, more than one can be included
    try {
      GroupContents result = apiInstance.getGroupContents(workspace, teamspace, groupName, page, perPage, namespace, search, orderby, tag, excludeTag, memberType, excludeMemberType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupContents");
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
| **groupName** | **String**| The unique name or id of the group | |
| **page** | **Integer**| pagination offset for assets | [optional] |
| **perPage** | **Integer**| pagination limit for assets | [optional] |
| **namespace** | **String**| namespace to search for | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **memberType** | [**List&lt;String&gt;**](String.md)| member type to search for, more than one can be included | [optional] |
| **excludeMemberType** | [**List&lt;String&gt;**](String.md)| member type to exclude matching groups in results, more than one can be included | [optional] |

### Return type

[**GroupContents**](GroupContents.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getGroupSharingPolicies"></a>
# **getGroupSharingPolicies**
> List&lt;GroupSharing&gt; getGroupSharingPolicies(workspace, teamspace, groupName)



Get all sharing details of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      List<GroupSharing> result = apiInstance.getGroupSharingPolicies(workspace, teamspace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupSharingPolicies");
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
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**List&lt;GroupSharing&gt;**](GroupSharing.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all specific sharing policies |  -  |
| **404** | Group does not exist or user does not have permissions to view group-sharing policies |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="groupsBrowserOwnedFiltersGet"></a>
# **groupsBrowserOwnedFiltersGet**
> GroupBrowserFilterData groupsBrowserOwnedFiltersGet(namespace)



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserOwnedFiltersGet(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserOwnedFiltersGet");
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
| **namespace** | **String**| namespace | [optional] |

### Return type

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="groupsBrowserPublicFiltersGet"></a>
# **groupsBrowserPublicFiltersGet**
> GroupBrowserFilterData groupsBrowserPublicFiltersGet()



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserPublicFiltersGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserPublicFiltersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="groupsBrowserSharedFiltersGet"></a>
# **groupsBrowserSharedFiltersGet**
> GroupBrowserFilterData groupsBrowserSharedFiltersGet(namespace)



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserSharedFiltersGet(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserSharedFiltersGet");
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
| **namespace** | **String**| namespace | [optional] |

### Return type

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="groupsWorkspaceTeamspaceGroupNameContentsFiltersGet"></a>
# **groupsWorkspaceTeamspaceGroupNameContentsFiltersGet**
> GroupContentsFilterData groupsWorkspaceTeamspaceGroupNameContentsFiltersGet(workspace, teamspace, groupName)



Fetch data to initialize filters for the group contents

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      GroupContentsFilterData result = apiInstance.groupsWorkspaceTeamspaceGroupNameContentsFiltersGet(workspace, teamspace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsWorkspaceTeamspaceGroupNameContentsFiltersGet");
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
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**GroupContentsFilterData**](GroupContentsFilterData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listOwnedGroups"></a>
# **listOwnedGroups**
> GroupBrowserData listOwnedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata)



Returns one page of owned groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listOwnedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listOwnedGroups");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listPublicGroups"></a>
# **listPublicGroups**
> GroupBrowserData listPublicGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata)



Returns one page of public groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listPublicGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listPublicGroups");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listSharedGroups"></a>
# **listSharedGroups**
> GroupBrowserData listSharedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, sharedTo, withMetadata)



Returns one page of shared groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    List<String> sharedTo = Arrays.asList(); // List<String> | namespaces to filter results of where there groups were shared to
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listSharedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, sharedTo, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listSharedGroups");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **sharedTo** | [**List&lt;String&gt;**](String.md)| namespaces to filter results of where there groups were shared to | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="registerGroup"></a>
# **registerGroup**
> registerGroup(workspace, teamspace, array, groupRegister)



Registers an existing group in the namespace.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String array = "array_example"; // String | The unique name or id of the group
    GroupRegister groupRegister = new GroupRegister(); // GroupRegister | 
    try {
      apiInstance.registerGroup(workspace, teamspace, array, groupRegister);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#registerGroup");
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
| **array** | **String**| The unique name or id of the group | |
| **groupRegister** | [**GroupRegister**](GroupRegister.md)|  | [optional] |

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
| **204** | group created successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="shareGroup"></a>
# **shareGroup**
> shareGroup(workspace, teamspace, groupName, groupSharingRequest)



Share a group with a namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupSharingRequest groupSharingRequest = new GroupSharingRequest(); // GroupSharingRequest | Namespace and list of permissions to share with. Sharing is recursive, it is applied to all reachable subgroups and arrays of the group. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the group will not be shared with the namespace at all.
    try {
      apiInstance.shareGroup(workspace, teamspace, groupName, groupSharingRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#shareGroup");
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
| **groupName** | **String**| The unique name or id of the group | |
| **groupSharingRequest** | [**GroupSharingRequest**](GroupSharingRequest.md)| Namespace and list of permissions to share with. Sharing is recursive, it is applied to all reachable subgroups and arrays of the group. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the group will not be shared with the namespace at all. | |

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
| **204** | Group shared successfully |  -  |
| **404** | Group does not exist or user does not have permissions to share group |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="updateGroup"></a>
# **updateGroup**
> updateGroup(workspace, teamspace, groupName, groupUpdate)



Changes attributes of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
    String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupUpdate groupUpdate = new GroupUpdate(); // GroupUpdate | 
    try {
      apiInstance.updateGroup(workspace, teamspace, groupName, groupUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroup");
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
| **groupName** | **String**| The unique name or id of the group | |
| **groupUpdate** | [**GroupUpdate**](GroupUpdate.md)|  | [optional] |

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
| **204** | attributes changed successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

