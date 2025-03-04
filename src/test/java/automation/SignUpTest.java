package automation;

import org.testng.annotations.Test;

public class SignUpTest 
{

	@Test(priority=1,groups= {"regression"})
	void signupbyEmail()
	{
		System.out.println("This signUp by Email..");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupbyFacebook()
	{
		System.out.println("This signup by Facebook..");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupbyTwitter()
	{
		System.out.println("This signup by Twitter..");
	}

}
