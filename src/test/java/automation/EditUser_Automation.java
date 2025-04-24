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

public class EditUser_Automation {

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
		
		//Edit User
		driver.findElement(By.xpath("//a[@id='getClientUserViewAllPage']//img")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement selectuser = driver.findElement(By.xpath("//input[@id='edit-row46']"));
		js.executeScript("arguments[0].click();", selectuser);
		WebElement editbutton = driver.findElement(By.xpath("//button[@id='edituser']"));
		js.executeScript("arguments[0].click();", editbutton);
		
		WebElement vendor_manager=driver.findElement(By.id("vendorManagerId"));
		Select select1=new Select(vendor_manager);
		select1.selectByVisibleText("Rohit Sharma");
		
		driver.findElement(By.xpath("//label[@for='dispatchApproval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Pre Dispatch Approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='ASN View']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Event-Create']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Event-Edit']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Event-Delete']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Lot-Create']")).click();
		driver.findElement(By.xpath("//label[@for='approval']")).click();
		driver.findElement(By.xpath("//label[@for='tendercreator']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Messaging']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Technical evaluation']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Commercial evaluation']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Sourcing Approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Commercial approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Technical approval']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Lead Buyer']")).click();
		driver.findElement(By.xpath("//label[@for='contractManagementCreation']")).click();
		driver.findElement(By.xpath("//label[@for='contractManagementApproval']")).click();
		
		driver.findElement(By.xpath("//button[@id='editClientUserBtn']")).click();
		System.out.println("User details Edited Successfully..");
		//driver.quit();

	}

}
