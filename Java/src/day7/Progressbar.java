package day7;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Progressbar {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/progress-bar");
		driver.manage().window().maximize();
		
		WebElement Start = driver.findElement(By.id("startStopButton"));
		Start.click();
		
		WebElement progessbar = driver.findElement(By.xpath("//div[@id='progressBar']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		boolean progress =wait.until(ExpectedConditions.attributeContains(progessbar, "aria-valuenow", "100"));
		if(progress==true)
		{
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
		}
	}

}
