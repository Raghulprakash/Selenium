package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialogs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		String window = driver.getWindowHandle();
		
		WebElement SmallButton = driver.findElement(By.id("showSmallModal"));
		SmallButton.click();
		String text =SmallButton.getText();
		System.out.println(text);
		
		
		Set<String>window1=driver.getWindowHandles();
		for (String newwindow: window1) 
		{
			driver.switchTo().window(newwindow);
		}
		
		WebElement Button1 = driver.findElement(By.id("closeSmallModal"));
		Button1.click();
		WebElement content = driver.findElement(By.xpath("//*[@class='modal-body']"));
		String text1 =content .getText();
		System.out.println(text1);
		
		WebElement LargeButton = driver.findElement(By.id("showLargeModal"));
		LargeButton.click();
		String text2 =LargeButton.getText();
		System.out.println(text2);
		
		driver.switchTo().window(window);
		
		Set<String>window2=driver.getWindowHandles();
		for (String newwindow: window2) 
		{
			driver.switchTo().window(newwindow);
		}
		
		WebElement Button2 = driver.findElement(By.id("closeLargeModal"));
		Button2.click();
		WebElement content1 = driver.findElement(By.xpath("//*[@class='modal-body']"));
		String text3 =content1 .getText();
		System.out.println(text3);
		
	}

}
