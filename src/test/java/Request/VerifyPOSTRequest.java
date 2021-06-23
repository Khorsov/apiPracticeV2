package Request;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VerifyPOSTRequest extends BaseTest {

    @DisplayName("POST//posts")
    @Test
    public void verifyPOSTPosts(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);
        ps.setId(expectedID);
        ps.setTitle(expectedTitle);
        ps.setBody(expectedBody);

                Response response = given().body(ps).
                when().post("/posts").
                then().statusCode(status200).extract().response();




    }
    @DisplayName("Negative wrong endpoint POST//post")
    @Test
    public void verifyWrongEndpointPOSTPost(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(expectedValue);
        ps.setId(expectedID);
        ps.setTitle(expectedTitle);
        ps.setBody(expectedBody);

                given().body(ps).
                when().post("/post").
                then().statusCode(status404);
    }

}
