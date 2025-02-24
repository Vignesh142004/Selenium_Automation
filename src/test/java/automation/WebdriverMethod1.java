package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverMethod1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();// Open the Chrome browser.
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
		driver.get("https://www.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)isDisplayed()
		
		WebElement logo=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		boolean logostatus=logo.isDisplayed();
		System.out.println("Logo Display Status :"+logostatus);// true
		
		//boolean logostatus= driver.findElement(By.xpath("//img[@title='nopCommerce']")).isDisplayed();
		
		// 2)isEnabled()
		
		boolean dropdownstatus=driver.findElement(By.xpath("//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'][normalize-space()='English']")).isEnabled();
		
		System.out.println("DropDown Status :"+dropdownstatus);// true
		
		// 3)isSelected()
		
		WebElement dropdownselect=driver.findElement(By.xpath("//a[normalize-space()='Shopping cart']//*[name()='svg']"));
		boolean dropdownselectstatus=dropdownselect.isSelected();
		System.out.println("Before Selection Status :");
		System.out.println("Select status of Dropdown :"+dropdownselectstatus);// false
		
		
		System.out.println("After Selection Status:");
		dropdownselect.click();
		dropdownselectstatus=dropdownselect.isSelected();
		System.out.println("Select status of Dropdown :"+dropdownselectstatus);
		
		
		
		driver.close();
		
		

	}

}
