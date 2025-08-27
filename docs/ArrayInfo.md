

# ArrayInfo

metadata of an array

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique ID of registered array |  [optional] |
|**assetId** | **String** | The asset id of the created array |  [optional] |
|**fileType** | **FileType** |  |  [optional] |
|**fileProperties** | **Map&lt;String, String&gt;** | map of file properties created for this array |  [optional] |
|**uri** | **String** | uri of array |  [optional] |
|**namespace** | **String** | namespace array is in |  [optional] |
|**size** | **BigDecimal** | size in bytes of array |  [optional] |
|**lastAccessed** | **OffsetDateTime** | Datetime array was last accessed in UTC |  [optional] |
|**description** | **String** | description of array |  [optional] |
|**name** | **String** | name of array |  [optional] |
|**allowedActions** | **List&lt;ArrayActions&gt;** | list of actions user is allowed to do on this array |  [optional] |
|**pricing** | [**List&lt;Pricing&gt;**](Pricing.md) | list of pricing created for this array |  [optional] |
|**subscriptions** | [**List&lt;Subscription&gt;**](Subscription.md) | list of subscriptions created for this array |  [optional] |
|**logo** | **String** | logo (base64 encoded) for the array. Optional |  [optional] |
|**accessCredentialsName** | **String** | the name of the access credentials to use. if unset, the default credentials will be used |  [optional] |
|**type** | **ArrayType** |  |  [optional] |
|**shareCount** | **BigDecimal** | number of unique namespaces this array is shared with |  [optional] |
|**publicShare** | **Boolean** | Suggests if the array was shared to public by owner |  [optional] |
|**namespaceSubscribed** | **Boolean** | Depends on the namespace asking, denotes the existence of subscription of namespace to this array |  [optional] [readonly] |
|**tiledbUri** | **String** | uri for access through TileDB cloud |  [optional] |
|**tags** | **List&lt;String&gt;** | optional tags for array |  [optional] |
|**licenseId** | **String** | License identifier from SPDX License List or Custom |  [optional] |
|**licenseText** | **String** | License text |  [optional] |
|**readOnly** | **Boolean** | Suggests if the array is in read_only mode |  [optional] |
|**isFavorite** | **Boolean** | Indicates whether the array is in user favorites |  [optional] |
|**createdAt** | **OffsetDateTime** | Datetime array was registered with tiledb |  [optional] |
|**createdBy** | **String** | The user who created the array, if known. |  [optional] |
|**metadata** | [**List&lt;MetadataStringifiedEntry&gt;**](MetadataStringifiedEntry.md) | Contains the metadata of the array. **Note:** This property is included in the response only if the &#x60;with_metadata&#x60; query parameter is set to &#x60;true&#x60;.  |  [optional] |



