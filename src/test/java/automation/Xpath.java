package automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();// to open the browser.
		
		driver.get("https://demo.opencart.com/");// Launch the webPage.
		driver.manage().window().maximize();// to maximize the windiow.
		
		// XPath with Single Attribute.
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Laptop");
		
		// XPath with multiple Attribute.
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("SmartWatch");
		
		// XPath with AND operator
		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("SmartWatch  ");
		
		// XPath with OR operator.
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Airpods");
        
		// XPath with innerText text().
		
		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		// XPath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Iphone");
	
		// XPath with start-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Airpods");
		
		
		
		
		driver.quit(); // to close the webPage.
		
		
		

	}

}
