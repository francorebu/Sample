package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUserTest extends BaseAPITest {

    @Test
    public void getUserDetails() {


        Response response =
                given()
                .when()
                    .get("/users/2")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();


        response.then()
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"));
    }
}
