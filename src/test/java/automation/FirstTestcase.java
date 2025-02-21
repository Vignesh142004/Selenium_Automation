package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 TestCase 
 1)Launch browser(Chrome).
 2)Open url https://demo.opencart.com.
 3)Validate title should be " Your Store".
 4)Close browser.
 */
public class FirstTestcase {

	public static void main(String[] args) 
	{
		// 1)Launch browser(Chrome).
		// ChromeDriver driver=new ChromeDriver(); (OR)
		
		WebDriver driver=new ChromeDriver();
		
		//2) Open url https://demo.opencart.com.
		driver.get("https://demo.opencart.com/");
		
		// 3)Validate title should be " Your Store".
		
		String actual_title=driver.getTitle();
	
		if(actual_title.equals("Your Store"))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
		// 4)Close browser.
		
		driver.quit();
		
		
		

	}

}
