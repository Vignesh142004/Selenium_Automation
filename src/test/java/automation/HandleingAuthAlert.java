package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleingAuthAlert {

	public static void main(String[] args) 
	{
	    WebDriver driver=new ChromeDriver();
	    
	    //driver.get("https://the-internet.herokuapp.com/basic_auth");
	    
	    //Handling authentication alert
	    //Syntax :
	    //https://username:password@the-internet.herokuapp.com/basic_auth
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	    driver.manage().window().maximize();
	    
	    driver.quit();
	    
	    
	    

	}

}
