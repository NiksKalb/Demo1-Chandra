package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args) throws InterruptedException {
		// Display
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		System.out.println(logo.isDisplayed());
		driver.quit();
		
     
	}

}
