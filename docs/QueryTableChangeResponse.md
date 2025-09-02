

# QueryTableChangeResponse

A sequence of JSON strings delimited by newline.  The response contains three or more lines:   The first line is a JSON wrapper object containing the table Protocol object.   The second line is a JSON wrapper object containing the table Metadata object.   The rest of the lines are JSON wrapper objects for Data Change Files of the change data feed.     Historical Metadata will be returned if includeHistoricalMetadata is set to true.     The ordering of the lines doesn't matter. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minReaderVersion** | **Integer** | The minimum version of the protocol that a client must implement in order to correctly read a Delta Lake table. Currently it’s always 1. It will be changed in future when we introduce non-forward-compatible changes that require clients to implement. |  |
|**id** | **String** | A unique string for the file in a table. The same file is guaranteed to have the same id across multiple requests. A client may cache the file content and use this id as a key to decide whether to use the cached file content. |  |
|**name** | **String** | User-provided identifier for this table |  [optional] |
|**description** | **String** | User-provided description for this table |  [optional] |
|**format** | [**Format**](Format.md) |  |  |
|**schema** | [**Schema**](Schema.md) |  |  [optional] |
|**schemaString** | **String** | Schema of the table. This is a serialized JSON string which can be deserialized to a Schema Object. |  |
|**partitionColumns** | **List&lt;String&gt;** | An array containing the names of columns by which the data should be partitioned. When a table doesn’t have partition columns, this will be an empty array. |  |
|**_configuration** | **Map&lt;String, Object&gt;** | A map containing configuration options for the table |  [optional] |
|**version** | **Integer** | The table version of this file. |  |
|**size** | **Integer** | The size of this file in bytes. |  |
|**numFiles** | **Integer** | The number of files in the table, will be returned if available in the delta log. |  [optional] |
|**url** | **String** | An https url that a client can use to read the file directly. The same file in different responses may have different urls. |  |
|**partitionValues** | **Map&lt;String, Object&gt;** | A map from partition column to value for this file. See Partition Value Serialization for how to parse the partition values. When the table doesn&#39;t have partition columns, this will be an empty map. |  |
|**timestamp** | **Integer** | The timestamp of the file in milliseconds from epoch. |  |
|**stats** | **String** | Contains statistics (e.g., count, min/max values for columns) about the data in this file. This field may be missing. A file may or may not have stats. This is a serialized JSON string which can be deserialized to a Statistics Struct. A client can decide whether to use stats or drop it. |  [optional] |
|**expirationTimestamp** | **Integer** | The unix timestamp corresponding to the expiration of the url, in milliseconds, returned when the server supports the feature. |  [optional] |



