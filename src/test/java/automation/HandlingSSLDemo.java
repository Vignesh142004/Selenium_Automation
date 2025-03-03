package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSLDemo {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true); // to handle SSL certificate.
		
		
		WebDriver driver=new ChromeDriver(options); //passing chromeoption to driver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://expired.badssl.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
