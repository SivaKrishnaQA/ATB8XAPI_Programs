package org.example.sampleCheck;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTest_007_Post_BDDStyle {
    @Test
    public void PostRequestBDDStyle_PositiveTC(){
        String POST_Payload =  "{\n" +
                                            "    \"username\" : \"admin\",\n" +
                                            "    \"password\" : \"password123\"\n" +
                                            "}";
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log().all()
                .body(POST_Payload)
                .when().log().all()
                .post()
                .then().log().all().statusCode(200);
    }

}
