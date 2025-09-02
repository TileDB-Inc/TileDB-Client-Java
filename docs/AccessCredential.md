

# AccessCredential

The user credential object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**credentialType** | **CredentialType** |  |  |
|**id** | **String** | The ID of the credential |  |
|**name** | **String** | credential name |  |
|**provider** | **CloudProvider** |  |  |
|**providerDefault** | **Boolean** | True if this is the user&#39;s default credential to be used when connecting to the given cloud provider. There can be at most one default for each unique provider |  [optional] |
|**createdAt** | **OffsetDateTime** | Datetime credentials were created in UTC |  |
|**updatedAt** | **OffsetDateTime** | Datetime credentials were updated in UTC |  [optional] |
|**allowedInTasks** | **Boolean** | Is this credential allowed to be used in tasks |  [optional] |
|**credential** | [**Credential**](Credential.md) |  |  [optional] |
|**role** | [**AccessCredentialRole**](AccessCredentialRole.md) |  |  [optional] |
|**token** | [**Token**](Token.md) |  |  [optional] |



