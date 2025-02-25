package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertWithoutswitch {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//with the help of Explicitwait we can handle alert without switchTo().
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		driver.quit();

	}

}
