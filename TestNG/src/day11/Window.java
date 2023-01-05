package day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {
	WebDriver driver;

	@Test
	public void window() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();

		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt39"));
		TaskManager.click();

		WebElement Window = driver.findElement(By.id("menuform:m_window"));
		Window.click();

		String Default_Window = driver.getWindowHandle();

		WebElement Windowopen = driver.findElement(By.id("j_idt88:new"));
		Windowopen.click();

		Set<String> Window1 = driver.getWindowHandles();
		for (String newwindow : Window1) {
			driver.switchTo().window(newwindow);
		}
		driver.close();
		driver.switchTo().window(Default_Window);

		WebElement MultipleWindowopen = driver.findElement(By.id("j_idt88:j_idt91"));
		MultipleWindowopen.click();

		int noofwindow = driver.getWindowHandles().size();
		System.out.println("Number of Window :" + noofwindow);

		Set<String> Window2 = driver.getWindowHandles();
		for (String Windows : Window2) {
			if (!Windows.equals(Default_Window)) {
				driver.switchTo().window(Windows);
				driver.close();
				System.out.println("Windows Closed Sucessfully");
			}
		}

		driver.switchTo().window(Default_Window);
		driver.navigate().back();
		driver.quit();

	}
}
