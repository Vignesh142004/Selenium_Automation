package APIAutomation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser 
{
	 @Test
     void test_UpdateUser(ITestContext context)
     {
		 
		    int id=(int) context.getSuite().getAttribute("user_id");
		    Faker faker=new Faker();
	    	
	    	JSONObject data=new JSONObject(); //data for processing.
	    	data.put("name",faker.name().fullName());
	    	data.put("gender","Male");
	    	data.put("email",faker.internet().emailAddress());
	    	data.put("status","active");
	    	
	    	String bearer_token="e5496e68e982a0e26b740f3b01cfa4895c71eb7cd17422e46692b238f72999f4";
	    	
	    	given()
	    	    .headers("Authorization","Bearer "+bearer_token)
	    	    .contentType("application/json")
	    	    .pathParam("id",id)
	    	    .body(data.toString())
	    	.when()
	    	    .put("https://gorest.co.in/public/v2/users/{id}")
	    	    
	    	.then()
	    	    .statusCode(200)
	    	    .log().all();
	    	   
     }
}
