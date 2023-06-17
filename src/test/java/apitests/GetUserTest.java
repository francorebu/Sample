package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest {

    @Test
    public void validateResponseCode() {
        // Specify the API endpoint
        String endpoint = "https://reqres.in/api/users/2";

        // Send GET request and get the response
        Response response = RestAssured.get(endpoint);

        // Get the response code
        int statusCode = response.getStatusCode();

        // Validate the response code
        Assert.assertEquals(statusCode, 200, "Response code is not 200 (OK)");
    }
}

