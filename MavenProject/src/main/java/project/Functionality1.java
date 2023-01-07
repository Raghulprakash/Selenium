package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functionality1 
{
	public WebDriver driver;

	public void authentication() {

		String Window = driver.getWindowHandle();

		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt38"));
		TaskManager.click();

		WebElement Approval = driver.findElement(By.xpath("//span[text()='Auth']"));
		Approval.click();

		WebElement BasicAuthentication = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		BasicAuthentication.click();

		Set<String> Window1 = driver.getWindowHandles();
		for (String newwindows : Window1) {
			driver.switchTo().window(newwindows);
		}
		driver.close();
		driver.switchTo().window(Window);
		driver.navigate().back();
		driver.navigate().back();
	}
}
