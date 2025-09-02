

# StorageSettingsCreateRequest

The path at which a given asset will be stored, and the credentials used to access that asset. Storage setting contains a pair of storage path  and storage credentials 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | storage location name |  |
|**isDefault** | **Boolean** | True if this is the workspace&#39;s or teamspace&#39;s default storage setting |  |
|**path** | **String** | URI containing the VFS path of where assets will be stored. Local file paths must start with &#x60;file://&#x60;.  |  |
|**credentialsName** | **String** | The name of the credentials used to access this storage path |  |



