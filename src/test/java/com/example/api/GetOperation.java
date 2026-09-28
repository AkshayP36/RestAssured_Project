package com.example.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOperation {
    public static void main(String[] args) {
    
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/booking");
        
        System.out.println("Status code: "+ response.getStatusCode());
        // System.out.println("Response body: "+ response.getBody().asString());
        // System.out.println(response.prettyPrint());
        // System.out.println(response.asString());
    }
}
