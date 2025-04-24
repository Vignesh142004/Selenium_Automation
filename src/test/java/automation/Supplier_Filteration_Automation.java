package Automation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Supplier_Filteration_Automation {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);
	    options.setExperimentalOption("prefs", prefs);
	    options.addArguments("--incognito");
	    options.addArguments("--disable-infobars");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--disable-save-password-bubble");
	    options.addArguments("user-data-dir=/tmp/temporary-profile");

	    WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://training1.effigo.in/admin");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		//Supplier filteration
		driver.findElement(By.xpath("//a[@id='viewMappedSupplier']//img")).click();
		
		driver.findElement(By.xpath("//div[@class='form-group clearfix']//input[@id='companyName']")).sendKeys("maruthi");
		
		WebElement category=driver.findElement(By.id("search_category"));
		Select select1=new Select(category);
		select1.selectByVisibleText("PLCSBS");
		
		WebElement location=driver.findElement(By.id("search_location"));
		Select select2=new Select(location);
		select2.selectByVisibleText("Karnataka");
		
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		

	}

}
