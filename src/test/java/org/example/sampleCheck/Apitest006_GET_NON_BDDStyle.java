package org.example.sampleCheck;

import io.restassured.RestAssured;
import io.restassured.internal.SpecificationMerger;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Apitest006_GET_NON_BDDStyle {
    @Test
    public void NON_BDDStyle_PositiveTC() {
        String pincode = "52201";
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/" + pincode);
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Test
    public void NON_BDDStyle_negativeTC()
    {
       String pincode = "52";
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/"+pincode);
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}
