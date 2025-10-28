package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		Actions keyboard = new Actions(driver);
		
	driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello, My name is Nikhil");
	keyboard.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	keyboard.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	keyboard.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	keyboard.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
