package Request;

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
        ps.setUserId(3);
        ps.setId(101);
        ps.setTitle("CreatedPostTitle");
        ps.setBody("Body of created post");

        given().body(ps).
        when().post("/posts").
                then().statusCode(201);
        assertThat( ps.getTitle() , is ("CreatedPostTitle") ) ;

    }
    @DisplayName("Negative wrong endpoint POST//post")
    @Test
    public void verifyWrongEndpointPOSTPost(){
        PostJSONPOJO ps = new PostJSONPOJO();
        ps.setUserId(3);
        ps.setId(101);
        ps.setTitle("CreatedPostTitle");
        ps.setBody("Body of created post");

        given().body(ps).
                when().post("/post").
                then().statusCode(404);
    }

}