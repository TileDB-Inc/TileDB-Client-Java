

# CredentialUpdateRequest

The credential update object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A user-specified name for the key |  [optional] |
|**providerDefault** | **Boolean** | True if this is the user&#39;s default credential to be used when connecting to the given cloud provider. There can be at most one default for each unique provider |  [optional] |
|**provider** | **CloudProvider** |  |  [optional] |
|**allowedInTasks** | **Boolean** | Is this credential allowed to be used in tasks |  [optional] |
|**credential** | [**Credential**](Credential.md) |  |  [optional] |
|**role** | [**AccessCredentialRole**](AccessCredentialRole.md) |  |  [optional] |
|**token** | [**Token**](Token.md) |  |  [optional] |



