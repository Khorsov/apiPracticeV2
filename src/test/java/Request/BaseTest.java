package Request;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    public int expectedValue = 3;
    public int expectedID = 101;
    public String expectedTitle = "CreatedPostTitle";
    public String expectedBody = "Body of created post";

    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
    @AfterAll
    public static void cleanup() {
        RestAssured.reset();
    }
}
