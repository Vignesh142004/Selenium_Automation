package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com");
		
		driver.switchTo().newWindow(WindowType.TAB);// used to open URL in new TAB.
		driver.switchTo().newWindow(WindowType.WINDOW); // used to open URL in new Window.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
