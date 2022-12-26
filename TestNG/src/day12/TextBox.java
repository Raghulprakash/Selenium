package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TextBox {
	WebDriver driver;
	@Test
	public void textbox() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();

		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt40"));
		TaskManager.click();

		WebElement text = driver.findElement(By.id("menuform:m_input"));
		text.click();

		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Babu Manickam");

		WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
		city.clear();
		city.sendKeys("Chennai");

		WebElement verify = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean Verify = verify.isEnabled();
		System.out.println("Text box is enable :" + Verify);

		WebElement Clear = driver.findElement(By.id("j_idt88:j_idt95"));
		Clear.clear();

		WebElement Retrive = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
		String retrive = Retrive.getText();
		System.out.println("Text in Retrive : " + retrive);

		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("abc@gmail.com");
		email.sendKeys(Keys.TAB);

		WebElement about = driver.findElement(By.id("j_idt88:j_idt101"));
		about.sendKeys(" Hi Welcome Everyone to the leafground.com ");

		WebElement Error = driver.findElement(By.id("j_idt106:thisform:age"));

		Error.sendKeys("20");
		Error.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement Spin = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt106:j_idt118_input")));
		Spin.sendKeys("0");

		WebElement Spindown = driver.findElement(By.xpath("//*[@class='ui-icon ui-c ui-icon-triangle-1-s']"));
		Spindown.click();
		Spindown.click();

		WebElement Keyboard = driver.findElement(By.id("j_idt106:j_idt122"));
		Keyboard.click();

		WebElement Keyboarddisplay = driver.findElement(By.xpath(
				"//*[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
		boolean Display = Keyboarddisplay.isDisplayed();
		System.out.println("Is keyboard aviable : " + Display);

		WebElement Close = driver.findElement(By.xpath("//*[text()='Close']"));
		Close.click();

		driver.navigate().back();
	}
}