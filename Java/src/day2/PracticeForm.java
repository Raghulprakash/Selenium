package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement First_Name = driver.findElement(By.id("firstName"));
		First_Name.sendKeys("AB");

		WebElement Last_Name = driver.findElement(By.id("lastName"));
	    Last_Name.sendKeys("CD");
		
	    WebElement Email = driver.findElement(By.id("userEmail"));
	    Email.sendKeys("abc@gmail.com");
	    
	    WebElement Gender = driver.findElement(By.xpath("//*[text()='Male']"));
	    Gender.click();
	    
	    WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
	    DOB.click();
	     
	    WebElement Month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	    Select select1 = new Select(Month);
	    select1.selectByIndex(4);
	    
	    WebElement Year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	    Select select2 = new Select(Year);
	    select2.selectByValue("1999");
	    
	    WebElement Date = driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//div[text()='17']"));
	    Date.click();
	    
	    WebElement Number = driver.findElement(By.id("userNumber"));
	    Number.sendKeys("9876543210");
	
	    
	    driver.findElement(By.xpath("//label[text()='Sports']")).click();
	   
	    driver.findElement(By.xpath("//label[text()='Music']")).click();
	    
	    driver.findElement(By.xpath("//label[text()='Reading']")).click();
	    
	   
	    WebElement Address = driver.findElement(By.id("currentAddress"));
	    Address.sendKeys(" no:01 rp street.\n anna nagar. \n chennai.");
	}

}
