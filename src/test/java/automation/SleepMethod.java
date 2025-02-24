package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SleepMethod {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
		Thread.sleep(3000); // sleep() method to reduce the synchronization problem.
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		driver.close();
}

}
