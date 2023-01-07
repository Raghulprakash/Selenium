package project;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Functionality2 
{
	public WebDriver driver;
	
	public void alerts() {
		WebElement TaskManager = driver.findElement(By.id("menuform:j_idt39"));
		TaskManager.click();
		
		WebElement Alert = driver.findElement(By.id("menuform:m_overlay"));
		Alert.click();
		
		WebElement Simple = driver.findElement(By.id("j_idt88:j_idt91"));
		Simple.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement Confirm = driver.findElement(By.id("j_idt88:j_idt93"));
		Confirm.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement Prompt= driver.findElement(By.id("j_idt88:j_idt104"));
		Prompt.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Hi");
		alert2.accept();
		
		WebElement Sweet_Alert= driver.findElement(By.id("j_idt88:j_idt106"));
		Sweet_Alert.click();
		
		WebElement Confirmation = driver.findElement(By.id("j_idt88:j_idt108"));
		Confirmation.click();
		
		WebElement Sweet_Alert1= driver.findElement(By.id("j_idt88:j_idt95"));
		Sweet_Alert1.click();
		
		WebElement Simple_Dialog = driver.findElement(By.id("j_idt88:j_idt98"));
		Simple_Dialog.click();
		
		WebElement Sweet_Alert2= driver.findElement(By.id("j_idt88:j_idt100"));
		Sweet_Alert2.click();
		
		WebElement Modal_Dialog = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']//span[@class='ui-icon ui-icon-closethick']"));
		Modal_Dialog.click();

	}
	
	public void frames() {
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
	
	public void window() {
		
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

	}
	public void drop()
	{
		
		WebElement TaskManager = driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		TaskManager.click();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='menuform:m_drag']"));
		drag.click();
		
		Actions action = new Actions(driver);

		WebElement Dragme = driver.findElement(By.id("form:drag_content"));
		WebElement Dropme = driver.findElement(By.id("form:drop_content"));
		
		action.clickAndHold(Dragme).moveToElement(Dropme).release(Dropme).build().perform();
		
		WebElement Dragme1 = driver.findElement(By.id("form:conpnl"));
		
		int x = Dragme1.getLocation().getX();
		System.out.println(x);
		int y = Dragme1.getLocation().getY();
		System.out.println(y);
		action.dragAndDropBy(Dragme1, x , y+200).perform();
		
		driver.navigate().back();
	}	
	
	public static void main(String[]args) {
		
		Functionality2 runner = new Functionality2();
		
	    runner.alerts();
	    runner.frames();
        runner.window();
	    runner.drop();
		
		}
}
