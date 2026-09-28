package com.example.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostsApiTest {

    @Test
    void shouldReturnPostById() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/posts/1")
        .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1));
    }
}
