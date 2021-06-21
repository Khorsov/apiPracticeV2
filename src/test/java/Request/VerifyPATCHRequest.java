package Request;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VerifyPATCHRequest extends BaseTest {

    @DisplayName("PATCH//posts/1")
    @Test
    public void verifyPATCHPosts(){

        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);


                given().body(ps).
                when().patch("posts/1").
                then().statusCode(200);
                assertThat( ps.getUserId() , is (expectedValue) ) ;

    }
    @DisplayName("Negative PATCH//post/1")
    @Test
    public void verifyNegativePATCHPosts(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);


                given().body(ps).
                when().patch("post/1").
                then().statusCode(404);


    }
}
