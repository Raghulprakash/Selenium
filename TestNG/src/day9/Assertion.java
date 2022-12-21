package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion
{
	String output = "We ask for your age only for statistical purposes.";
	@Test
    public void display() {
    	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/tooltip/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	
	WebElement age = driver.findElement(By.id("age"));
	String Age = age.getAttribute("title");
	 
	Assert.assertEquals(Age, output);
	
	
	
	}
}
