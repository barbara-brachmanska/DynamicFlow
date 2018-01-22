package backend;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Requests {

    public Response get(String url){
        return given().accept(ContentType.JSON).when().get(url);
    }

    public Response post(String url, Map<String, String> header){
        return null;
    }
}
