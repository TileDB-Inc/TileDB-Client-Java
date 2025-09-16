

# Schema

A struct is used to represent both the top-level schema of the table as well as struct columns that contain nested columns. A struct is encoded as a JSON object with the following fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Always the string struct |  |
|**fields** | [**List&lt;SchemaField&gt;**](SchemaField.md) | User-provided identifier for this table |  |



