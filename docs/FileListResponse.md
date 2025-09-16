

# FileListResponse

The result of a list files operation. Compatible with S3's ListObjectResult

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the bucket (teamspace) with the objects |  [optional] |
|**prefix** | **String** | The prefix under which objects are listed |  [optional] |
|**delimiter** | **String** | The string that delimits the path segments. Only forward slash is supported |  [optional] |
|**maxKeys** | **Integer** | The maximum amount of objects to return |  [optional] |
|**continuationToken** | **String** | The continuation token that was passed to the operation |  [optional] |
|**nextContinuationToken** | **String** | The continuation token to pass to list the next items |  [optional] |
|**isTruncated** | **Boolean** | Whether there are no more files to list |  [optional] |
|**commonPrefixes** | [**List&lt;CommonPrefix&gt;**](CommonPrefix.md) | The common prefixes (folders) contained under prefix. |  [optional] |
|**objects** | [**List&lt;ModelObject&gt;**](ModelObject.md) | The objects (files) contained under prefix. |  [optional] |



