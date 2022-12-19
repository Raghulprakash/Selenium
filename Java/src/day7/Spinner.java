package day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spinner {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/spinner/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement Toggle = driver.findElement(By.id("disable"));
		Toggle.click();
		
		WebElement Widge = driver.findElement(By.id("destroy"));
		Widge.click();
		
		WebElement Widge1 = driver.findElement(By.id("destroy"));
		Widge1.click();
		
		WebElement setValue = driver.findElement(By.id("setvalue"));
		setValue.click();
		
		WebElement getValue = driver.findElement(By.id("getvalue"));
		getValue.click();
	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement down = driver.findElement(By.xpath("//*[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']"));
		down.click();
		down.click();
		
		WebElement getValue1 = driver.findElement(By.id("getvalue"));
		getValue1.click();
	
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

}
