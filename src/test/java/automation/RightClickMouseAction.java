package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouseAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
		
		Actions act=new Actions(driver);
		
		//Right click action.
		act.contextClick(button).build().perform();
		
		//Click on copy.
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		// closing the alert window.
		Alert myalert=driver.switchTo().alert();
		String text=myalert.getText();
		System.out.println(text);
		myalert.accept();// clicking OK on the alert.
		
		
		driver.quit();
		
		
	}

}
