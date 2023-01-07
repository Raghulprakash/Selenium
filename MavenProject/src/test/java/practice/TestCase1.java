package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1
{
	public void Bookstore() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	driver.manage().window().maximize();
	
	WebElement Username = driver.findElement(By.id("userName"));
	Username.sendKeys("xyzabc");

	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("Abcd1234@");

	WebElement LoginButton = driver.findElement(By.id("login"));
	LoginButton.click();
	}
}