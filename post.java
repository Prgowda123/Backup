package apc_kk;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class post {
@Test
public void sample()
{
	RestAssured.baseURI="http://172.10.1.159:9022";
	RequestSpecification req = RestAssured.given()
	 .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJzdHJpbmciLCJqdGkiOiI3MzNiOThmZi03MzgwLTQyYTItODgwZi02M2Y3Y2U0Njg1MTIiLCJlbWFpbCI6InN0cmluZyIsInVpZCI6IjEwYTk4ODBkLWI4NzctNDAxOC1iMzNiLTQxYzhiNWQ0MDQzZCIsImlwIjoiMTcyLjEwLjEuMTU5IiwidW5vIjoic3RyaW5nIiwicm9sZXMiOiJBZG1pbiIsImV4cCI6MTc0MDEyMzM5MiwiaXNzIjoiQ29yZUlkZW50aXR5IiwiYXVkIjoiQ29yZUlkZW50aXR5VXNlciJ9.pBjrwGdUqYvHZztn9UnMPogrZqre83vRK2yCtKwB3YI")  // 🔹 Replace with valid token
     .header("Accept", "application/json");
	Response res = req.request(Method.GET,"/api/v1/Applicant/877777777777/04-07-2006");
	System.out.println(res.getStatusCode());
	System.out.println(res.asPrettyString());
	
}
}
