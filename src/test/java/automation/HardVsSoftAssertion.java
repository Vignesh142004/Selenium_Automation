package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion 
{
	@Test(priority=2)
	void HardAssertion()
	{
		System.out.println("testing..");
		System.out.println("testing..");
		
		Assert.assertEquals("abc","xyz");// HardAssertion 
		
		//when the hard assertion get failed the rest of the code will not executed.
		System.out.println("testing..");
		System.out.println("testing..");	
	}
	
	@Test(priority=1)
	void SoftAssertion()
	{
		System.out.println("testing..");
		System.out.println("testing..");
		
		SoftAssert sa=new SoftAssert();//SoftAssertion 
		sa.assertEquals(123,"123");
		
		//when the soft assertion is failed the rest of the code will execute.
		System.out.println("testing..");
		System.out.println("testing..");
		
		sa.assertAll();// at end of softAssert we need to use assertAll().
			
	}
	
  
}
