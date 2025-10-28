package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		/* Absolute Xpath it is a tool or locator
		 * its also know as full xpath
		 * Absolute Xpath Ex. :- https://uncodemy.com/Course/Java Training Course in Noida by Uncodemy
		 * Realative X path Ex. :- //input[@id='password']
		 * Which xpath used in industry ? Ans :- Relative Xpath
		 * Reason :- In absolute xpath if there is some minor change in code and design
		 * The previoius x path would be incorrect
		 * as it is depend on the all nodes /tags . its starts from  node
		 * Relative X path it is very rare we change the attribute or tag name
		 * Reason 2 :- Relative Xpath is faster as its directly jump to main tag & Attribute
		 * How to use Relative Path 
		 * Format of xpath :- //Tag name [@attribute name ='The attribute value']*/ 
 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
