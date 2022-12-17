package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		
		WebElement size = driver.findElement(By.xpath("//*[@class='constraint-area']//*[@class='react-resizable-handle react-resizable-handle-se']"));
		Actions actions = new Actions (driver);
		actions.dragAndDropBy(size, 200, 200).build().perform();
		actions.click().release();
	
	}

}
