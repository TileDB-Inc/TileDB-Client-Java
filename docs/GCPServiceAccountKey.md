

# GCPServiceAccountKey

The key to a Google Cloud Platform service account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of the service account (i.e., its email address).  This is ignored when uploading key information, and is only provided by the server when downloading metadata about an existing key.  |  |
|**keyId** | **String** | The ID of the particular key. This identifies it among other keys issued for this service account.  This is ignored when uploading key information, and is only provided by the server when downloading metadata about an existing key.  |  |
|**keyText** | **String** | The full file provided by Google Cloud. This is usually in the form of a JSON document, but TileDB Cloud treats it as opaque (except to attempt to extract the service account ID and the key ID).  |  |



