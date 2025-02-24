package automation;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
public class FlentwaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		//Flentwait Declaration.
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		WebElement username=mywait.until(new Function<WebDriver, WebElement>()
				{
			        public WebElement apply(WebDriver driver)
			        {
			        	return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			        }
				});
		username.sendKeys("Admin");
		WebElement password=mywait.until(new Function<WebDriver, WebElement>()
		{
	        public WebElement apply(WebDriver driver)
	        {
	        	return driver.findElement(By.xpath("//input[@placeholder='Password']"));
	        }
		});
        password.sendKeys("admin123");
        WebElement loginbtn=mywait.until(new Function<WebDriver, WebElement>()
		{
	        public WebElement apply(WebDriver driver)
	        {
	        	return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	        }
		});
        loginbtn.click();
        
        driver.quit(); 

	}

}
