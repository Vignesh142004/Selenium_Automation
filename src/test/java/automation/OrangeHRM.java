package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(automation.MyListener.class)
public class OrangeHRM 
{
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		/*switch(browser)
		{
		case "chrome":
		{
			driver=new ChromeDriver();
			break;
		}
		case "edge":
		{
			driver=new EdgeDriver();
			break;
		}
		case "firefox":
		{
			driver=new FirefoxDriver();
			break;
		}
		default:
		{
			System.out.println("Enter the valid browser");
			return;
		}
			
		}*/
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1) // This test got passed.
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean logostatus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logostatus,true);
	}
	
	
	@Test(priority=2) // This test got failed.
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3,dependsOnMethods= {"testURL"}) // This test got skipped.
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
