package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperLink 
{
	WebDriver driver;

	@Test
	public void hyper() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
	
	WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
	TaskManager.click();
	
	WebElement link = driver.findElement(By.id("menuform:m_link"));
	link.click();
	
	WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
	dashboard.click();
	
	driver.navigate().back();
	
	WebElement location = driver.findElement(By.partialLinkText("without clicking me"));
	String destination = location.getAttribute("href");
	System.out.println(destination);
	
	WebElement BrokenLink =driver.findElement(By.linkText("Broken?"));
	BrokenLink.click();
	
	String Header = driver.getTitle();
	if(Header.contains("Error 404"))
	{
		System.out.println("Broken Link");
	}
	
	driver.navigate().back();
	
	WebElement countlink = driver.findElement(By.linkText("How many links in this page?"));
	countlink.click();
	
	List <WebElement> totalink = driver.findElements(By.tagName("a"));
	int size = totalink.size();
	System.out.println("Number of Link :"+size);
	
    driver.navigate().back();
    
	WebElement countlink1 = driver.findElement(By.linkText("How many links in this layout?"));
	countlink1.click();
	
	List <WebElement> totalink1 = driver.findElements(By.tagName("a"));
	int size1 = totalink1.size();
	System.out.println("Number of Link in this layout:"+size1);
	
	driver.navigate().back();
	driver.quit();
}
}