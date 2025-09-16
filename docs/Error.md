

# Error

Object containing data about a handled error by REST server

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **Integer** | A hardcoded integer which points to a specific file/line of the code that returned the error |  |
|**message** | **String** | A friendly message to be shown to the client |  |
|**requestId** | **String** | The request id to be used for tracing/debugging |  |
|**validationError** | [**ValidationError**](ValidationError.md) |  |  [optional] |



