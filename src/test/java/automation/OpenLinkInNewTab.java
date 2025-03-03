package automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//reglink.click();// it will open in the same tab.
		
		// Open link in new tab.
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
        
		Set<String> window=driver.getWindowHandles();
		List<String> windowlist=new ArrayList<>(window);
		driver.switchTo().window(windowlist.get(1));
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstname.sendKeys("Lokesh");
		
		driver.quit();
	}

}
