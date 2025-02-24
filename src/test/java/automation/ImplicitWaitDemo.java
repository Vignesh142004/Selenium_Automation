package automation;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		// 10 is the maximum timeout for Synchronization.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait is valid untill the driver is live.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		driver.close(); // driver get close(dead).

	}

}
