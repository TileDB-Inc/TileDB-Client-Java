

# Metadata

Delta share table metadata object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this table |  |
|**name** | **String** | User-provided identifier for this table |  [optional] |
|**description** | **String** | User-provided description for this table |  [optional] |
|**format** | [**Format**](Format.md) |  |  |
|**schema** | [**Schema**](Schema.md) |  |  [optional] |
|**schemaString** | **String** | Schema of the table. This is a serialized JSON string which can be deserialized to a Schema Object. |  |
|**partitionColumns** | **List&lt;String&gt;** | An array containing the names of columns by which the data should be partitioned. When a table doesn’t have partition columns, this will be an empty array. |  |
|**_configuration** | **Map&lt;String, Object&gt;** | A map containing configuration options for the table |  [optional] |
|**version** | **Integer** | The table version the metadata corresponds to, returned when querying table data with a version or timestamp parameter, or cdf query with includeHistoricalMetadata set to true. |  [optional] |
|**size** | **Integer** | The size of the table in bytes, will be returned if available in the delta log. |  [optional] |
|**numFiles** | **Integer** | The number of files in the table, will be returned if available in the delta log. |  [optional] |



