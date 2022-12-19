package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accoradin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/accordian");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement TextHeading = driver.findElement(By.id("section1Heading"));
		WebElement TextContent = driver.findElement(By.id("section1Content"));
		String textheading = TextHeading.getText();
		System.out.println(textheading);
		String textcontent = TextContent.getText();
		System.out.println(textcontent);
		TextHeading.click();
		
		System.out.println("--------------");
		
		WebElement TextHeading1 = driver.findElement(By.id("section2Heading"));
		String textheading1 = TextHeading1.getText();
		System.out.println(textheading1);
		TextHeading1.click();
		
		WebElement TextContent1 = driver.findElement(By.id("section2Content"));
		String textcontent1 = TextContent1.getText();
		System.out.println(textcontent1);
		
		TextHeading1.click();
		

	}

}
