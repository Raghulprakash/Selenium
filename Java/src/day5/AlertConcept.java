package day5;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		

		WebElement Button = driver.findElement(By.id("alertButton"));
		Button.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement Secondbutton = driver.findElement(By.id("timerAlertButton"));
		Secondbutton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		WebElement select = driver.findElement(By.id("confirmButton"));
		select.click();

		Alert cancel = driver.switchTo().alert();
		cancel.dismiss();

		WebElement promt = driver.findElement(By.id("promtButton"));
		promt.click();

		Alert ok = driver.switchTo().alert();
		ok.sendKeys("hi");
		ok.accept();

	}

}
