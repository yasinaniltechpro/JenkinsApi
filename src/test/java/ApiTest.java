import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTest {
    @Test
    public void test(){
          
        
    System.out.println("Test çalıştı");
    assertEquals(200, given().get("https://petstore.swagger.io/v2/pet/1").statusCode());
        given().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available&status=available").prettyPrint();

    }
}
