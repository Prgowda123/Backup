package ddt;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Batchentry {

    @DataProvider(name = "userDataFromExcel")
    public Object[][] getDataFromExcel() throws Exception {
        return ExcelReader.getExcelData("D://Automation_data//api_ddt.xlsx", "Sheet1"); // Update the path and sheet name
    }

    @Test(dataProvider = "userDataFromExcel")
    public void reg(String userCode, String name, String phoneNo, String email, String userName, String password, String isAdmin) {
        RestAssured.baseURI = "http://172.10.1.159:9025";
        RequestSpecification req = RestAssured.given();

        // Create JSON object for the request body
        JSONObject obj = new JSONObject();
        obj.put("userCode", userCode);
        obj.put("name", name);
        obj.put("phoneNo", phoneNo);
        obj.put("email", email);
        obj.put("userName", userName);
        obj.put("password", password);
        obj.put("isAdmin", Boolean.parseBoolean(isAdmin)); // Convert string "true"/"false" to boolean

        req.contentType(ContentType.JSON);
        req.body(obj.toJSONString());

        // Send POST request
        Response res = req.post("/api/Account/register-batchentrymember");

        // Get the response and headers
        Headers ser = res.getHeaders();
        System.out.println(res.statusCode());
        System.out.println(ser);
        System.out.println(res.asPrettyString());
    }
}
