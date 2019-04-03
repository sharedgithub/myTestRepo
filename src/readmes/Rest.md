
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

* Accuracy of data
* Schema validation
* HTTP status codes
* Data type, validations, order and completeness
* Authorization checks
* Implementation of response timeout
* Error codes in case API returns, and
* Non-functional testing like performance and security testing

### What is validated

* Unit testing and Functional testing
* Load testing to test the performance under load
* Discovery testing to list, create and delete the number of calls documented in API
* Usability and Reliability testing to get consistent results
* Security and Penetration testing to validate all types of authentication
* Automation testing to create and run scripts that require regular API calls
* End to end Integration and Web UI testing
* API documentation testing to determine its efficiency and effectiveness

### types of issues

* Missing or duplicate functionality
* Fails to handle error conditions gracefully
* Stress
* Reliability
* Security
* Unused flags
* Not implemented errors
* Inconsistent error handling
* Performance
* Multi-threading issues
* Improper errors

Mostly, there are two kinds of Web Services which should be remembered in your next API testing interview:

SOAP (Simple Object Access Protocol) – an XML-based method to expose web services.
REpresentational State Transfer: client server communication over http protocol Hyper Text Transfer protocol

REST uses different representations to define a resource like text, JSON, and XML.
XML and JSON


An HTTP request contains five key elements:

* An action showing HTTP methods like GET, PUT, POST, DELETE.
* Uniform Resource Identifier (URI), which is the identifier for the resource on the server.
* HTTP Version, which indicates HTTP version, for example-HTTP v1.1.
* Request Header, which carries metadata (as key-value pairs) for the HTTP Request message. Metadata could be a client (or browser) type, format supported by the client, format of a message body format, cache settings, and so on.
* Request Body, which indicates the message content or resource representation.

CRUD operations is done by apis
C-Create - post
R-Retrieve - get
U-Update - put
D-Delete -delete


The API documentation is a complete, accurate technical writing giving instructions on how to effectively use and integrate with an API

## Commonly used 
* GET is only used to request data from a specified resource. Get requests can be cached and bookmarked. It remains in the browser history and haS length restrictions. GET requests should never be used when dealing with sensitive data.
* POST is used to send data to a server to create/update a resource. POST requests are never cached and bookmarked and do not remain in the browser history.
* PUT replaces all current representations of the target resource with the request payload.
* DELETE removes the specified resource.
* OPTIONS is used to describe the communication options for the target resource.
* HEAD asks for a response identical to that of a GET request, but without the response body.

PUT is basically update and POST is create resources

The purpose of a URI is to locate a resource(s) on the server hosting of the web service.

URI stands for Uniform Resource Identifier. 
A URI’s format is <protocol>://<service-name>/<ResourceType>/<ResourceID>.
 
* Does the service expose data or business logic? REST is commonly used for exposing data while SOAP for logic.
* The requirement from clients or providers for a formal contract. SOAP can provide contract via WSDL.
* Support multiple data formats.
* Support for AJAX calls. REST can apply the XMLHttpRequest.
* Synchronous and asynchronous calls. SOAP enables both synchronous/ asynchronous operations whereas REST has built-in support for synchronous.
* Stateless or Stateful calls. REST is suited for stateless operations.
* Security. SOAP provides a high level of security.
* Transaction support. SOAP is good at transaction management.
* Limited bandwidth. SOAP has a lot of overhead when sending/receiving packets since it’s XML based, requires a SOAP header. However, * REST requires less bandwidth to send requests to the server. Its messages are mostly built using JSON.
* Ease of use. REST based application is easy to implement, test, and maintain


* Since REST uses standard HTTP, it is much simpler.
* REST is easier to implement, requires less bandwidth and resources.
* REST permits many different data formats whereas SOAP only permits XML.
* REST allows better support for browser clients due to its support for JSON.
* REST has better performance and scalability. REST reads can be cached, SOAP based reads cannot be cached.


[https://www.katalon.com/resources-center/blog/web-api-testing-interview-questions/]




public class RestClass {
	RestAssured.baseURI = "http://localhost:3000";
	String user=null;
	//https://reqres.in/
	@Test
	public void testThis(RequestPOJO rs){
		
		JSONObject requestBody = new JSONObject();//either this or pojo object
		requestBody.put("name", config.getLibName());
		requestBody.put("modality", config.getModality());
		requestBody.put("createdBy", config.getUserName());
		requestBody.put("modifiedBy", config.getUserName());
		requestBody.put("standard", "No");
		
		
		user="users";
		given()
			.header("Content-Type", "application/json")
			.proxy("3.28.29.242", 80)
			.pathParam("user", user)
//			.body(rs)
		.when()
			.get("https://reqres.in/api/{user}?page=2")
		.then()
			.statusCode(200)
			.body("total_pages",is(4))
			.body("message", equalTo("Apartments with id:  successfully deleted"))
//			.body(matchesJsonSchemaInClasspath("schema-json.json"))
			.body("data.id", is(4))
			.body("$.store.book[0].title", arg1)
			;
	
		}
	
	
	@DataProvider(name = "apartments")
	public Object[][] createData() {
	 return new Object[][] {
	   { new RequestPOJO("New York, Wave str 7", 80000, 65) },
	   { new RequestPOJO("New York, GreenHill str 11", 87000, 80) },
	   { new RequestPOJO("New York, Fast ave 22", 120000, 90) },
	   { new RequestPOJO("New York, Lotos Park 3", 90000, 95) },
	   { new RequestPOJO("New York, Brown str 48", 100000, 100) },
	   { new RequestPOJO("New York, Astoria sq", 95000, 105) },
	   { new RequestPOJO("New York, North str 18", 92000, 110) },
	   { new RequestPOJO("New York, West ave9", 150000, 115) },
	   { new RequestPOJO("New York, Brown str 7", 10000, 120) },
	 };
	}
}
http://angiejones.tech/rest-assured-with-cucumber-using-bdd-for-web-services-automation/



	// json to object
		ABC res = new Gson().fromJson(new FileReader("new.json"), ABC.class);
		
		System.out.println(res.getWord());
		System.out.println(res.getPot().getD().get(2).getDa());
		
		// from string
		
		String jsonInString = "{'word' : 'mkyong'}";
		ABC res2  = new Gson().fromJson(jsonInString, ABC.class);
		
		// object to json
	
		FileWriter fw=new FileWriter("abc.json");
		new Gson().toJson(res2,fw);
		fw.flush();
		fw.close();
	}
	
	
}

@Data
class ABC{
	String word;
	String aan;
	PQR pot;
}
@Data
class PQR{
	String pot;
	List<ABCD> d;
}

@Data
class ABCD{
	int da;
}

//{
//
//"word":"saysomething",
//"pot":{
//		"pot":"halwa",
//		"d":[
//			{"da":1},
//			{"da":2},
//			{"da":3}
//			]
//	  }
//	
//
//}
