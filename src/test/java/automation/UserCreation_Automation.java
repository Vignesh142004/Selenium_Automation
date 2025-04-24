package Automation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UserCreation_Automation {

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://training1.effigo.in/admin");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		
		//User creation
		driver.findElement(By.xpath("//a[@id='getClientUserViewAllPage']//img")).click();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement adduser = driver.findElement(By.xpath("//a[@id='adduser']"));
		js.executeScript("arguments[0].click();", adduser);
		
		WebElement dropdown=driver.findElement(By.id("department"));
		Select select1=new Select(dropdown);
		select1.selectByVisibleText("Digital");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("VIGNESH@14");
		
		WebElement designation=driver.findElement(By.id("designation"));
		Select select2=new Select(designation);
		select2.selectByVisibleText("Lead");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("VIGNESH");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9874563201");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vignesh.r@effigo.tech");
		WebElement location=driver.findElement(By.id("locationId"));
		Select select3=new Select(location);
		select3.selectByVisibleText("Danapur");
		WebElement manager=driver.findElement(By.id("managerId"));
		Select select4=new Select(manager);
		select4.selectByVisibleText("Vignesh R");
		driver.findElement(By.xpath("//label[normalize-space()='Is Centralized User']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Is Admin']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Supplier Registration Approver']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Vendor Admin']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Vendor Manager']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='SBU Head']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Legal Approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Quality Control']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='BU Head']")).click();
		driver.findElement(By.xpath("//label[@for='catalogCreation']")).click();
		driver.findElement(By.xpath("//label[@for='catalogApproval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Expire']")).click();
		driver.findElement(By.xpath("//label[@for='requisitionCreation']")).click();
		driver.findElement(By.xpath("//label[@for='requisitionApproval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Requisition View']")).click();
		driver.findElement(By.xpath("//label[@for='poCreation']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='PO Without Catalog Creation']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='PO Creation by Project']")).click();
		driver.findElement(By.xpath("//label[@for='grnCreation']")).click();
		driver.findElement(By.xpath("//label[@for='grnApproval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='SES Creation']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='SES Approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='GRN View']")).click();
		driver.findElement(By.xpath("//button[@id='createClientUserBtn']")).click();
		System.out.println("User Created Successfully...");
		
	
		
		
		//driver.quit();
	}

}
