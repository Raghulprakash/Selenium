package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		driver.manage().window().maximize();
		
		WebElement Listbox = driver.findElement(By.xpath("//*[@class='tab-content']"));
		String Content = Listbox.getText();
		System.out.println(Content);
	}

}
