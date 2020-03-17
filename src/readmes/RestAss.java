package com.sele.round3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestHelper {

    String baseURL="https://airline.server.test/ticketing_api/{flight_id}/{passenger_id}"
    String createFlight=   "{flight_id}/{passenger_id}?option=wheelchair&option=vegeterian";

    RequestSpecification postSpec(String pathParam,String queryParam){

       return given()
               .pathParam("flight_id","")
               .queryParam("option","") //if url has query param baseURI need not have them we can pass here
               .header("","")
               .proxy("",90);


    }


}


class MyTest extends RestHelper{

    @Test
    public void firstTest(){
        postSpec("","").body("").when().post().then();
        //body can be a pojo class or a json string
    }

    @Test
    public void checkTime(){
        when().get().time();
    when().get().time(lessThan(2000L));

    }


    @Test
    public void multipart(){
        given().
                multiPart("controlName", new File("/path/to/file")).
                when().
                post("/upload");
    }

    @Test
    public void logging(){
        //given().log().all(). .. // Log all request specification details including parameters, headers and body
        //given().log().params(). .. // Log only the parameters of the request
        //given().log().body(). .. // Log only the request body
        //given().log().headers(). .. // Log only the request headers
        //given().log().cookies(). .. // Log only the request cookies
        //given().log().method(). .. // Log only the request method
        //given().log().path(). .. // Log only the request path
        given().log().all().
                multiPart("controlName", new File("/path/to/file")).
                when().
                post("/upload");

        given().then().log().ifError();
        given().then().log().ifStatusCodeIsEqualTo(200);
    }

    @Test
    public void buildSpecification(){

        ResponseSpecBuilder builder = new ResponseSpecBuilder();
        builder.expectStatusCode(200);
        ResponseSpecification responseSpec = builder.build();

        // Now you can re-use the "responseSpec" in many different tests:
        when().
                get("/something").
                then().
                spec(responseSpec).
                body("x.y.z", equalTo("something"));

        RequestSpecBuilder builders = new RequestSpecBuilder();
        builders.addParam("parameter1", "parameterValue");
        builders.addHeader("header1", "headerValue");
        RequestSpecification requestSpec = builders.build();

        given().
                spec(requestSpec).
                param("parameter2", "paramValue").
                when().
                get("/something").
                then().
                body("x.y.z", equalTo("something"));


    }


    @Test
    public void asyncReq(){

        List<String> abc=when().get("https://jsonplaceholder.typicode.com/posts").then().body("id[0]",
                equalTo(1)).extract().response().path("id","title");

        given().
                body("a string").
                when().
                async().with().timeout(20, TimeUnit.SECONDS).post("/stringBody").
                then().
                body(equalTo("a string"));
    }

    public void testMethod() {
        System.out.println(5 * 0.1 == 0.5);
        //new Gson().fromJson(new FileReader(""),RestTest.class);
        //cricketNow().
        Response rp = when().get("http://dummy.restapiexample.com/api/v1/employees");
        ValidatableResponse vrp = rp.then();
        vrp.statusCode(HttpStatus.SC_OK).body("status", equalTo("success"));
        vrp.statusLine("hellow world");

        GetResp resp = vrp.extract().as(GetResp.class);
        resp.getData().stream().filter(x -> Integer.parseInt(x.id) > 7).collect(Collectors.toList());
    }
}


@Data
class GetResp{
    @SerializedName("asdf")
    @Expose(serialize = true)
    String status;
    @Expose(serialize = false)
    List<Dasa> data;
    @Data
    class Dasa {
        String id;
        String employee_name;
        String employee_salary;
        String employee_age;
    }
}
