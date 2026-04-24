package apitests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseAPITest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
        RestAssured.requestSpecification = RestAssured
                .given()
                .header("x-api-key", "reqres_390a72285773426ab93310ff2bbe9c70");
    }
}
