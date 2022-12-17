package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		WebElement Add = driver.findElement(By.id("addNewRecordButton"));
		Add.click();
		
		WebElement Firstname = driver.findElement(By.id("firstName"));
		Firstname.sendKeys("Abc");
		
		WebElement Lastname = driver.findElement(By.id("lastName"));
		Lastname.sendKeys("xyz");
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("xyz@gmail.com");
		
		WebElement Age = driver.findElement(By.id("age"));
		Age.sendKeys("28");
		
		WebElement Salary = driver.findElement(By.id("salary"));
		Salary.sendKeys("40000");
		
		WebElement Department = driver.findElement(By.id("department"));
		Department.sendKeys("Information Technology");
		
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		
		WebElement Sort = driver.findElement(By.xpath("//*[@aria-label='rows per page']"));
		Select select = new Select(Sort);
		select.selectByValue("5");
		
		WebElement WebTable = driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']"));
		String webtable = WebTable.getText();
		System.out.println(webtable);
		
		WebElement SearchBox = driver.findElement(By.id("searchBox"));
		SearchBox.sendKeys("Alden");
		
		WebElement WebTable1 = driver.findElement(By.xpath("//*[@class='rt-tr-group']"));
		String webtable1 = WebTable1.getText();
		System.out.println("----------------");
		System.out.println(webtable1);
		
		WebElement Delete = driver.findElement(By.id("delete-record-2"));
		Delete.click();
		
	}

}
