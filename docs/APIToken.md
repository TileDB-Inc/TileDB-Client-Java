

# APIToken

An API token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token&#39;s ID |  |
|**name** | **String** | The name of the token |  |
|**createdAt** | **OffsetDateTime** | The creation date and time of the token |  |
|**expiresAt** | **OffsetDateTime** | The expiration date and time of the token |  |
|**apiKey** | **String** | The secret API key that&#39;s used for authentication. If workspace_id is set, the format of the key is \&quot;tiledb_&lt;random bytes&gt;\&quot;. Otherwise, the format is a JWT.  |  |
|**workspaceId** | **String** | The workspace ID of the token (if API token) |  [optional] |
|**scope** | **TokenScope** |  |  |



