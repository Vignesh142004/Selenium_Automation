package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); // To open the ChromeBrowser.
		
		driver.get("https://demo.nopcommerce.com/"); // Launch the WebPage.
		
		driver.manage().window().maximize(); // to maximize the window.
		
		//CSS id locator.
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile phone");
		//driver.findElement(By.cssSelector("small-searchterms")).sendKeys("Mobile phone"); // without tagName.
		
		// CSS Class locator.
		
		driver.findElement(By.cssSelector("button.button-1")).click(); // remove the second half on class name.
		//driver.findElement(By.cssSelector("button-1")).click(); // without tagName.
		
		// CSS Attribute Locator.
		
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Gadgets");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Gadgets"); // without tagName.
		
		// CSS Class Attribute Locator.
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("T-shirt"); // without tagName.

	}

}
