package automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations 
{
	@BeforeSuite
	void bs()
	{
		System.out.println("This  is executed before suite..");
	}
	
	@AfterSuite
	void as() 
	{
		System.out.println("This  is executed after suite..");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This  is executed before test..");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This  is executed after test..");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This  is executed before class..");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This  is executed after class..");
	}
	
	@BeforeMethod
	void login()
	{
		System.out.println("This  is executed before  test method..");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This  is executed after test method..");
	}
	
	@Test(priority=1)
	void abc()
	{
		System.out.println("This  is a abc method..");
	}
	
	@Test(priority=2)
	void xyz()
	{
		System.out.println("This  is a xyz method..");
	}
	
	@Test(priority=3)
	void pqr()
	{
		System.out.println("This  is a pqr method..");
	}



}
