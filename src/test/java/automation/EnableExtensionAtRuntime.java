package automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRuntime 
{

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Effigo\\SelectorsHub-XPath.crx");//CRXfile path of extension. 
		
		options.addExtensions(file);// adding extension at runtime.
		
		WebDriver driver=new ChromeDriver();// passing Chromeoptions to the driver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.quit();
		
	}

}
