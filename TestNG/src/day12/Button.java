package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button 
{

	WebDriver driver;

	@Test
	public void button() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
	
	WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
	TaskManager.click();
	
	WebElement buttoncontrol = driver.findElement(By.id("menuform:m_button"));
	buttoncontrol.click();
	
	WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
	title.click();
	driver.navigate().back();
	
	WebElement Submit = driver.findElement(By.id("j_idt88:j_idt98"));
	System.out.println("size of the button "+Submit.getSize());
	
	WebElement Disable = driver.findElement(By.id("j_idt88:j_idt92"));
	boolean display = Disable.isDisplayed();
	System.out.println("Button is displayed :"+display);
	
	WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
    Point xypoint = position.getLocation();
    System.out.println("X point :"+xypoint.getX());
    System.out.println("Y point :"+xypoint.getY());
    
    WebElement buttoncolor = driver.findElement(By.id("j_idt88:j_idt96"));
    String s = buttoncolor.getCssValue("color");
    System.out.println("Color is :" + s);
    
    List <WebElement> button = driver.findElements(By.xpath("//div[@class='card']//button[@type='button']"));
    System.out.println("number of buttons :"+button.size());
    
}
}