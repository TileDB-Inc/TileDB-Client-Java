

# CredentialsVerifyRequest

object metadata for a credential that will be created

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | credential name |  |
|**provider** | **CloudProvider** |  |  |
|**providerDefault** | **Boolean** | True if this is the namespace&#39;s default credential to be used when connecting to the given cloud provider. There can be at most one default for each unique provider |  [optional] |
|**allowedInTasks** | **Boolean** | Is this credential allowed to be used in tasks |  [optional] |
|**credential** | [**Credential**](Credential.md) |  |  [optional] |
|**role** | [**AccessCredentialRole**](AccessCredentialRole.md) |  |  [optional] |
|**token** | [**Token**](Token.md) |  |  [optional] |
|**workspaceId** | **String** | The workspace&#39;s ID. If provided, the given role will be verified in a daisy chain fashion, starting with the role ARN associated with the given workspace.  |  [optional] |
|**teamspaceId** | **String** | The teamspace&#39;s ID. If provided, the given role will be verified in a daisy chain fashion, starting with the role ARN associated with the given teamspace.  |  [optional] |



