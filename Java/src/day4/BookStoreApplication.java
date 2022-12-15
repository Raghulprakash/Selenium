package day4;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement Newuser = driver.findElement(By.id("newUser"));
		Newuser.click();
		
		WebElement FirstName = driver.findElement(By.id("firstname"));
		FirstName.sendKeys("abc");
		
		WebElement LastName = driver.findElement(By.id("lastname"));
		LastName.sendKeys("def");
		
		WebElement UserName = driver.findElement(By.id("userName"));
		UserName.sendKeys("abcdef");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("password");
	
		
		WebElement Backtologin = driver.findElement(By.id("gotologin"));
		Backtologin.click();
		
		WebElement Username = driver.findElement(By.id("userName"));
		Username.sendKeys("xyzabc");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd1234@");
		
		WebElement LoginButton = driver.findElement(By.id("login"));
		LoginButton.click();
		
		
		WebElement BookSearch = driver.findElement(By.id("searchBox"));
		BookSearch.sendKeys("Git Pocket Guide");
		
		WebElement Searchicon = driver.findElement(By.id("basic-addon2"));
		Searchicon.click();

		WebElement DeleteAllBook = driver.findElement(By.xpath("//*[@class='text-right button di']//*[text()='Delete All Books']"));
		DeleteAllBook.click();
		
		WebElement Confirm = driver.findElement(By.id("closeSmallModal-ok"));
		Confirm.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement GoTo = driver.findElement(By.id("gotoStore"));
		GoTo.click();
		
		
		WebElement Logout = driver.findElement(By.id("submit"));
		Logout.click();
		
		
	}

}
