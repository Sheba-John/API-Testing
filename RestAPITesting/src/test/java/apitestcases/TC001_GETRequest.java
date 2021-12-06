package apitestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GETRequest {

	@Test 
	 void getuser() {
		RestAssured.baseURI="https://gorest.co.in/public/v1/users";
		 RequestSpecification httpRequest=RestAssured.given();
		 Response response=httpRequest.request(Method.GET,"/50");
		 String responseBody=response.getBody().asString();
		 System.out.println("Response body is:"+responseBody);
		 int statusCode=response.getStatusCode();
		 System.out.println("status code is :"+statusCode);
		 Assert.assertEquals(statusCode, 200); 
	}

}

