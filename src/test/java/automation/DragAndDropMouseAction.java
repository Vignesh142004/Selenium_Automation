package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedstates=driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement rome=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement soeul=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southKorea=driver.findElement(By.xpath("//div[@id='box105']"));
		
		//Drag and Drop Mouse Action.
		Actions act=new Actions(driver);
		act.dragAndDrop(washington, unitedstates).build().perform();
		act.dragAndDrop(soeul, southKorea);
		act.dragAndDrop(rome, italy);
		driver.quit();
	}

}
