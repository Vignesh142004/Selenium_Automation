package automation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomout {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
//		Thread.sleep(3000);
//		driver.manage().window().minimize();// to minimize the window size.
//		Thread.sleep(3000);
		driver.manage().window().maximize();//to maximize the window size.
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='50%'");//screen size zoom to 50%.
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'");//screen size zoom to 80%.
		Thread.sleep(3000);
		//driver.close();
		
		
		

	}

}
