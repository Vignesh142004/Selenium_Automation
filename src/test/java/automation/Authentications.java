package APIAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Authentications 
{

   @Test(priority=1)
   void testBasicAuth() // Basic Authentication
   {
	   given()
	       .auth().basic("postman","password")
	   .when()
	       .get("https://postman-echo.com/basic-auth")
	   .then()
	       .statusCode(200)
	       .body("authenticated",equalTo(true))
	       .log().all();  
   }
   
   @Test(priority=2) //Digest Authentication.
   void testDigestAuth()
   {
	   given()
	       .auth().digest("postman","password")
	   .when()
	       .get("https://postman-echo.com/basic-auth")
	   .then()
	       .statusCode(200)
	       .body("authenticated",equalTo(true))
	       .log().all();  
   }
   
   @Test(priority=3) //Preemptive Authentication.
   void testPreemptiveAuth()
   {
	   given()
	       .auth().preemptive().basic("postman","password")
	   .when()
	       .get("https://postman-echo.com/basic-auth")
	   .then()
	       .statusCode(200)
	       .body("authenticated",equalTo(true))
	       .log().all();  
   }
   
   //@Test(priority=4)
   void testBearerTokenAuth()
   {
	   String bearerToken="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";
	   
	   given()
	      .headers("Authorization","Bearer "+bearerToken)
	   .when()
	      .get("https://api.github/user/repos")
	   .then()
	      .statusCode(200)
	      .log().all(); 
   }
   
   //@Test(priority=5)
   void testOAuth2Auth()
   {
	   given()
	       .auth().oauth2("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")
	   .when()
	       .get("https://api.github/user/repos")
	   .then()
	       .statusCode(200)
	       .log().all();   
   }
   
   //@Test(priority=6)
   void testAPIKeyAuth()
   {
	   given()
	      .queryParam("Appid","536c0c89019d179a645de6455e7885ca")
	   .when()
	       .get("https://api.github/user/repos")
	   .then()
	       .statusCode(200)
	       .log().all();
   }
   
}
