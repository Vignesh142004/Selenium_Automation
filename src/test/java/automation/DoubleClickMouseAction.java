package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);// switch to the frame.
		
		WebElement text1=driver.findElement(By.xpath("//input[@id='field1']"));
		text1.clear();
		text1.sendKeys("Welcome to Effigo");
		String actualtext=text1.getAttribute("value");
		
		WebElement text2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	    
		//Double Click on WebElemnt.
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();// method to perform double click.
		
		String text=text2.getAttribute("value"); // getAttribute is similar to getText();
		System.out.println(actualtext);
		System.out.println(text);
		if(text.equals(actualtext))
		{
			System.out.println("The text is copied prpperly");
		}
		else
		{
			System.out.println("The text is not copied"); 
			
		}
		driver.quit();
		
		
		
		
	}

}
