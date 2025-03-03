package automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//1)FullPage Screenshot
    	TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetfile);// copy the sourceFile to targetFile.
		
		//2)Capture Screenshot of specific section.
		WebElement featured=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='title']"));
		File sourcefile1=featured.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\Screenshots\\featuredseaction.png");
		sourcefile1.renameTo(targetfile1);
		
		//3)Capture Screenshot of WebElement.
		
		WebElement macimage=driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro']"));
		File sourcefile2=macimage.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\Screenshots\\MacImage.png");
		sourcefile2.renameTo(targetfile2);
		
		driver.quit();
		
	
		
		
		

	}

}
