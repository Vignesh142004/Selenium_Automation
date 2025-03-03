package automation;
/*
TestCase 
1)Launch browser(Chrome).
2)Open url https://demo.nopcommerce.com/
3)Validate title should be " nopCommerce demo store. Home page title".
4)Close browser.
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new"); // it will execute the script in headless mode.
		
        WebDriver driver=new ChromeDriver(options); // pass options parameter to driver.
		
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
