package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod 
{
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods={"openApp"})
	void login()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(false);
	}

}
