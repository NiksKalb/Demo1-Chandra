package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		//Simple Alert
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"alertBtn\"]")).click();
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
		 
	    // Confirmation Alert
	    driver.findElement(By.xpath("//button[@id=\"confirmBtn\"]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	   
	    // Prompt alert
	    
	    driver.findElement(By.xpath("//button[@id=\"promptBtn\"]")).click();
	    Thread.sleep(2000);
	    Alert myalert= driver.switchTo().alert();
	    myalert.sendKeys("NIKHIL");
	    Thread.sleep(2000);
	    myalert.accept();
	   // driver.switchTo().alert().accept();
	}

}
