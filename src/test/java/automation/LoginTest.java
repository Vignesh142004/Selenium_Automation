package automation;

import org.testng.annotations.Test;

public class LoginTest 
{
	
	@Test(priority=1,groups= {"sanity"})
	void loginbyEmail()
	{
		System.out.println("This login by Email..");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginbyFacebook()
	{
		System.out.println("This login by Facebook..");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginbyTwitter()
	{
		System.out.println("This login by Twitter..");
	}

}
