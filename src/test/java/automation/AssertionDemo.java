package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{
	@Test
    void testTitle()
    {
    	String actual_title="opencart";
    	String expected_title="openslot";
    	
    	//General validation.
    	/*if(actual_title.equals(expected_title))
    	{
    		System.out.println("The testcase passed.");
    	}
    	else
    	{
    		System.out.println("The testcase failed.");
    	}
    	*/
    	
    	//Assertion validation.
    	Assert.assertEquals(actual_title, expected_title);
    	
    }
}
