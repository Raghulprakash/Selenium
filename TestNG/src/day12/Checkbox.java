package day12;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkbox 
{
	WebDriver driver;

	@Test
	public void checkbox() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
	
	WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
	TaskManager.click();
	
	WebElement check = driver.findElement(By.id("menuform:m_checkbox"));
	check.click();
	
	WebElement CheckBox = driver.findElement(By.id("j_idt87:j_idt89"));
	CheckBox.click();
	
	WebElement Notification = driver.findElement(By.id("j_idt87:j_idt91"));
	Notification.click();
	
	WebElement tri = driver.findElement(By.id("j_idt87:ajaxTriState"));
	tri.click();
	
	WebElement toggle = driver.findElement(By.id("j_idt87:j_idt100"));
	toggle.click();
	
	WebElement Verify = driver.findElement(By.id("j_idt87:j_idt102"));
	boolean verify =Verify.isEnabled();
	System.out.println(verify);
	
	WebElement Multiple = driver.findElement(By.id("j_idt87:multiple"));
	Multiple.click();
	
	
	List <WebElement> choice = driver .findElements(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']"));
	for (WebElement selectchoice:choice)
	{
		String choicename = selectchoice.getAttribute("class");
		if(choicename.equals("Paris")||choicename.equals("Amsterdam"))
		{
			selectchoice.click();
			
		}
	}
		
	driver.navigate().back();
	
	
}
	
}