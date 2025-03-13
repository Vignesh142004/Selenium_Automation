package APIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUserDetails 
{
	 
	 @Test
     void test_getUser(ITestContext context)
     {
		 int id=(int) context.getSuite().getAttribute("user_id"); //this value should come from CreateUser class.
		 
		 String bearer_token="e5496e68e982a0e26b740f3b01cfa4895c71eb7cd17422e46692b238f72999f4";
    	 given()
    	    .headers("Authorization","Bearer "+bearer_token)
    	    .pathParam("id",id)
    	 .when()
    	    .get("https://gorest.co.in/public/v2/users/{id}")
    	 
    	 .then()
    	    .statusCode(200)
    	    .log().all();
     }
}
