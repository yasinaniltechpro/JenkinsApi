import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTest {
    @Test
    public void get01(){

//        i)   Set the URL
        String url = "https://restful-booker.herokuapp.com/booking/";

//        ii)  Set the expected data


//        iii) Send the request and get the response
        Response response = given().when().get(url);//User sends a GET Request to the url
        response.prettyPrint();

//        iv)  Do assertion
        response.
                then().
                statusCode(200).//HTTP Status Code should be 200
                contentType("application/json").//Content Type should be JSON
                statusLine("HTTP/1.1 200 OK");//Status Line should be HTTP/1.1 200 OK

    }
}
