package day4;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookStore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String Window = driver.getWindowHandle();
		
		WebElement Content = driver.findElement(By.xpath("//*[@class='rt-table']"));
	    String Details = Content.getText();
		System.out.println(Details);
		System.out.println("----------------");
		WebElement SearchBox = driver.findElement(By.id("searchBox"));
		SearchBox.sendKeys("O'Reilly Media");
		
		WebElement SearchButton = driver.findElement(By.id("basic-addon2"));
		SearchButton.click();
		
		List<WebElement> Title = driver.findElements(By.xpath("//*[@class='rt-tbody']//*[@class='mr-2']"));
		for (int i = 0; i < Title.size(); i++) {
			System.out.println(Title.get(i).getText());
		}
		
		System.out.println("----------------");
	 
		WebElement SearchBox1 = driver.findElement(By.id("searchBox"));
		SearchBox1.clear();
		SearchBox1.sendKeys("Eric Elliott");
		
		WebElement Title1 = driver.findElement(By.xpath("//*[@class='rt-tbody']//*[@class='mr-2']"));
		String title = Title1.getText();
		System.out.println(title);
		Title1.click();
		
		System.out.println("----------------");
		System.out.println("Description : ");
		
		WebElement Description = driver.findElement(By.xpath("//div[@id='description-wrapper']//label[@id='userName-value']"));
		String description = Description.getText();
		System.out.println(description);
		
		WebElement Website = driver.findElement(By.xpath("//div[@id='website-wrapper']//*[@id='userName-value']"));
		String website = Website.getText();
		System.out.println("----------------");
		System.out.println("Website : "+website);
	
		driver.navigate().to(website);
		
		Set<String> Window1 = driver.getWindowHandles();
		for (String newwindows : Window1) {
			driver.switchTo().window(newwindows);
		}
		driver.quit();
	}

}
