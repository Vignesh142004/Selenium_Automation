package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
/*
TestCase 
1)Launch browser(Chrome).
2)Open url https://demo.nopcommerce.com/
3)Validate title should be " nopCommerce demo store. Home page title".
4)Close browser.
*/
public class Testingtitle {

	public static void main(String[] args) {
		
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
		
		driver.quit();
		

	}

}
