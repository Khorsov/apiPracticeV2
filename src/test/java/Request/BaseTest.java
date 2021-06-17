package Request;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
    @AfterAll
    public static void cleanup() {
        RestAssured.reset();
    }
}
