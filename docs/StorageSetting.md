

# StorageSetting

The path at which a given asset will be stored, and the credentials used to access that asset. Storage location contains a pair of storage path  and storage credentials 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storageSettingId** | **String** | The storage setting&#39;s ID |  |
|**name** | **String** | storage location name |  |
|**isDefault** | **Boolean** | True if this is the workspace&#39;s or teamspace&#39;s default storage setting |  |
|**path** | **String** | The path to store an asset. |  |
|**credentialsName** | **String** | The name of the credentials used to access this storage path |  |
|**invalid** | **Boolean** | True if the storage settings pair is not valid |  |
|**reason** | **String** | The reason why the storage setting pair is not valid |  [optional] |



