package automation;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowserWindows 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit waiting.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String winid:windowIds)
		{
			System.out.println(winid);
		}
		
		
		List<String> windowIdarr=new ArrayList<>(windowIds);
		String parentId=windowIdarr.get(0);
		String childId=windowIdarr.get(1);
		//System.out.println(driver.getTitle()); // even the child page is open the driver still pointing to the parent page.
		
		driver.switchTo().window(childId);//Switch from parent to Child.
		System.out.println("Title after switch to Child page :"+driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println("Title after switch to Parent page :"+driver.getTitle());
		driver.quit();
		

	}

}
