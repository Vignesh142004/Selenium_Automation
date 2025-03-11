package APIAutomation;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo 
{
  //@Test(priority=1)
   void testCookies()
   {
	   given()
	   
	   .when()
	       .get("https://www.google.com/")
	   
	   .then()
	       .log().all();
   }
	@Test(priority=2)
	void getCookiesInfo()
	{
		Response res=given()
		
		.when()
		    .get("https://www.google.com/");
		
		//1)Get single cookie info
		//String cookie_value=res.getCookie("AEC");
		//System.out.println("The value of Cookie is==>"+cookie_value);
		
		//2)Get all cookies info
		Map<String,String>cookies=res.getCookies();
		for(Map.Entry<String,String> m:cookies.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	} 
}
