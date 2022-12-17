package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Enable = driver.findElement(By.id("enableAfter"));
		boolean enable = Enable.isEnabled();
		System.out.println(enable);
		
		WebElement Colour = driver.findElement(By.tagName("button"));
		String colour = Colour.getCssValue("color");
		System.out.println("Colour is : "+colour);
		
		WebElement Visible = driver.findElement(By.id("visibleAfter"));
		boolean visible = Visible.isDisplayed();
		System.out.println(visible);
	}

}
