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

public class SupplierPasswordChange_Automation {

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
		
		//Password change
		driver.findElement(By.xpath("//img[@src='images/icons/Search.png']")).click();
		
		WebElement role=driver.findElement(By.id("roleId"));
		Select select1=new Select(role);
		select1.selectByVisibleText("Suppliers");
		
		driver.findElement(By.id("email")).sendKeys("maruthi@yopmail.com");
		
		driver.findElement(By.xpath("//input[@id='search']")).click();
		
		driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println("Temporary password was set successfully...");
		
		//New password set
		
		driver.get("https://training1.effigo.in/portal");
		
		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("maruthi@yopmail.com");
		driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		
		driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Bob@1234");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		// Re login with new password.

		driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("maruthi@yopmail.com");
		driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
		driver.findElement(By.xpath("//input[@id='sighInId']")).click();
		
		System.out.println("New Password was set Successfully...");
		
		
		//driver.close();

	}

}
