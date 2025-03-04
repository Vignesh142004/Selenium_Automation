package automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 
{
	@Test
	void xyz()
	{
		System.out.println("This is xyz test..");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is executed after classes");
	}
	
}
