package automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 
{
	@Test
	void pqr()
	{
		System.out.println("This is pqr test...");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is executed before suite..");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is executed after suite..");
	}

}
