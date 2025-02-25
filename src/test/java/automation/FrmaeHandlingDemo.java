package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrmaeHandlingDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//1)Frame1 - switching driver to frame1
		WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1); // passed webElement.
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi, How are you?");//Locating a element in frame1 after switching.
		driver.switchTo().defaultContent();// switch to main page.
		
		//2)Frame2 - switching driver to frame2
		WebElement frame2=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Fine, How about you?");
		driver.switchTo().defaultContent(); // switch to the main page.
		
		//3)Frame3 - switching driver to frame3
		WebElement frame3=driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java selenium");
		  // inner frame - within the frame3
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		//driver.quit();

	}

}
