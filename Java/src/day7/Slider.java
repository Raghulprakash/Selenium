package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement greenslider = driver.findElement(By.xpath("//*[@id='green']//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 
		Actions action = new Actions(driver);
		action.dragAndDropBy(greenslider,100,125).perform();
		
		
	}

}
