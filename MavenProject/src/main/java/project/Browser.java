package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
{
	public WebDriver driver;
	public void browserLaunch() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
}
}