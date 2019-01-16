Application programming interface is like a bridge between two softwares ..to help them communicate with each other
 A software system implementing an API contains functions or subroutines that can be executed by another software system.


All Web services are APIs but not all APIs are Web services.
Web services might not contain all the specifications and cannot perform all the tasks that APIs would perform.
A Web service uses only three styles of use: SOAP, REST and XML-RPC for communication whereas API may be exposed to in multiple ways.
A Web service always needs a network to operate while APIs don’t need a network for operation.


API testing is a kind of software testing which determines if the developed APIs meet expectations regarding the functionality, reliability, performance, and security of the application.


### Advantage

application will be tested and evaluated early before the GUI tests. 

Time Effective and cost saving API testing usually is less time consuming than functional GUI testing.  

automated testing can be done in any language

can be easily integrated with gui tests

### what to validate
During the API testing process, a request is raised to the API with the known data. This way you can analyze the validation response. While testing an API, you should consider:

Accuracy of data
Schema validation
HTTP status codes
Data type, validations, order and completeness
Authorization checks
Implementation of response timeout
Error codes in case API returns, and
Non-functional testing like performance and security testing

### What is validated

Unit testing and Functional testing
Load testing to test the performance under load
Discovery testing to list, create and delete the number of calls documented in API
Usability and Reliability testing to get consistent results
Security and Penetration testing to validate all types of authentication
Automation testing to create and run scripts that require regular API calls
End to end Integration and Web UI testing
API documentation testing to determine its efficiency and effectiveness

### types of issues

Missing or duplicate functionality
Fails to handle error conditions gracefully
Stress
Reliability
Security
Unused flags
Not implemented errors
Inconsistent error handling
Performance
Multi-threading issues
Improper errors

Mostly, there are two kinds of Web Services which should be remembered in your next API testing interview:

SOAP (Simple Object Access Protocol) – an XML-based method to expose web services.
REpresentational State Transfer: client server communication over http protocol Hyper Text Transfer protocol

REST uses different representations to define a resource like text, JSON, and XML.
XML and JSON


An HTTP request contains five key elements:

An action showing HTTP methods like GET, PUT, POST, DELETE.
Uniform Resource Identifier (URI), which is the identifier for the resource on the server.
HTTP Version, which indicates HTTP version, for example-HTTP v1.1.
Request Header, which carries metadata (as key-value pairs) for the HTTP Request message. Metadata could be a client (or browser) type, format supported by the client, format of a message body format, cache settings, and so on.
Request Body, which indicates the message content or resource representation.


