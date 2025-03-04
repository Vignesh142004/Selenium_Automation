package automation;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
/*1)Login  -->@BeforeMethod
2)Search   -->@Test
3)Logout   -->@AfterMethod
4)Login
5)Advance Search
6)Logout
*/
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
	@BeforeClass
	void login()
	{
		System.out.println("This is Login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is Search");
	}
	
	@Test(priority=2)
	void Advancesearch()
	{
		System.out.println("This is Advance Search");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is Logout");
	}
  
}
