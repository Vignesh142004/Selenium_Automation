package APIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

public class XMLSchemaValidation 
{
	@Test(priority=1)
    void testXMLSchemavalidation()
    {
    	given()
    	
    	.when()
    	   .get("https://www.ebi.ac.uk/ebisearch/ws/rest/uniprotkb?query=insulin")
    	
    	.then()
    	    .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlSchema.xsd")); 	  
    	
    }
}
