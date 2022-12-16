package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String Window = driver.getWindowHandle();
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		
		Set<String> Window1 = driver.getWindowHandles();
		for (String newwindows : Window1) {
			driver.switchTo().window(newwindows);
		}

		WebElement Text = driver.findElement(By.id("sampleHeading"));
		String text = Text.getText();
		System.out.println(text);
		
		driver.close();
		driver.switchTo().window(Window);
		
		WebElement NewWindow = driver.findElement(By.xpath("//*[@class='mt-4 btn btn-primary']"));
		NewWindow.click();
		
		Set<String> Window2 = driver.getWindowHandles();
		for (String newwindows : Window2) {
			driver.switchTo().window(newwindows);
		}
		
		WebElement Text1 = driver.findElement(By.id("sampleHeading"));
		String text1 = Text1.getText();
		System.out.println("----------------");
		System.out.println(text1);
		
		driver.close();
		driver.switchTo().window(Window);
		
		WebElement NewWindowMessage = driver.findElement(By.id("messageWindowButton"));
		NewWindowMessage.click();
		
		Set<String> Window3 = driver.getWindowHandles();
		for (String newwindows : Window3) {
			driver.switchTo().window(newwindows);
		}
		
		driver.close();
		driver.switchTo().window(Window);
	}

}
