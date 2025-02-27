package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	//method to select future Date.
	static void selectFutureDate(WebDriver driver,String date,String month,String year)
	{
		while(true)
		{
			String currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currmonth.equals(month) && curryear.equals(year))
			{
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //to move previous.
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //to move next.
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
	static void selectPastDate(WebDriver driver,String date,String month,String year)
	{
		while(true)
		{
			String currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currmonth.equals(month) && curryear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //to move previous.
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //to move next.
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to frame.
		driver.switchTo().frame(0);
		
		//Method 1:Using sendKeys(mm/dd/yyyy).
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/01/2004");
		
		//Method 2:Using the DatePicker element.
		String fyear="2026";
		String fmonth="September";
		String fdate="24";
		String pyear="2023";
		String pmonth="April";
		String pdate="1";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        //selectFutureDate(driver,fdate,fmonth,fyear); //function call to future dates.
        selectPastDate(driver,pdate,pmonth,pyear); //function call to past dates.
        
        
		//driver.quit();

	}

}
