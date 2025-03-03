package automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksHandlingDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		int no_of_brokenlink=0;
		try
		{
		for(WebElement link:links)
		{
			String hrefattvalue=link.getAttribute("href");
			if(hrefattvalue==null || hrefattvalue.isEmpty())
			{
				System.out.println("Not possible to check");
				continue;
			}
			else
			{
			//Hit the URL
			URL linkurl=new URL(hrefattvalue);//converting String to URL.
			HttpURLConnection connlink=(HttpURLConnection) linkurl.openConnection();
			connlink.connect();//connect to the server and sent request to the server.
			
			if(connlink.getResponseCode()>=400)
			{
				System.out.println("It is a broken link");
				no_of_brokenlink++;
			}
			else
			{
				System.out.println("It is not a broken link");
			}
		   }
			
		}
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Number of Broken Links:"+no_of_brokenlink);
		driver.quit();
			
			
			
		}
	}


