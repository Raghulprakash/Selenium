package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Website {
	WebDriver driver;


	@Test
	public void amazon() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iwatch series");

		WebElement submit = driver.findElement(By.id("nav-search-submit-text"));
		submit.click();


	}
	@Test
	public void ajio() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.ajio.com/");
		driver.manage().window().maximize();

		WebElement search = driver
				.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']"));
		search.sendKeys("Hoddie");

		WebElement searchbutton = driver.findElement(By.xpath("//*[@class='ic-search']"));
		searchbutton.click();
	}
}