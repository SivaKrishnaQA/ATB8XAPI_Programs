package org.example.sampleCheck;

import io.restassured.RestAssured;

public class ApiTest001 {
    public static void main(String[] args) {


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
