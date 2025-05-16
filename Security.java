package steno;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;


public class Security {
	private static final String BASE_URL = "http://172.10.1.159:9022";  // ✅ Set Base URL
	private static final String AUTH_TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiOS1mhNjBjMWRmZmRjMTciLCJlbWFpbCI6InN0cmluZyIsInVpZCI6IjEwYTk4ODBkLWI4NzctNDAxOC1iMzNiLTQxYzhiNWQ0MDQzZCIsImlwIjoiMTcyLjEwLjEuMTU5IiwidW5vIjoic3RyaW5nIiwicm9sZXMiOiJBZG1pbiIsImV4cCI6MTc0MDQ4NDk1NywiaXNzIjoiQ29yZUlkZW50aXR5IiwiYXVkIjoiQ29yZUlkZW50aXR5VXNlciJ9.l0LiiRTzK50_ZeUblGLd6-q5rywxRyWT73om1zY5qkg";
 
	@Test(enabled=false)
	public void sample()
	{
		RestAssured.baseURI="http://172.10.1.159:9022";
		RequestSpecification req = RestAssured.given()
		 .header("Authorization", AUTH_TOKEN)  // 🔹 Replace with valid token
	     .header("Accept", "application/json");
		Response res = req.request(Method.GET,"/api/v1/Applicant/../../../../var/log/auth.log");
		System.out.println(res.getStatusCode());
		System.out.println(res.asPrettyString());
	}
	
	@Test(enabled=false)
	  public void testPathTraversal() {
        RestAssured.baseURI = "http://172.10.1.159:9022";

        for (int i = 1000; i < 10000; i++) {  // 🔹 Loop for 1000 requests
            RequestSpecification req = RestAssured.given()
                .header("Authorization",AUTH_TOKEN)  
                .header("Accept", "application/json");

            Response res = req.request(Method.GET, "/api/v1/Applicant/877777777777/04-07-2006");
            
            // Print status code for each attempt
            System.out.println("Attempt " + (i + 1) + " - Status Code: " + res.getStatusCode());

            // Optional: Print response if needed
            // System.out.println(res.asPrettyString());

            // Introduce a small delay to prevent server overload (optional)
            try {
                Thread.sleep(1);  // 🔹 100ms delay between requests
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
	@Test(enabled=true)
	public void headers()
	{
		RestAssured.baseURI="http://172.10.1.159:9022";
		RequestSpecification req = RestAssured.given()
		 .header("Authorization", AUTH_TOKEN)  // 🔹 Replace with valid token
	     .header("Accept", "application/json");
		Response res = req.request(Method.GET,"/api/v1/Applicant/987654521098/25-05-2005");
		System.out.println(res.getStatusCode());
	
		System.out.println("Headers: " + res.getHeaders());
	}
	
	
	    @Test(enabled=false)
	    public void testInformationDisclosure() {
	        Response res = RestAssured.given()
	            .header("Authorization", AUTH_TOKEN)
	            .header("Accept", "application/json")
	            .when()
	            .get(BASE_URL + "/api/v1/Applicant/877777777777/04-07-2006");

	        // ✅ Print all response headers
	        System.out.println("Headers: " + res.getHeaders());

	        // ✅ Check if API exposes sensitive headers
	     //   res.then().header("Server", not(containsString("Microsoft-IIS/10.0")));
	        // Should NOT expose server type
	    }

}
