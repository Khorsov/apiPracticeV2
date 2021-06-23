package Request;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.*;


public class VerifyGetRequest extends BaseTest{
    @DisplayName("GET//posts")
    @Test
    public void verifyGETPosts(){
                when().get("/posts").
                then().statusCode(status200);
    }
    @DisplayName("GET//posts/1")
    @Test
    public void verifyGETPostsFor1Object(){
                JsonPath response = when().get("/posts/"+expectedValue).
                then().statusCode(status200).extract().jsonPath();
        System.out.println(response.get("title"));
        System.out.println(expectedValue);

    }
    @DisplayName("GET//posts/1/comments")
    @Test
    public void verifyGETPostsOneComment(){
                when().get("/posts/1/comments").
                then().statusCode(status200);
    }
    @DisplayName("Negative keys with wrong endpoint /post")
    @Test
    public void verifyGETPostsNegativeWrongEndpoint() {
                when().get("/post").
                then().statusCode(status404);
    }
    @DisplayName("Negative keys with wrong path param /post/300")
    @Test
    public void verifyGETPostsNegativeWrongEndpoint2() {
                when().get("/posts/300").
                then().statusCode(status404);
    }
}
