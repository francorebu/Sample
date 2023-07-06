package apitests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.User;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostCreateUser {

    private final Gson gson = new Gson();

    @Test
    public void testCreateUser() {
        String endpoint = "https://reqres.in/api/users";
        User user = new User("morpheus", "leader");
        String requestBody = gson.toJson(user);

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .statusCode(201) // Assuming you expect a 201 status code for successful creation
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));
    }
}

