package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();// to open the chrome browser.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//driver.close(); // the browser method will close only single webpage.
		
		driver.quit(); // the browser method will close all tab in the browser.

	}

}
