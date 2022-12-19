package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		
		List <WebElement> Sort = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement from = Sort.get(6);
		WebElement to = Sort.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to).build().perform();
		
		
		WebElement from1 = Sort.get(5);
		WebElement to1 = Sort.get(0);
		
		action.clickAndHold(from1);
		action.moveToElement(to1);
		action.release(to1).build().perform();
		
		WebElement from2 = Sort.get(4);
		WebElement to2 = Sort.get(0);
		
		action.clickAndHold(from2);
		action.moveToElement(to2);
		action.release(to2).build().perform();
		
		WebElement from3 = Sort.get(3);
		WebElement to3 = Sort.get(0);
		
		action.clickAndHold(from3);
		action.moveToElement(to3);
		action.release(to3).build().perform();
		
		WebElement from4 = Sort.get(2);
		WebElement to4 = Sort.get(0);
		
		action.clickAndHold(from4);
		action.moveToElement(to4);
		action.release(to4).build().perform();
	}

}
