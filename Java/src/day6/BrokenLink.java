package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/broken");
		driver.manage().window().maximize();
		
		WebElement Link =driver.findElement(By.linkText("Click Here for Valid Link"));
		Link.click();
		
		driver.navigate().back();
		
		WebElement BrokenLink =driver.findElement(By.linkText("Click Here for Broken Link"));
		BrokenLink.click();
		
		String Header = driver.getTitle();
		if(Header.contains("Internet"))
		{
			System.out.println("Broken Link");
		}
		
		driver.navigate().back();
	}

}
