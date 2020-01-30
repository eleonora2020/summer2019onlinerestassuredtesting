package com.automation.tests.day2;

import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExchangeRatesAPITests {
    private String baseURI = "http://api.openrates.io/";  //google: open source APIs for practice

    @Test
    public void test1() {
        Response response = given().get(baseURI + "latest");
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());
    }
public void test2() {
        Response response = given().get(baseURI+"latest");
        //verify that content type is json
    assertEquals(200, response.getStatusCode());

}
}
