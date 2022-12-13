package day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();

		// Implicit Wait

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Button1 = driver.findElement(By.id("btn1"));
		Button1.click();

		WebElement Text1 = driver.findElement(By.id("txt1"));
		Text1.sendKeys("Hi");

		// Explicit Wait

		WebElement Button2 = driver.findElement(By.id("btn2"));
		Button2.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement Text2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
		Text2.sendKeys("Welcome");
	}

}
