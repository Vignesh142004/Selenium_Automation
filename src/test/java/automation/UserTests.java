package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints2;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests 
{
	Faker faker;
	User userpayload;
	@BeforeClass
    public void setUpData()
    {
    	faker=new Faker();
    	userpayload=new User();
    	userpayload.setId(faker.idNumber().hashCode());
    	userpayload.setUsername(faker.name().username());
    	userpayload.setFirstName(faker.name().firstName());
    	userpayload.setLastName(faker.name().lastName());
    	userpayload.setEmail(faker.internet().safeEmailAddress());
    	userpayload.setPassword(faker.internet().password(5, 10));
    	userpayload.setPhone(faker.phoneNumber().cellPhone());
    }
	
	@Test(priority=1)
	public void testPostUser()
	{
		Response response=UserEndpoints2.createUser(userpayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Test(priority=2)
	public void testGetUserByName()
	{
		Response response=UserEndpoints2.readUser(this.userpayload.getUsername());
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),404);
	}
	
	@Test(priority=3)
	public void testUpdateUserByName()
	{
		//update user details
		userpayload.setFirstName(faker.name().firstName());
    	userpayload.setLastName(faker.name().lastName());
    	userpayload.setEmail(faker.internet().safeEmailAddress());
    	
		Response response=UserEndpoints2.updateUser(this.userpayload.getUsername(),userpayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Test(priority=4)
	public void testDeleteUserByName()
	{
		Response response=UserEndpoints2.deleteUser(this.userpayload.getUsername());
		
		Assert.assertEquals(response.getStatusCode(),200);
	}
}
