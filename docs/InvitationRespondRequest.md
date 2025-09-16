

# InvitationRespondRequest

The request body for responding to an invitation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jwt** | **String** | The JWT that authorizes the invitee to respond to the invitation |  |
|**response** | [**ResponseEnum**](#ResponseEnum) | The response to the invitation |  |



## Enum: ResponseEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;accept&quot; |
| REJECT | &quot;reject&quot; |



