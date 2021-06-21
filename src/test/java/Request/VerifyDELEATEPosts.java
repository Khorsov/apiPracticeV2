package Request;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VerifyDELEATEPosts extends BaseTest {
    @DisplayName("DELETE//posts/1")
    @Test
    public void verifyDELETEPosts(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);


                given().body(ps).
                when().delete("posts/1").
                then().statusCode(200);
    }
    @DisplayName("Negative DELETE//posts/1")
    @Test
    public void verifyNegativeDELETEPosts(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);


                given().body(ps).
                when().delete("post/1").
                then().statusCode(404);
    }
}
