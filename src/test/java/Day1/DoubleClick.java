package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// Double Click [//Tagname[text()=tag value] 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions click1 = new Actions(driver);
		Thread.sleep(1000);
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Thread.sleep(2000);
	click1.doubleClick(button).build().perform();
	driver.quit();
	}

}
