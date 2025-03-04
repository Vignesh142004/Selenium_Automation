package automation;

import org.testng.annotations.Test;

/*
 * 1) Open Application.
 * 2) Login
 * 3) Logout
 * */

public class TestNGFirstTestCase 
{
	@Test(priority=1)
	void openApp()
	{
		System.out.println("Opening Application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login into Application");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout into Application");
	}

}
