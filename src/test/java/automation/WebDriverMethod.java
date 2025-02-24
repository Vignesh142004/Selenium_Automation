package automation;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//1)get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//2) getTile()
		String title=driver.getTitle();
		System.out.println("Title of the Webpage :"+title);
		
		//3)getCurrentURl()
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current URL of the Webpage :"+currenturl);
		
		//4)getPageSource()
		String sourcecode=driver.getPageSource();
		System.out.println("Page Source of current website: "+sourcecode);
		
		//5)getWindowHandle()
		String windowId=driver.getWindowHandle();
		System.out.println("ID of current webpage: "+windowId);
		
		driver.findElement(By.tagName("a")).click();
		//6)getWindowHandles()
		Set<String> st =driver.getWindowHandles();
		System.out.println("ID of multiple browser Windows :");
		for(String s:st)
		{
			System.out.println(s);
		}
		driver.quit();
		
 	}

}
