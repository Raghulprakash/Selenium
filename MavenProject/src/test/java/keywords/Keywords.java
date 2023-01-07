package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	static WebDriver driver;

	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void fetchurl() {
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
	}

	public static void providingusername() {
		WebElement Username = driver.findElement(By.id("userName"));
		Username.sendKeys("xyzabc");
	}

	public static void providinguserpassword() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd1234@");
	}

	public static void iniciatelogin() {
		WebElement LoginButton = driver.findElement(By.id("login"));
		LoginButton.click();
	}

}
