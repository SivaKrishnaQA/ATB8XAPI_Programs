package org.example.sampleCheck;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTest002_TestNG {
@Test
    public void testApiTest002() {
        System.out.println("Running ApiTest002");

    RestAssured.
            given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
            .when()
                .get()
            .then()
                .log().all()
                .statusCode(200);

    System.out.println("API Test 001 passed successfully!");
    }
}
