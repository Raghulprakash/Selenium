package day9;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@BeforeSuite
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test (priority = 0)
	public void Website() {
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1,dependsOnMethods = "Website")
	@Parameters("Content")
	public void search(String content) {
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys(content);

		WebElement submit = driver.findElement(By.id("nav-search-submit-text"));
		submit.click();
		
		driver.navigate().back();
		driver.navigate().refresh();
	}
	@Test(priority = 2,dependsOnMethods = "Website")
	@Parameters("Content1")
	public void list(String content) {
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys(content);

		WebElement submit = driver.findElement(By.id("nav-search-submit-text"));
		submit.click();

		List<WebElement> price = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i).getText().replaceAll(",", ""));
		}
	}
}
