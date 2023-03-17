import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTest {
    @Test
    public void test(){

    assertEquals(404, given().get("https://petstore.swagger.io/v2/pet/6546754768").statusCode());

    }
}
