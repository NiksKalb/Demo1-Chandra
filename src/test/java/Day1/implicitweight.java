package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitweight {

	public static void main(String[] args) {
		// Implicity weight
		/*Advantage of Implicit wait
		 * Single time declaration
		 * it will bnot wait for maximum time ,if element is available on time
		 * applicable for all element
		 * it is easy to use
		 * Disadvantage :- If time is not sufficienet they throw exception*/
		 
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().minimize();
	}
		
	}


