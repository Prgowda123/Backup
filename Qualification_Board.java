package steno;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Qualification_Board {
	private static final String AUTH_TOKEN="bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpeXlhcHBhbiIsImp0aSI6IjhmNmEyZDc5LTE3OGQtNDkxNC1hNmZkLTZjMzRhMTRmMjZlNyIsImVtYWlsIjoiaXl5YXBwYW5yQGdtYWlsLmNvbSIsInVpZCI6ImViZWQ5ZTZlLTdlNmMtNDBkMS1iNTNlLWFhMjAzNmY2ZmEzMSIsImlwIjoiMTcyLjEwLjEuMTU5IiwidW5vIjoiaXl5YXBwYW4iLCJyb2xlcyI6WyJBcHBsaWNhbnQiLCJTdXBlckFkbWluIiwiQWRtaW4iXSwiZXhwIjoxNzQzMDU2MjkyLCJpc3MiOiJDb3JlSWRlbnRpdHkiLCJhdWQiOiJDb3JlSWRlbnRpdHlVc2VyIn0.vxZY9sJc3MrE2MeF6ckzhsc2Ud8Eh-_myPZsm7W8IbI";
@Test(priority=1,enabled=true)
public void sample()
{
	RestAssured.baseURI="http://172.10.1.159:9022";
	RequestSpecification req = RestAssured.given()
			.header("Authorization",AUTH_TOKEN)
			.header("Accept", "application/json");
	JSONObject obj = new JSONObject();
	obj.put("code", "BA");
	obj.put("title", "Gowdauniversity");
	obj.put("isEquivalent", false);
	obj.put("orderIndex", 20);
	obj.put("isApplicableForPUC", true);
	obj.put("isApplicableForSSLC", true);
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	
	Response res = req.request(Method.POST,"/api/QualificationBoard");
	System.out.println(res.statusCode());
	System.out.println(res.asPrettyString());
}

@Test(priority=2,enabled=true)

public void get()
{
	RestAssured.baseURI="http://172.10.1.159:9022";
	RequestSpecification req = RestAssured.given().header("Authorization",AUTH_TOKEN).header("Accept","application/json");
	req.contentType(ContentType.JSON);
	Response res = req.request(Method.GET,"/api/QualificationBoard");
	System.out.println(res.asPrettyString());
}

@Test(priority=3, enabled=true)
public void delete() {
	
	RestAssured.baseURI="http://172.10.1.159:9022";
	RequestSpecification req = RestAssured.given().header("Authorization",AUTH_TOKEN).header("Accept","application/json");

	JSONObject obj = new JSONObject();
	obj.put("code", "BA");
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	Response res = req.request(Method.DELETE,"/api/QualificationBoard");
	System.out.println(res.statusCode());
	System.out.println(res.asPrettyString());
	
}
}
