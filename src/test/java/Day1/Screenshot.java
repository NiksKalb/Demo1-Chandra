package Day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uncodemy.com/");
		Thread.sleep(4000);
		WebElement screenshot = driver.findElement(By.xpath("//div[@class=\"home-button\"]"));
	File screen = screenshot.getScreenshotAs(OutputType.FILE);
	File targetfile = new File("C:\\Users\\RISHITA AGRAWAL\\eclipse-workspace\\SeleniumWeekDayMorning\\src\\test\\java\\Screenshot\\abc.png"); 
//	((File) screenshot).renameTo(targetfile);
	screen.renameTo(targetfile);
	driver.quit();
	}

}
