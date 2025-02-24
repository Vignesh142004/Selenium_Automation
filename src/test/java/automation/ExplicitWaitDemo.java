package automation;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		// ExplicitWait Declaration.
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Usage of Explicit wait.
		WebElement username= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		WebElement password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement loginbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginbtn.click();
		
		//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		driver.quit();
		

	}

}
