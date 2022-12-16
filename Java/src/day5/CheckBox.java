package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement CheckBox = driver.findElement(By.xpath("//*[@for='tree-node-home']"));
		CheckBox.click();
		Thread.sleep(5000);
		CheckBox.click();
		
		WebElement Expand_add = driver.findElement(By.xpath("//*[@class='rct-option rct-option-expand-all']"));
		Expand_add.click();
		
		WebElement Expand_close = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-collapse-all']"));
		Expand_close.click();
		
		WebElement Expand_arrow = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']"));
		Expand_arrow.click();
		
		
		WebElement Text = driver.findElement(By.xpath("//*[@class='rct-node rct-node-parent rct-node-expanded']"));
		String text = Text.getText();
		System.out.println(text);
	}

}
