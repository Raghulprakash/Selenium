package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='verticalListContainer']/li"));
		
		Actions action = new Actions(driver);
		action.click(list.get(0));
		action.click(list.get(3));
		action.build().perform();
		
		WebElement Grid = driver.findElement(By.id("demo-tab-grid"));
		Grid.click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row1']/li"));
		action.click(list1.get(0)).build().perform();
	    
		List<WebElement> list2 = driver.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row2']/li"));
		action.click(list2.get(1)).build().perform();
		
		List<WebElement> list3 = driver.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row3']/li"));
		action.click(list3.get(1)).build().perform();
	}

}
