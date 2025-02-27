package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicitly wait.
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) Find the total number of row in the table.
		
		List<WebElement> tablerows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Number of rows in the table:"+tablerows.size());
		
		//2) Find the total number of column in the table.
		List<WebElement> tablecols=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println("Number of cloumn in the table :"+tablecols.size());
		
		//3) Read data from specific row and column.
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[4]")).getText();
		System.out.println("Name of the Book: "+bookname);
		System.out.println("Price of the Book: "+price);
		System.out.println();
		
		//4)Reading data from all row and column(Using nested loop).
		for(int r=2;r<=tablerows.size();r++)
		{
			for(int c=1;c<=tablecols.size();c++)
			{
				//passing parameter to the Xpath.
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		//5)Reading data using conditions.
		
		for(int r=2;r<=tablerows.size();r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Amit"))
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(book);
			}
		}
		
		//6) Finding the total price of the Books.
		
		int total_price=0;
		for(int r=2;r<=tablerows.size();r++)
		{
			String sprice=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//total_price+=Integer.parseInt(sprice);
			System.out.println(sprice);
			
		}
		System.out.println("Total price of Books :"+total_price);
		driver.quit();
	}

}
