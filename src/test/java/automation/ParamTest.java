package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParamTest 
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser,String url)
	{
		switch(browser)
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
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean logostatus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logostatus,true);
	}
	
	@Test(priority=2)
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=3)
	void testURl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	

}
