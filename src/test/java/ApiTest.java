import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTest {
    @Test
    public void test(){
          
        
    System.out.println("Test çalıştı");
    assertEquals(200, given().get("https://restful-booker.herokuapp.com/booking").statusCode());
        given().get("https://restful-booker.herokuapp.com/booking").prettyPrint();

    }
}
