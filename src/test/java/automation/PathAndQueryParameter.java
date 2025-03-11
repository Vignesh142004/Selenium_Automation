package APIAutomation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

public class PathAndQueryParameter 
{
	
	//https://reqres.in/api/users?delay=3
	
	@Test
	void testQueryAndPathParameter()
	{
		given()
		  .pathParam("mypath","users")//path parameter
		  .queryParam("delay",3)//query parameter
		
		.when()
		  .get("https://reqres.in/api/{mypath}")
		  
		.then()
		   .statusCode(200)
		   .log().all();
		   
	}

}
