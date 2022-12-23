package day10;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot 
{
	WebDriver driver;
	@Test
	public void image() throws IOException
	{
		{
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.navigate().to("https://leafground.com/");
			driver.manage().window().maximize();	
			
	        TakesScreenshot scr= ((TakesScreenshot)driver);
	        File source= scr.getScreenshotAs(OutputType.FILE);
	        
	        File destination= new File("E://sample.png");
	        FileHandler.copy(source, destination);

	    }
	}
}
