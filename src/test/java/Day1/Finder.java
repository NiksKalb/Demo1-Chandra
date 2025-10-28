package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finder {

	public static void main(String[] args) {
		//Finder
		/*How to open chrome/browser in selenium
		 *  */

		WebDriver driver = new ChromeDriver();
		//How to open any website on browser with the help of Selenium
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).click();
      	driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
		/*driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));*/
		//driver.quit();
	}

}
