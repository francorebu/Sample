package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUserTest {

    @Test
    public void getUserDetails() {
        // Set base URL
        RestAssured.baseURI = "https://reqres.in/api";

        // Send GET request and retrieve the response
        Response response = given()
                .when()
                .get("/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Validate the response
        response.then()
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"))
                .body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
    }
}
