package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait.
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) Selecting specific Checkbox
	    driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) Selecting All CheckBox in the WebPage.
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class= 'form-check-input' and @type='checkbox']"));
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
		//3) Selecting last 3 CheckBoxes.(No of element- Checkbox to selected)
		int size=checkboxes.size();
		for(int i=size-3;i<size;i++)
		{
			checkboxes.get(i).click();
		}
		
		//4)Selecting first 3 checkBoxes
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
		//5) DeSelecting the already selected Checkboxes.
		
		for(WebElement cb:checkboxes)
		{
			if(cb.isSelected())// checking the selected checkbox.
			{
				System.out.println(cb);
				cb.click();
			}
		}
		
		
		//driver.quit();
		
		
		
		
		

	}

}
