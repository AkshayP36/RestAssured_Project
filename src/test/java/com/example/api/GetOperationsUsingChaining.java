package com.example.api;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GetOperationsUsingChaining {
    public static void main(String[] args) {
        baseURI = "https://restful-booker.herokuapp.com/";
        Response response = given().get("/booking");
        System.out.println(response.asPrettyString());
    }
}
