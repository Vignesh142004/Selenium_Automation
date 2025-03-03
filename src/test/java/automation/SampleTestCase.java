package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTestCase {

	public static void main(String[] args) 
	{
        WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("TestCase Passed.");
		}
		else
		{
			System.out.println("TestCase failed.");
		}
		
		//driver.quit();
		

	}

}
