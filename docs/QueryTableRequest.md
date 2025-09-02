

# QueryTableRequest

Delta share table query request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**predicateHints** | **String** | a list of SQL boolean expressions using a restricted subset of SQL, in a JSON array. When it&#39;s present, the server will use the provided predicates as a hint to apply the SQL predicates on the returned files.   Filtering files based on the SQL predicates is BEST EFFORT. The server may return files that don&#39;t satisfy the predicates.   If the server fails to parse one of the SQL predicates, or fails to evaluate it, the server may skip it.   Predicate expressions are conjunctive (AND-ed together). When it&#39;s absent, the server will return all of files in the table. This will be deprecated once all the client and server implementation move to using jsonPredicateHints below.  |  [optional] |
|**jsonPredicateHints** | **String** | query predicates on partition columns specified using a structured JSON format. When it&#39;s present, the server will try to use the predicates to filter table&#39;s files, which could boost query performance.   As with predicateHints, this filtering is BEST EFFORT. The server may return files that don&#39;t satisfy the predicates.   If the server encounters any errors during predicate processing (for example, invalid syntax or non existing columns), it will skip filtering and return all the files. When it&#39;s absent, the server will return all the files in the table.  |  [optional] |
|**limitHint** | **String** | an optional limit number. It&#39;s a hint from the client to tell the server how many rows in the table the client plans to read. The server can use this hint to return only some files by using the file stats. For example, when running SELECT * FROM table LIMIT 1000, the client can set limitHint to 1000. |  [optional] |
|**version** | **Integer** | an optional version number. If set, will return files as of the specified version of the table. This is only supported on tables with history sharing enabled. |  [optional] |
|**timestamp** | **String** | an optional timestamp string in the Timestamp Format,. If set, will return files as of the table version corresponding to the specified timestamp. This is only supported on tables with history sharing enabled. |  [optional] |
|**startingVersion** | **Integer** | an optional version number. If set, will return all data change files since startingVersion, inclusive, including historical metadata if seen in the delta log. |  [optional] |
|**endingVersion** | **Integer** | an optional version number, only used if startingVersion is set. If set, the server can use it as a hint to avoid returning data change files after endingVersion. This is not enforcement. Hence, when sending the endingVersion parameter, the client should still handle the case that it may receive files after endingVersion. |  [optional] |



