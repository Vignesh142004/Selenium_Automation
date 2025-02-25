package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstarpDropdownDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class,'multiselect')]")).click();
		
		//1)Select single option
		driver.findElement(By.xpath("//label[normalize-space()='Java']")).click();// directly locating the option.

		//2) Getting all option and finding Size.
		List<WebElement> options=driver.findElements(By.xpath("//ul//label"));
		System.out.println("Number of option in Dropdown :"+options.size());
		
		//3) Displaying the dropdown options.
		for(WebElement opt:options) 
		{
			System.out.println(opt.getText());
		}
		
		//4)Selecting multiple option in dropdown.
		for(WebElement opt:options)
		{
			if(opt.getText().equals("Python") || opt.getText().equals("Angular")||opt.getText().equals("MySQL"))
			{
				opt.click();
			}
		}
		//driver.quit();
	}

}
