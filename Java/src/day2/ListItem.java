package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListItem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone 14");

		WebElement submit = driver.findElement(By.id("nav-search-submit-text"));
		submit.click();

		List<WebElement> price = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i).getText().replaceAll(",", ""));
		}
	}

}
