package org.example.lesson8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestEcho {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void getRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void postRequest() {
        String body = "{\"user\": \"Alex\", \"age\": 25, \"active\": true}";

        given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data.user", equalTo("Alex"))
                .body("data.age", equalTo(25))
                .body("data.active", equalTo(true))
                .body("json.user", equalTo("Alex"))
                .body("json.age", equalTo(25))
                .body("json.active", equalTo(true));
    }

    @Test
    public void postFormData() {
        given()
                .formParam("username", "Masha")
                .formParam("email", "masha@example.com")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.username", equalTo("Masha"))
                .body("form.email", equalTo("masha@example.com"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void putRequest() {
        String requestBody = "{\"update\": \"true\", \"id\": 1}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data.update", equalTo("true"))
                .body("data.id", equalTo(1))
                .body("headers.host", equalTo("postman-echo.com"));
    }

    @Test
    public void PatchRequest() {
        String requestBody = "{\"update\": \"true\", \"id\": 1}";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data.update", equalTo("true"))
                .body("data.id", equalTo(1))
                .body("headers.host", equalTo("postman-echo.com"));
    }

    @Test
    public void deleteRequest() {
        given()
        .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/delete"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
}

