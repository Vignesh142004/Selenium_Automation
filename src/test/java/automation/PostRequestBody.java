package APIAutomation;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PostRequestBody 
{
   //1)Post request body using HashMap.
	
	//@Test(priority=1)
	void testUsingHashMap()
	{
		HashMap data=new HashMap();
		data.put("name","Scott");
		data.put("location","france");
		data.put("phone","123456");
		
		String courseArr[]= {"C","C++"};
		
		data.put("course", courseArr);
		
		given()
		   .contentType("application/json")
		   .body(data)
		.when()
		   .post("http://localhost:3000/students")
		   
		.then()
		   .statusCode(201)
		   .body("name",equalTo("Scott"))
		   .body("location",equalTo("france"))
		   .body("phone",equalTo("123456"))
		   .body("course[0]",equalTo("C"))
		   .body("course[1]",equalTo("C++"))
		   .header("Content-Type","application/json")
		   .log().all();
	}
	
	//2)Post request body using org.json.
	
		//@Test(priority=2)
		void testUsingJsonLibrary()
		{
			JSONObject data =new JSONObject();
			data.put("name","Kiran");
			data.put("location","London");
			data.put("phone","987456");
			String courseArr[]= {"Java","Selenium"};
			
			data.put("course", courseArr);
			
			given()
			   .contentType("application/json")
			   .body(data.toString())
			.when()
			   .post("http://localhost:3000/students")
			   
			.then()
			   .statusCode(201)
			   .body("name",equalTo("Kiran"))
			   .body("location",equalTo("London"))
			   .body("phone",equalTo("987456"))
			   .body("course[0]",equalTo("Java"))
			   .body("course[1]",equalTo("Selenium"))
			   .header("Content-Type","application/json")
			   .log().all();
		}
		//3)Post request body using POJO class.
		
			//@Test(priority=3)
			void testUsingPOJOClass()
			{
				Pojo_PostRequest data=new Pojo_PostRequest();
				data.setName("Mathew");
				data.setLocation("Paris");
				data.setPhone("987458");
				
				String courseArr[]= {"Java","Selenium"};
				data.setCourses(courseArr);
				
				given()
				   .contentType("application/json")
				   .body(data)
				.when()
				   .post("http://localhost:3000/students")
				   
				.then()
				   .statusCode(201)
				   .body("name",equalTo("Mathew"))
				   .body("location",equalTo("Paris"))
				   .body("phone",equalTo("987458"))
				   .body("Courses[0]",equalTo("Java"))
				   .body("Courses[1]",equalTo("Selenium"))
				   .header("Content-Type","application/json")
				   .log().all();
			}
			//4)Post request body using External Jar file.
			@Test(priority=4)
			void testUsingExternalJar() throws FileNotFoundException
			{
				File f=new File(".\\body.json");
				FileReader fr=new FileReader(f);
				JSONTokener jt=new JSONTokener(fr);
				JSONObject data=new JSONObject(jt);
				
				given()
				   .contentType("application/json")
				   .body(data.toString())
				.when()
				   .post("http://localhost:3000/students")
				   
				.then()
				   .statusCode(201)
				   .body("name",equalTo("Mathew"))
				   .body("location",equalTo("Paris"))
				   .body("phone",equalTo("987458"))
				   .body("couses[0]",equalTo("Java"))
				   .body("couses[1]",equalTo("Selenium"))
				   .header("Content-Type","application/json")
				   .log().all();
			}
			
	
	
}
