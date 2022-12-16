package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		WebElement Fullname = driver.findElement(By.id("userName"));
		Fullname.sendKeys("abcd");

		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("abcd@gmail.com");

		WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
		CurrentAddress.sendKeys("no:01 rp street.\nanna nagar. \nchennai");

		WebElement PermanentAddress = driver.findElement(By.id("permanentAddress"));
		PermanentAddress.sendKeys("no:01 rp street.\nanna nagar. \nchennai ");

		WebElement Submit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Submit);
		

	}

}
