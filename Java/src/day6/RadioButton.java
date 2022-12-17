package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement Button1 = driver.findElement(By.xpath("//*[text()='Yes']"));
		Button1.click();
		
		boolean yes = Button1.isEnabled();
		System.out.println("Yes is Selected : "+yes);
		
		WebElement Button2 = driver.findElement(By.xpath("//*[text()='Impressive']"));
		Button2.click();
		
		boolean impressive = Button1.isEnabled();
		System.out.println("Impressive is Selected : "+impressive);
	}

}
