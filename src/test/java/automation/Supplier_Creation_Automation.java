package Automation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Supplier_Creation_Automation {

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		//Supplier Creation
		driver.findElement(By.xpath("//a[@id='viewMappedSupplier']//img")).click();
		driver.findElement(By.xpath("//button[@id='newSupplierRegistration']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='companyName']")))
	     .sendKeys("Maruthi");
		WebElement country=driver.findElement(By.id("companyRegisterCountry"));
		Select select1=new Select(country);
		select1.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='regiNumber']")).sendKeys("654231");
		driver.findElement(By.xpath("//input[@id='panNum']")).sendKeys("BCDPA1234A");
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='Select all']")).click();
		driver.findElement(By.xpath("//textarea[@id='regiAddress']")).sendKeys("6th Sector HSR Layout ");
		
		WebElement state=driver.findElement(By.id("state"));
		Select select2=new Select(state);
		select2.selectByVisibleText("Karnataka");
		
		driver.findElement(By.xpath("//input[@id='cityId']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("500234");
		driver.findElement(By.xpath("//input[@id='companyEmail']")).sendKeys("maruthi@gmail.com");
		driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("9874561203");
		driver.findElement(By.xpath("//input[@id='gstNum']")).sendKeys("29AAACH7409R1AC");
		
	    driver.findElement(By.xpath("//input[@id='contactPerson']")).sendKeys("Rohan");
	    driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9874563210");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maruthi@yopmail.com");
	    
		driver.findElement(By.xpath("//button[@id='next-to-admin']")).click();
		
		System.out.println("Supplier created Successfully...");
		
		
		
		
		
		
		
		
		//driver.quit();
		
		

	}

}
