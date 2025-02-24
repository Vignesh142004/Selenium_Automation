package automation;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClosingSpecificBrowserWindow 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
		Set<String> windowId=driver.getWindowHandles();
		
		for(String winid:windowId)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
			else if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
		}
		driver.quit();
		

	}

}
