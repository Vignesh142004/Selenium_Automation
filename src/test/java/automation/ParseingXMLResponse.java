package APIAutomation;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParseingXMLResponse 
{
   //@Test(priority=1)
   void testXMLResponse()
   {
	   
	   //Approach 1(By using XPath)
	   
	   /*given()
	   
	   .when()
	       .get("https://www.ebi.ac.uk/ebisearch/ws/rest/uniprotkb?query=insulin")
	       
	   .then()
	       .statusCode(200)
	       .header("Content-Type","application/xml;charset=UTF-8")
	       .body("result.hitCount",equalTo("38069"))
	       .log().all();*/
	   
	   //Approach 2(By referencing using variable)
       Response res=given()
	   
	   .when()
	       .get("https://www.ebi.ac.uk/ebisearch/ws/rest/uniprotkb?query=insulin");
	     
       Assert.assertEquals(res.statusCode(),200); // validation 1
       Assert.assertEquals(res.header("Content-Type"),"application/xml;charset=UTF-8");//validation 2
	 
	   
   }
   @Test(priority=2)
   void testXMLResponseBody()
   {
	   
       Response res=given()
	   
	   .when()
	       .get("https://www.ebi.ac.uk/ebisearch/ws/rest/uniprotkb?query=insulin");
	     
       XmlPath xmlobj=new XmlPath(res.asString());
       List<String> entrys=xmlobj.getList("result.entries.entry");
       for(String en:entrys)
       {
    	   System.out.println(en);
       }
       Assert.assertEquals(entrys.size(),15); 
   }
}
