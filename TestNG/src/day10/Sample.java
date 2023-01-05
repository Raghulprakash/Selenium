package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	public WebDriver driver;
	@Parameters("Browser") 
	@BeforeTest	
	
	public void runtest1(String browser) 
	{
	
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver_win64\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		
	}
	@Test
	public void runtest2()
	{
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		Search.sendKeys("testng");
		
	}
	
	@AfterTest	
	public void runtest3() 
	{
	driver.close();
	System.out.println(" Sucessfull ");
	}

}
