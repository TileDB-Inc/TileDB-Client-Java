

# DataChangeFile

Delta share table change file object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | An https url that a client can use to read the file directly. The same file in different responses may have different urls. |  |
|**id** | **String** | A unique string for the file in a table. The same file is guaranteed to have the same id across multiple requests. A client may cache the file content and use this id as a key to decide whether to use the cached file content. |  |
|**partitionValues** | **Map&lt;String, Object&gt;** | A map from partition column to value for this file. See Partition Value Serialization for how to parse the partition values. When the table doesn&#39;t have partition columns, this will be an empty map. |  |
|**size** | **Integer** | The size of this file in bytes. |  |
|**timestamp** | **Integer** | The timestamp of the file in milliseconds from epoch. |  |
|**version** | **Integer** | The table version of this file. |  |
|**expirationTimestamp** | **Integer** | The unix timestamp corresponding to the expiration of the url, in milliseconds, returned when the server supports the feature. |  [optional] |



