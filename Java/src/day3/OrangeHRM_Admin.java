package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class OrangeHRM_Admin  
{
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.name("username"));
		UserName.sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		
		WebElement Login = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		Login.click();
		
		WebElement Search = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
		Search.sendKeys("admin");
		
		WebElement Admin = driver.findElement(By.xpath("//*[text() ='Admin']"));
		Admin.click();
		
		WebElement LeftIcon = driver.findElement(By.xpath("//*[@class='oxd-icon-button oxd-main-menu-button']"));
		LeftIcon.click();
		
		WebElement Add = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		Add.click();
		
		WebElement EmployeeName = driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
		EmployeeName.sendKeys("ABCD");
		
		
		
	}
}
