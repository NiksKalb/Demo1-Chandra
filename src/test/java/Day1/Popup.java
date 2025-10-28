package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// POP Up 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uncodemy.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder=\"Type your message...\"]")).sendKeys("Hi i am Nikhil");
		driver.quit();
	}

}
