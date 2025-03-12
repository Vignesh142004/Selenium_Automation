package APIAutomation;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class ParsingJsonResponse 
{
    
	//@Test(priority=1)
	void testJsonResponse()
	{
		
		//Approach 1
		/*given()
		   .contentType("contentType.JSON")
		
		.when()
		   .get("http://localhost:3000/students")
		
		.then()
		   .statusCode(200)
		   .header("Content-Type","application/json")
		   .body("[2].name",equalTo("Kim"))
		   .log().all();*/
		
		//Approach 2
		
		Response res=given()
		   .contentType("contentType.JSON")
		
		.when()
		   .get("http://localhost:3000/students");
		
		Assert.assertEquals(res.getStatusCode(),200); //validation 1
		Assert.assertEquals(res.header("Content-Type"),"application/json");//validation 2
		String name=res.jsonPath().get("[2].name").toString();
		Assert.assertEquals(name,"Kim");
	}
	
	
	@Test(priority=2)
	void testJsonResponseBodyData()
	{
		
		Response res=given()
		   .contentType(ContentType.JSON)
		
		.when()
		   .get("http://localhost:3000/students");
		
		/*Assert.assertEquals(res.getStatusCode(),200); //validation 1
		Assert.assertEquals(res.header("Content-Type"),"application/json");//validation 2
		String name=res.jsonPath().get("[2].name").toString();
		Assert.assertEquals(name,"Kim");*/
		
		//JSONObject class
		JSONObject jo=new JSONObject(res.asString());
		
		for(int i=0;i<jo.getJSONArray("students").length();i++)
		{
			String name=jo.getJSONArray("students").getJSONObject(i).get("name").toString();
			System.out.println(name);
		}
		
		boolean status=false;
		for(int i=0;i<jo.getJSONArray("students").length();i++)
		{
			String name=jo.getJSONArray("students").getJSONObject(i).get("name").toString();
			if(name.equals("Kim"))
			{
				status=true;
				break;
			}
		}
		
		Assert.assertTrue(status);
	}
}
