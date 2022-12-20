
package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suit {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void Launch() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void Google() {

		driver.get("http://www.google.co.in");
	}

	@Test(priority = 2)
	public void Bing() {

		driver.get("http://www.bing.co.in");
	}

	@Test(priority = 1)
	public void Yahoo() {
		driver.get("http://www.yahoo.co.in");

	}

	@AfterSuite
	public void Close() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken: " + totalTime +" Miliseconds.");

	}
}
