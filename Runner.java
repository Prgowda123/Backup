package pojo_get_details;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner {
@Test
public void sample()
{
	  RestAssured.baseURI = "http://172.10.1.159:9025";
	    RequestSpecification req = RestAssured.given();
	    Response res = req.request(Method.GET, "/api/v1/Applicant/3000136/details");

	 
	    Details detailsResponse = res.as(Details.class);

	    Data data = detailsResponse.getData();

	    System.out.println(data.getAadharNo());
	    System.out.println(data.getApplicantName());
	    System.out.println(data.getAppliedUnitCode());
	    System.out.println(data.getIdentityCard());
	    System.out.println(data.getReservations());
	    System.out.println(data.getAppliedPost());
	    System.out.println(detailsResponse.isSucceed());
	    System.out.println(detailsResponse.getMessage());
	    System.out.println(detailsResponse.getErrors());
}
}
