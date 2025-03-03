package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//JavascriptExecutor 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1)Scroll down the page by pixel number.
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset;",""));//1500
		
		//2)Scroll the page till element is visible.
		WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Visitors']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;",""));//3066
		
		//3)Scroll till end of the page.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //3460
		
		//4)Scroll to the initial position.
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		

	}

}
