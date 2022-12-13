package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();

		WebElement Button = driver.findElement(By.id("showSmallModal"));
		Button.click();
		boolean present = Button.isEnabled();
		System.out.println(present);
		String text = Button.getText();
		System.out.println(text);

		String window = driver.getWindowHandle();
		Set<String> window1 = driver.getWindowHandles();
		for (String newwindow : window1) {
			driver.switchTo().window(newwindow);
		}

		WebElement Button1 = driver.findElement(By.id("closeSmallModal"));
		Button1.click();
		WebElement content = driver.findElement(By.xpath("//*[@class='modal-body']"));
		String text1 = content.getText();
		System.out.println(text1);

	}

}
