package apitests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetAvailablePetsTest extends BaseAPITest {

    @Test
    public void getUserDetails() {

        Response response =
                given()
                        .log().all()
                .when()
                        .get("/pet/findByStatus?status=available&status=available")
                .then()
                        .log().all()
                        .statusCode(200)
                        .extract()
                        .response();

        response.then()
                .body("[0].status", equalTo("available"));
                //.body("data.email", equalTo("janet.weaver@reqres.in"))
                //.body("data.first_name", equalTo("Janet"))
                //.body("data.last_name", equalTo("Weaver"));
    }
}