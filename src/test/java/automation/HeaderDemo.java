package APIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeaderDemo 
{
	//@Test(priority=1)
    void testHeader()
    {
    	given()
    	
    	.when()
    	    .get("https://www.google.com/")
    	
    	.then()
    	    .header("Content-Type","text/html; charset=ISO-8859-1")
    	    .header("Content-Encoding","gzip")
    	    .header("Server","gws")
    	    .log().all();
    }
	
	@Test(priority=2)
	void getHeader()
	{
		Response res=given()
		
		.when()
		    .get("https://www.google.com/");
		
		//1)Getting a single header Info.
		
		//String header_value=res.getHeader("Content-Type");
		//System.out.println("The value of Content-Type:"+header_value);
		
		//2)Get all header Info.
		Headers headers=res.getHeaders();
		for(Header hd:headers)
		{
			System.out.println(hd.getName()+"  "+hd.getValue());
		}
		
		   
	}
}
