package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Waits 
{

	WebDriver driver;

	@Test
	public void waitconcept() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
	
	WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
	TaskManager.click();
	
	WebElement waits = driver.findElement(By.id("menuform:m_wait"));
	waits.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	WebElement visibility = driver.findElement(By.id("j_idt87:j_idt89"));
	visibility.click();
	
	WebElement text = driver.findElement(By.id("j_idt87:j_idt90"));
	String content = text.getText();
	System.out.println(content);
	
	WebElement invisibility = driver.findElement(By.id("j_idt87:j_idt92"));
	invisibility.click();
	
	WebElement text1 = driver.findElement(By.id("j_idt87:j_idt93"));
	String content1 = text1.getText();
	System.out.println(content1);
	
	boolean display = text1.isDisplayed();
	System.out.println("invisible:"+display);
	
	WebElement text2 = driver.findElement(By.id("j_idt87:j_idt99"));
	String content2 = text2.getText();
	System.out.println(content2);
	
	WebElement clickablity = driver.findElement(By.id("j_idt87:j_idt95"));
	clickablity.click();
	
	WebElement clickablity1 = driver.findElement(By.id("j_idt87:j_idt96"));
	clickablity1.click();
	
	WebElement textchange = driver.findElement(By.id("j_idt87:j_idt98"));
	textchange.click();
	
	WebElement text4 = driver.findElement(By.id("j_idt87:j_idt99"));
	String content4 = text4.getText();
	System.out.println(content4);
	
	
	
}
}