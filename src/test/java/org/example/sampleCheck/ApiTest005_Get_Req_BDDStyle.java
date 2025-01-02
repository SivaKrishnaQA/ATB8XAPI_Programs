package org.example.sampleCheck;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTest005_Get_Req_BDDStyle {

        @Test
        public void TestGETRequest_PositiveTC(){
            // Test case implementation goes here
            String pincode = "52201";
            RestAssured
                    .given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("/us/"+pincode)
                    .when()
                        .log().all()
                        .get()
                    .then()
                    .log().all()
                    .statusCode(200);
    }

        @Test
        public void TestGETRequest_negativeTC(){
            // Test case implementation goes here
            String pincode = "-1";
            RestAssured
                    .given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("/us/"+pincode)
                    .when()
                        .log().all()
                        .get()
                    .then()
                    .log().all()
                    .statusCode(200);
    }
}
