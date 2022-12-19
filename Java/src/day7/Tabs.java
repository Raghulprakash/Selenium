package day7;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tabs/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement Tab = driver.findElement(By.id("tabs-1"));
		String tab = Tab.getText();
		System.out.println(tab);
		
		WebElement Tab1 = driver.findElement(By.xpath("//*[@class='ui-tabs-tab ui-corner-top ui-state-default ui-tab']//*[text()='Proin dolor']"));
		Tab1.click();
		WebElement content = driver.findElement(By.id("tabs-2"));
		String tab1 = content.getText();
		System.out.println(tab1);
		
		WebElement Tab2 = driver.findElement(By.xpath("//*[@class='ui-tabs-tab ui-corner-top ui-state-default ui-tab']//*[text()='Aenean lacinia']"));
		Tab2.click();
		WebElement content1 = driver.findElement(By.id("tabs-3"));
		String tab2 = content1.getText();
		System.out.println(tab2);
		
		
	}

}
