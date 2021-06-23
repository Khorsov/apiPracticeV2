package Request;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    static final int expectedValue = 4;
    static final int expectedID = 33;
    static final String expectedTitle = "qui explicabo molestiae dolorem";
    static final String expectedBody = "rerum ut et numquam laborum odit est sit\n" +
            "id qui sint in\n" +
            "quasi tenetur tempore aperiam et quaerat qui in\n" +
            "rerum officiis sequi cumque quod";
    static final int status200 =200;
    static final int status404 =404;
    static final int status201 =201;
    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
    @AfterAll
    public static void cleanup() {
        RestAssured.reset();
    }
}
