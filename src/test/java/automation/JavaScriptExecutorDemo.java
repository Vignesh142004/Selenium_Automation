package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
	    //name.sendKeys("Raja");
	    WebElement gender=driver.findElement(By.xpath("//input[@id='male']"));
	    //gender.click();
	    
	    
	    //JavaScriptExecutor
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    //1) Alternative of sendKeys.
	    js.executeScript("arguments[0].setAttribute('value','Varun')",name);
	    
	    //2)Alternative of click();
	    js.executeScript("arguments[0].click();",gender);
	    
	    driver.quit();
	    
	   
	}

}
