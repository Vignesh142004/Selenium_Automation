package APIAutomation;
import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;
public class DeleteUser 
{
   @Test
   void test_DeleteUser(ITestContext context)
   {
	   int id=(int) context.getSuite().getAttribute("user_id");
	   String bearer_token="e5496e68e982a0e26b740f3b01cfa4895c71eb7cd17422e46692b238f72999f4";
	   
	   given()
	       .headers("Authorization","Bearer "+bearer_token)
	       .pathParam("id",id)
	   .when()
	       .delete("https://gorest.co.in/public/v2/users/{id}")
	   .then()
	       .statusCode(204)
	       .log().all();
   }
}
