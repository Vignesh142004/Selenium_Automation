package automation;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		// Name Locator
//		driver.findElement(By.name("q")).sendKeys("Mac");
//		
//		// Id Locator 
//		boolean currencystatus=driver.findElement(By.id("customerCurrency")).isDisplayed();
//		
//		if(currencystatus)
//		{
//			System.out.println("Currency status displayed.");
//		}
//		else
//		{
//			System.out.println("Currency status is not displayed");
//		}
//		
//		// LinkText Locator 
//		driver.findElement(By.linkText("Log in")).click();
//		
//		// PartialLinkText Locator
//		driver.findElement(By.partialLinkText("Compu")).click(); //Compu ==> Computers.
		
		
//		// ClassName Locator 
//		List<WebElement> toggle_element=driver.findElements(By.className("sublist-toggle"));
//		System.out.println("Number of toggle element: "+toggle_element.size());
//		for(WebElement a: toggle_element)
//		{
//			System.out.println(a);
//		}
		
//		// TagName Locator 
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println("Number of links : "+ links.size());
//		for(WebElement b: links)
//		{
//			System.out.println(b);
//		}
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Number of images: "+images.size());
	

	}

}
