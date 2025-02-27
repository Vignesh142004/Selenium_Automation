package automation;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithPagination {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		
		driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		
		//1) Number of pages in the table.
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		String total_page=text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
		System.out.println(total_page);
		
		//2) Traversing a Pages.
		
		for(int p=1;p<1853;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]")).click();
			}
		}
		
		//3) Reading pages in the Table.
		
		driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr")).click();
		driver.close();

	}

}
