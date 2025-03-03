package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestinIngonitoMode {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");// to run the test in Incognito mode.
		
        WebDriver driver=new ChromeDriver(options);// passing chromeoptions to driver.
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
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
