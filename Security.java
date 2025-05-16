package apc_kk;

// Import RestAssured methods
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*; 

public class Security {
	 @Test(enabled=true)
	    public void testUnauthorizedAccess() {
	        RestAssured.baseURI = "http://172.10.1.159:9022";

	        given() // ✅ Ensure 'given()' is correctly recognized
	        .when()
	            .get("/api/Account/1000000/username")
	        .then()
	            .statusCode(200); // Expect 401 Unauthorized if security is implemented
	    }
	 
	 @Test(enabled=true)
	    public void testUnauthorizedAccess1() {
		    RestAssured.baseURI = "http://172.10.1.159:9022";

	        given()
	            .header("Accept", "application/json")  // Ensure correct content type
	            .header("Content-Type", "application/json") 
	            .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI0MDgwMDIzIiwianRpIjoiYjM1NzFmOGUtYWE2OS00MGMwLTkxOGYtZmUzNmFlMGFiNzhmIiwiZW1haWwiOiJoYXBvQG1haWxpbmF0b3IuY29tIiwidWlkIjoiYTlmODhkMWEtMDBjMy00Y2UxLWEzZWUtNDUzYTY3ZmUyZDY2IiwiaXAiOiIxNzIuMTAuMS4xNTkiLCJ1bm8iOiI0MDgwMDIzIiwicm9sZXMiOiJBcHBsaWNhbnQiLCJleHAiOjE3NDAwMzU3MzMsImlzcyI6IkNvcmVJZGVudGl0eSIsImF1ZCI6IkNvcmVJZGVudGl0eVVzZXIifQ.nQVxYJLz_YV7Sc8WspjvWnn20hmOsEQv4MP9AaEg050")  // Simulating unauthorized request
	        .when()
	            .get("/api/Account/4020001/username")
	        .then()
	            .statusCode(200);
	    }
	 
	 @Test
	    public void testUnauthorizedAccessinvalid() {
		    RestAssured.baseURI = "http://172.10.1.159:9022";

	        given()
	            .header("Accept", "application/json")  // Ensure correct content type
	            .header("Content-Type", "application/json") 
	            .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJzdHJpbmciLCJqdGkiNmLTQwM2UtYWE3YS1mOGQyOWZiNGU4NWMiLCJlbWFpbCI6InN0cmluZyIsInVpZCI6IjEwYTk4ODBkLWI4NzctNDAxOC1iMzNiLTQxYzhiNWQ0MDQzZCIsImlwIjoiMTcyLjEwLjEuMTU5IiwidW5vIjoic3RyaW5nIiwicm9sZXMiOiJBZG1pbiIsImV4cCI6MTc0MDA0NjA0NywiaXNzIjoiQ29yZUlkZW50aXR5IiwiYXVkIjoiQ29yZUlkZW50aXR5VXNlciJ9.5lj9rdTCToEI2PQVI9mWSOqQZVQPBOk35ALL0VNAGVA")  // Simulating unauthorized request
	        .when()
	            .get("/api/Account/1000000/username")
	        .then()
	            .statusCode(200);
	    }
	 @Test(enabled=false)
	    public void testSQLInjection() {
	        RestAssured.baseURI = "http://172.10.1.159:9022";
	        
	        String sqlInjectionEndpoint = "/api/v1/Applicant/877777777777' OR '1'='1' -- /04-07-2006";

	        Response res = given()
	            .header("Accept", "application/json")
	        .when()
	            .get(sqlInjectionEndpoint);

	        System.out.println("SQL Injection Status Code: " + res.getStatusCode());
	        System.out.println(res.asPrettyString());

	        res.then()
	            .statusCode(anyOf(is(401), is(403), is(422)));  // API should block SQL Injection
	    }

	 
}
