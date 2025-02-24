package automation;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationalMethodsDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/"); (Accept only URL as a String).
		//1) navigate().to()
		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		driver.navigate().to("https://demo.nopcommerce.com/");//(Accept URL as both String and a URL object).
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//2) navigate().back()
		System.out.println("URL of Webpage before navigation :" +driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("URL of Webpage after navigation :"+driver.getCurrentUrl());
		
		//3) navigate().forward()
		System.out.println("URL of Webpage before navigation :"+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("URL of Webpage after navigation :"+driver.getCurrentUrl());
		
		
		//4) navigate().refresh()
		driver.navigate().refresh();
		driver.quit();
		

	}

}
