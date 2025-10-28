package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		/*How to open beowser with swelenium
		 * What is selenium :-it is a web driver tool
		 *It helps to open a browser */
		
		//It help to open a browser
		WebDriver driver = new ChromeDriver(); 
       
		//How to open the web Browser with selenium
		driver.get("https://www.facebook.com/"); 
         
		//How to maximize the browser window
		driver.manage().window().maximize();
		
		//How to find element with ID attribute
		driver.findElement(By.id("email")).sendKeys("Nikhil Kalbandhe");
		driver.findElement(By.id("pass")).sendKeys("Nik@123");
		driver.findElement(By.id("u_0_5_iI")).click();
	}

}
