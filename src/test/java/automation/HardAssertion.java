package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	
	@Test
	void testcase()
	{
		//Assert.assertEquals("abc","abc");//passed.
		//Assert.assertEquals(123,123);//passed.
	    //Assert.assertEquals("345",345);//failed.
		
		
		//Assert.assertNotEquals(123,123);//failed.
		//Assert.assertNotEquals("123","abc");//passed
		
		//Assert.assertTrue(true);//passed.
		//Assert.assertTrue(false);//failed.
		
		//Assert.assertFalse(false);//passed.
		//Assert.assertFalse(true);//failed.
		
		Assert.fail();
		
		
		
		 
	}

}
