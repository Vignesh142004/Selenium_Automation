package APIAutomation;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

/*
1)Get request.
https://reqres.in/api/users/2

2)Post request.
https://reqres.in/api/users
{
    "name": "morpheus",
    "job": "leader"
}
3)Put request.
https://reqres.in/api/users/2
{
    "name": "morpheus",
    "job": "zion resident"
}
4)Delete request.
https://reqres.in/api/users/2
	204
*/
import org.testng.annotations.Test;
public class HTTPRequest 
{
	int id;
	@Test(priority=1)
	void getUsers()
	{
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		
		.then()
		   .statusCode(200)
		   .body("page",equalTo(2))
		   .log().all();
	}
	
	@Test(priority=2)
	void createUser()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("user","rohit");
		data.put("job","cricketer");
		
		id=given()
		   .contentType("application/json")
		   .body(data)
		
		.when()
		   .post("https://reqres.in/api/users")
		   .jsonPath().getInt("id");
		   
//		.then()
//		   .statusCode(201)
//		   .log().all();
	}
	
	@Test(priority=3,dependsOnMethods={"createUser"})
	void updateUser()
	{
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("user","rohit");
		data.put("job","Coach"); // data has been changed.
		
		given()
		   .contentType("application/json")
		   .body(data)
		
		.when()
		   .put("https://reqres.in/api/users/"+id)
		   
		.then()
		   .statusCode(200)
		   .log().all();
	}
	
	@Test(priority=4)
	void deleteUser()
	{
		given()
		
		.when()
		   .delete("https://reqres.in/api/users/"+id)
		
		.then()
		   .statusCode(204)
		   .log().all();
	}
}
