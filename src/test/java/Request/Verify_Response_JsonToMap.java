package Request;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPart;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Verify_Response_JsonToMap extends BaseTest{

    @Test
    public void test1(){
        Response response = given().accept(ContentType.JSON) //JSON
                .and().when().get("/posts/"+expectedID);
        //convert Json response to Java Collections(Map)
        //response.body().as(Map.class);
        Map<String,Object> postMap = response.body().as(Map.class);
        System.out.println( postMap.get("title"));
        System.out.println( postMap.get("userId"));
        System.out.println( postMap.get("id"));
        System.out.println( postMap.get("body"));
        Assertions.assertEquals(postMap.get("id"),expectedID);
        Assertions.assertEquals(postMap.get("userId"),expectedValue);
        Assertions.assertEquals(postMap.get("title"),expectedTitle);
        Assertions.assertEquals(postMap.get("body"),expectedBody);
    }


}
