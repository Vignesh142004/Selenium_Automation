package APIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LoggingDemo 
{
	 @Test(priority=1)
     void testLogs()
     {
    	 given()
    	 
    	 
    	 .when()
    	     .get("https://www.google.com/")
    	 
    	 .then()
    	     .log().headers();
     }
}
