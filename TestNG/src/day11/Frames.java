package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;

	@Test
	public void frames() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();

		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt39"));
		TaskManager.click();

		WebElement Frames = driver.findElement(By.id("menuform:m_frame"));
		Frames.click();

		driver.switchTo().frame(0);

		WebElement Inside_Frame = driver.findElement(By.id("Click"));
		Inside_Frame.click();
		String Frametext = Inside_Frame.getText();
		System.out.println(Frametext);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		WebElement Count_Frames = driver.findElement(By.id("Click"));
		Count_Frames.click();
		String Frametext1 = Count_Frames.getText();
		System.out.println(Frametext1);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");

		WebElement Inside_NestedFrames = driver.findElement(By.id("Click"));
		Inside_NestedFrames.click();
		String Frametext2 = Inside_NestedFrames.getText();
		System.out.println(Frametext2);

		driver.navigate().back();

	}

}
