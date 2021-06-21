package Request;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;


public class VerifyGetRequest extends BaseTest{
    @DisplayName("GET//posts")
    @Test
    public void verifyGETPosts(){
                when().get("/posts").
                then().statusCode(200);
    }
    @DisplayName("GET//posts/1")
    @Test
    public void verifyGETPostsFor1Object(){
                when().get("/posts/1").
                then().statusCode(200);
    }
    @DisplayName("GET//posts/1/comments")
    @Test
    public void verifyGETPostsOneComment(){
                when().get("/posts/1/comments").
                then().statusCode(200);
    }
    @DisplayName("Negative keys with wrong endpoint /post")
    @Test
    public void verifyGETPostsNegativeWrongEndpoint() {
                when().get("/post").
                then().statusCode(404);
    }
    @DisplayName("Negative keys with wrong path param /post/300")
    @Test
    public void verifyGETPostsNegativeWrongEndpoint2() {
                when().get("/posts/300").
                then().statusCode(404);
    }
}
