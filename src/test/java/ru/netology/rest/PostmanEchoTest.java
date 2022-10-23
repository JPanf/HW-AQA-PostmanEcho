package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {
    @org.junit.jupiter.api.Test
    void postRequest() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some more data")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data",equalTo("some data"))
        ;
    }
}