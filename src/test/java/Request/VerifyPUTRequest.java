package Request;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VerifyPUTRequest extends BaseTest{

    @DisplayName("PUT//posts/1")
    @Test
    public void verifyPUTRequest(){
        PostJSONPOJO ps2 = new PostJSONPOJO();
        ps2.setUserId(expectedValue);
        ps2.setId(expectedID);
        ps2.setTitle(expectedTitle);
        ps2.setBody(expectedBody);
                given().body(ps2).
                when().put("/posts/1").
                then().statusCode(status200)
        ;


    }
    @DisplayName("Negative PUT//post/1")
    @Test
    public void verifyNegativePUTRequest(){
        PostJSONPOJO ps2 = new PostJSONPOJO();
        ps2.setUserId(expectedValue);
        ps2.setId(expectedID);
        ps2.setTitle(expectedTitle);
        ps2.setBody(expectedBody);
                given().body(ps2).
                when().put("/post/1").
                then().statusCode(status404)
        ;


    }
}
