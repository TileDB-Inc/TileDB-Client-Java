

# TaskGraphLog

Logging information about the execution of a task graph.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The server-generated UUID of the task graph. |  [optional] [readonly] |
|**namespace** | **String** | The namespace that owns this task graph log. When creating a task graph log, this is used as the namespace to create the log in; thereafter it is read-only.  |  [optional] |
|**createdBy** | **String** | The name of the user who created this task graph log. |  [optional] [readonly] |
|**name** | **String** | A name for this task graph log, displayed in the UI. Does not need to be unique.  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date/time when this task graph log was originally created. This is distinct from the execution start_time.  |  [optional] [readonly] |
|**startTime** | **OffsetDateTime** | The start time of the task graph, recorded when the server starts executing the first node.  |  [optional] [readonly] |
|**endTime** | **OffsetDateTime** | The end time of the task graph, recorded when the client reports completion.  |  [optional] [readonly] |
|**status** | **TaskGraphLogStatus** |  |  [optional] |
|**totalCost** | **BigDecimal** | If present, the total cost of executing all nodes in this task graph.  |  [optional] |
|**accessCost** | **BigDecimal** | If present, the total cost of access from execution of the nodes in this task graph.  |  [optional] |
|**egressCost** | **BigDecimal** | If present, the total cost of access from execution of the nodes in this task graph.  |  [optional] |
|**executionTime** | **String** | The total execution time of all the nodes in this graph, in ISO 8601 format with hours, minutes, and seconds.  |  [optional] |
|**statusCount** | **Map&lt;String, BigDecimal&gt;** | A mapping from &#x60;ArrayTaskStatus&#x60; string value to the number of nodes in this graph that are in that status.  |  [optional] |
|**nodes** | [**List&lt;TaskGraphNodeMetadata&gt;**](TaskGraphNodeMetadata.md) | The structure of the graph. This is provided by the client when first setting up the task graph. Thereafter, it is read-only. This must be topographically sorted; that is, each node must appear after all nodes that it depends upon.  |  [optional] |
|**taskGraphType** | **TaskGraphType** |  |  [optional] |
|**taskGraphId** | **String** | The UUID of the task graph. |  [optional] |
|**cloudProvider** | **String** | The name of the cloud provider where this task graph executed. |  [optional] |
|**cloudRegion** | **String** | The region of the cloud provider where this task graph executed. |  [optional] |
|**rootTaskGraphUuid** | **String** | The UUID of the root taskgraph that this taskgraph is related to. This is used to provide consistent tracking and UI view for graphs that are executed by a set of taskgraphs.  |  [optional] |
|**childrenTaskGraphUuids** | **List&lt;String&gt;** | If this is a root taskgraph, this contains the list of all its children taskgraph UUIDs.  |  [optional] |



