package APIAutomation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

//import io.restassured.response.Response;


public class CreateUser 
{
	@Test
    void test_CreateUser(ITestContext context)
    {
    	Faker faker=new Faker();
    	
    	JSONObject data=new JSONObject(); //data for processing.
    	data.put("name",faker.name().fullName());
    	data.put("gender","Male");
    	data.put("email",faker.internet().emailAddress());
    	data.put("status","inactive");
    	
    	String bearer_token="e5496e68e982a0e26b740f3b01cfa4895c71eb7cd17422e46692b238f72999f4";
    	
    	int id=given()
    	    .headers("Authorization","Bearer "+bearer_token)
    	    .contentType("application/json")
    	    .body(data.toString())
    	.when()
    	    .post("https://gorest.co.in/public/v2/users")
    	    .jsonPath().getInt("id");
    	
    	System.out.println("Genarated Id is :"+id);
    	
    	//context.setAttribute("user_id",id);// this variable is available only in test level.
    	context.getSuite().setAttribute("user_id",id);
    }
}
