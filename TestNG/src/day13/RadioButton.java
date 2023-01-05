package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton
{
	WebDriver driver;

	@Test
	public void radio() 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	driver.manage().window().maximize();
	
	WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
	TaskManager.click();
	
	WebElement radiobutton = driver.findElement(By.id("menuform:m_radio"));
	radiobutton.click();
	
	WebElement browser = driver.findElement(By.xpath("//*[text()='Chrome']"));
	browser.click();
	
	WebElement unselect = driver.findElement(By.xpath("//*[text()='Chennai']"));
	unselect.click();
	
	WebElement agegroup = driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']//*[@id='j_idt87:age:1']"));
	boolean status = agegroup.isSelected();
	System.out.println("agegroup is selected:"+status);
	
	WebElement select1 = driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']//*[@id='j_idt87:console2:0']"));
	boolean status1 = select1.isSelected();
	System.out.println("chrome is selected:"+status1);
	
	WebElement select2 = driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']//*[@id='j_idt87:console2:1']"));
	boolean status2 = select2.isSelected();
	System.out.println("firefox is selected:"+status2);
	
	WebElement select3 = driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']//*[@id='j_idt87:console2:2']"));
	boolean status3 = select3.isSelected();
	System.out.println("safari is selected:"+status3);
	
	WebElement select4 = driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']//*[@id='j_idt87:console2:3']"));
	boolean status4 = select4.isSelected();
	System.out.println("edge is selected:"+status4);
	
	driver.navigate().back();
	driver.quit();
}
}