# AcademyApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAcademyLessons**](AcademyApi.md#getAcademyLessons) | **GET** /academy/lessons | Get information about user lessons |
| [**getAcademyQuestionnaire**](AcademyApi.md#getAcademyQuestionnaire) | **GET** /academy/questionnaires/{questionnaire_id} | Get academy questionnaire information for user |
| [**putAcademyLessons**](AcademyApi.md#putAcademyLessons) | **PUT** /academy/lessons | Academy lessons to create |
| [**putAcademyQuestionnaire**](AcademyApi.md#putAcademyQuestionnaire) | **PUT** /academy/questionnaires/{questionnaire_id} | Create or update academy questionnaire |


<a id="getAcademyLessons"></a>
# **getAcademyLessons**
> AcademyLessonsListResponse getAcademyLessons()

Get information about user lessons

Get a list of user lessons with details about each of them

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.AcademyApi;

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

    AcademyApi apiInstance = new AcademyApi(defaultClient);
    try {
      AcademyLessonsListResponse result = apiInstance.getAcademyLessons();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcademyApi#getAcademyLessons");
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

[**AcademyLessonsListResponse**](AcademyLessonsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Academy lessons |  -  |
| **0** | error response |  -  |

<a id="getAcademyQuestionnaire"></a>
# **getAcademyQuestionnaire**
> AcademyQuestionnaireListResponse getAcademyQuestionnaire(questionnaireId)

Get academy questionnaire information for user

Get academy questionnaire information for user. For example, questionnaire version, completion status and user answers

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.AcademyApi;

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

    AcademyApi apiInstance = new AcademyApi(defaultClient);
    String questionnaireId = "questionnaireId_example"; // String | questionnaire's id
    try {
      AcademyQuestionnaireListResponse result = apiInstance.getAcademyQuestionnaire(questionnaireId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcademyApi#getAcademyQuestionnaire");
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
| **questionnaireId** | **String**| questionnaire&#39;s id | |

### Return type

[**AcademyQuestionnaireListResponse**](AcademyQuestionnaireListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful academy questionnaire response |  -  |
| **404** | answers not found |  -  |
| **0** | error response |  -  |

<a id="putAcademyLessons"></a>
# **putAcademyLessons**
> putAcademyLessons(academyLesson)

Academy lessons to create

Create one or more user lessons

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.AcademyApi;

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

    AcademyApi apiInstance = new AcademyApi(defaultClient);
    List<AcademyLesson> academyLesson = Arrays.asList(); // List<AcademyLesson> | Academy lesson to create
    try {
      apiInstance.putAcademyLessons(academyLesson);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcademyApi#putAcademyLessons");
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
| **academyLesson** | [**List&lt;AcademyLesson&gt;**](AcademyLesson.md)| Academy lesson to create | |

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
| **200** | create or update success |  -  |
| **0** | error response |  -  |

<a id="putAcademyQuestionnaire"></a>
# **putAcademyQuestionnaire**
> putAcademyQuestionnaire(questionnaireId, academyQuestionnairePutRequest)

Create or update academy questionnaire

Create a new questionnaire or update an existing one

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.v4.ApiClient;
import io.tiledb.cloud.rest_api.v4.ApiException;
import io.tiledb.cloud.rest_api.v4.Configuration;
import io.tiledb.cloud.rest_api.v4.auth.*;
import io.tiledb.cloud.rest_api.v4.models.*;
import io.tiledb.cloud.rest_api.v4.api.AcademyApi;

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

    AcademyApi apiInstance = new AcademyApi(defaultClient);
    String questionnaireId = "questionnaireId_example"; // String | questionnaire's id
    AcademyQuestionnairePutRequest academyQuestionnairePutRequest = new AcademyQuestionnairePutRequest(); // AcademyQuestionnairePutRequest | academy lesson to create
    try {
      apiInstance.putAcademyQuestionnaire(questionnaireId, academyQuestionnairePutRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcademyApi#putAcademyQuestionnaire");
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
| **questionnaireId** | **String**| questionnaire&#39;s id | |
| **academyQuestionnairePutRequest** | [**AcademyQuestionnairePutRequest**](AcademyQuestionnairePutRequest.md)| academy lesson to create | |

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
| **200** | create or update success |  -  |
| **0** | error response |  -  |

