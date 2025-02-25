package automation;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlerts {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait.
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();// Maximize the window size.
		
		//1) Normal alert with OK button.
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myalert=driver.switchTo().alert();
		String textinalert=myalert.getText();
		System.out.println(textinalert);
		myalert.accept();
		
		//2)Confirmation Alert with OK and Cancel button.
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert myconfirmalert=driver.switchTo().alert();
		String textinalert1=myconfirmalert.getText();
		System.out.println(textinalert1);
		//myconfirmalert.dismiss(); // to cancel the alert.
		myconfirmalert.accept(); // to click OK button.
		
		//3) Prompt Alert with OK and Cancel Button.
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert mypromptalert=driver.switchTo().alert();
		String textinalert2=mypromptalert.getText();
		System.out.println(textinalert2);
		mypromptalert.sendKeys("Welcome to Effigo!");
		mypromptalert.accept();
		
		
		driver.quit();
		
		
		
	
		
		
		

	}

}
