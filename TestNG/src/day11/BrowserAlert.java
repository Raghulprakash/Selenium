package day11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserAlert 
{
    WebDriver driver;
	
	@Test
	public void alert()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();
		
		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt39"));
		TaskManager.click();
		
		WebElement Alert = driver.findElement(By.id("menuform:m_overlay"));
		Alert.click();
		
		WebElement Simple = driver.findElement(By.id("j_idt88:j_idt91"));
		Simple.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement Confirm = driver.findElement(By.id("j_idt88:j_idt93"));
		Confirm.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement Prompt= driver.findElement(By.id("j_idt88:j_idt104"));
		Prompt.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Hi");
		alert2.accept();
		
		WebElement Sweet_Alert= driver.findElement(By.id("j_idt88:j_idt106"));
		Sweet_Alert.click();
		
		WebElement Confirmation = driver.findElement(By.id("j_idt88:j_idt108"));
		Confirmation.click();
		
		WebElement Sweet_Alert1= driver.findElement(By.id("j_idt88:j_idt95"));
		Sweet_Alert1.click();
		
		WebElement Simple_Dialog = driver.findElement(By.id("j_idt88:j_idt98"));
		Simple_Dialog.click();
		
		WebElement Sweet_Alert2= driver.findElement(By.id("j_idt88:j_idt100"));
		Sweet_Alert2.click();
		
		WebElement Modal_Dialog = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']//span[@class='ui-icon ui-icon-closethick']"));
		Modal_Dialog.click();
		
		driver.navigate().back();
	}
	
}
