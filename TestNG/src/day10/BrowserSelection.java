package day10;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BrowserSelection 
{
	public WebDriver driver;
	@Parameters("Browser")
	@BeforeTest	
	public void Entry(String browser) 
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
	
	
	
	@AfterTest
	public void Exit() 
	{
	driver.close();
	System.out.println("The Execution is Sucess");
	}

}
