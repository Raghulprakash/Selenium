package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragging 
{
	WebDriver driver;
	@Test
	public void drop()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();
		
		WebElement TaskManager = driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		TaskManager.click();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='menuform:m_drag']"));
		drag.click();
		
		Actions action = new Actions(driver);

		WebElement Dragme = driver.findElement(By.id("form:drag_content"));
		WebElement Dropme = driver.findElement(By.id("form:drop_content"));
		
		action.clickAndHold(Dragme).moveToElement(Dropme).release(Dropme).build().perform();
		
		WebElement Dragme1 = driver.findElement(By.id("form:conpnl"));
		
		int x = Dragme1.getLocation().getX();
		System.out.println(x);
		int y = Dragme1.getLocation().getY();
		System.out.println(y);
		action.dragAndDropBy(Dragme1, x , y+200).perform();
		
		driver.navigate().back();
		
	}	
}
