package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithText {

	public static void main(String[] args) throws InterruptedException {
		// With Text
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//tag name[@attribute name ] This work on for text
		//it is also know as inner text
		
		//Xpath with Contain
		

		
	}

}
