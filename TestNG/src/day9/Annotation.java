package day9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
	WebDriver driver;

	@Test
	public void function() {
		WebElement product = driver.findElement(By.xpath(
				"//*[text()='Apple Watch SE (GPS + Cellular, 40mm) - Space Grey Aluminium Case with Midnight Sport Band - Regular']"));
		product.click();

	}

	@BeforeMethod
	public void beforeMethod() {
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iwatch series");

		WebElement submit = driver.findElement(By.id("nav-search-submit-text"));
		submit.click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.navigate().back();
	}

	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.manage().window().minimize();
	}

	@BeforeTest
	public void beforeTest() {
		driver.navigate().to("https://www.amazon.in/");

	}

	@AfterTest
	public void afterTest() {
		driver.navigate().refresh();
	}

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
