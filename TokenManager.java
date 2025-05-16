//package steno;
//
//import org.json.simple.JSONObject;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//
//public class TokenManager {
//    private static String accessToken = null;
//    private static long tokenExpiryTime = 0; // Expiry time in seconds
//
//    public static String getAccessToken() {
//        long currentTime = System.currentTimeMillis() / 1000; // Get current time in seconds
//
//        // If token is missing or expired, fetch a new one
//        if (accessToken == null || currentTime >= tokenExpiryTime) {
//            System.out.println("Fetching new token...");
//
//            // Create JSON request body
//            JSONObject requestBody = new JSONObject();
//            requestBody.put("userCode", "");
//            requestBody.put("userName", "Iyyappan");
//            requestBody.put("password", "admin@1234");
//
//            // Make API request
//            Response response = RestAssured.given()
//                    .baseUri("http://172.10.1.159:9022")
//                    .basePath("/api/Account/authenticate")
//                    .header("Content-Type", "application/json")
//                    .body(requestBody.toString()) // Convert JSONObject to String
//                    .post();
//
//            // Debugging: Print full response
//            System.out.println("Raw Response: " + response.asString());
//            System.out.println("HTTP Status Code: " + response.statusCode());
//
//            if (response.statusCode() == 200) {
//                try {
//                    JSONObject jsonResponse = new JSONObject(response.asString());
//
//                    // ✅ FIX: Print full response if "data" key is missing
//                    if (!jsonResponse.has("data")) {
//                        throw new RuntimeException("Error: 'data' field not found. Full Response: " + jsonResponse);
//                    }
//
//                    JSONObject dataObject = jsonResponse.getJSONObject("data");
//
//                    // ✅ FIX: Check for 'jwToken' properly
//                    if (!dataObject.has("jwToken")) {
//                        throw new RuntimeException("Error: 'jwToken' missing in response. Full Response: " + jsonResponse);
//                    }
//
//                    accessToken = dataObject.getString("jwToken");

//                    // ✅ Set expiry time (current time + 1 hour)
//                    tokenExpiryTime = currentTime + 3600;
//
//                    System.out.println("New token stored: " + accessToken);
//                } catch (Exception e) {
//                    throw new RuntimeException("Error parsing JSON response: " + e.getMessage());
//                }
//            } else {
//                throw new RuntimeException("Failed to fetch token. HTTP Status: " + response.statusCode());
//            }
//        } else {
//            System.out.println("Using existing token: " + accessToken);
//        }
//
//        return accessToken;
//    }
//
//    public static void main(String[] args) {
//        try {
//            // Fetch and use token
//            String token = getAccessToken();
//
//            // Example: Use token in another API request
//            Response response = RestAssured.given()
//                    .header("Authorization", "Bearer " + token)
//                    .get("http://your-api-endpoint.com/protected-resource");
//
//            System.out.println("Response: " + response.asString());
//        } catch (Exception e) {
//            System.err.println("Error occurred: " + e.getMessage());
//        }
//    }
//}
