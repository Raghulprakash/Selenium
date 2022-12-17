package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		WebElement Dragme = driver.findElement(By.id("draggable"));
		WebElement Dropme = driver.findElement(By.id("droppable"));

		action.clickAndHold(Dragme).moveToElement(Dropme).release(Dropme).build().perform();
		
	
	}

}
