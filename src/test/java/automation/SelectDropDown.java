package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countryele=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select country=new Select(countryele);
		
//		// select option from the dropdown.
		country.selectByVisibleText("Germany"); // innerText of option.
		country.selectByValue("australia"); // attribute of option.
		country.selectByIndex(2); // the index of option(Start with 0).
		
		List<WebElement> options=country.getOptions();
		System.out.println("Number of options in the Dropdown :"+options.size());
		for(WebElement otp:options)
		{
			System.out.println(otp.getText());
		}
		
		
		
		
		

	}

}
