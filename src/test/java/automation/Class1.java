package automation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 
{
	
	@Test
	void abc()
	{
		System.out.println("This is abc test..");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is executed before classes");
	}
  
}
