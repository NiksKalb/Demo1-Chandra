package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement button =  driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']"));
		Thread.sleep(1000);
	    button.sendKeys("C:\\Users\\RISHITA AGRAWAL\\Downloads\\Daily Attendance Report (1).pdf");
	    driver.manage().window().minimize();
	}

}
