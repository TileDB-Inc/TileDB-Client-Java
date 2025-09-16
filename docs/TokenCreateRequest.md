

# TokenCreateRequest

The request object for creating a token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A human-readable name for the token. The name must be provided if the token is an API token (i.e. if &#x60;workspace_id&#x60; is provided).  |  [optional] |
|**scope** | **TokenScope** |  |  |
|**workspaceId** | **String** | The workspace ID or Name that the token will be scoped for. This must be provided if the token is meant to be an API token (instead of a session token).  |  [optional] |
|**expiresAt** | **OffsetDateTime** | The expiration date and time of the token. If no expiration date is provided, the server will set the default expiration date.  |  [optional] |



