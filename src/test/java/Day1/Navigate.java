package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// Navigation 
		//get :- Accept url in string fromat only 
		// Navigate :- accept both string and object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 
		driver.navigate().to("https://www.facebook.com/");//alternative of get
	   System.out.println(driver.getTitle());
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//a[text()='Instagram']")).click();
	   System.out.println(driver.getTitle());
	   
	   driver.navigate().back();//go for back
	   System.out.println(driver.getTitle());
	 
	   driver.navigate().forward(); // go for next tab
	   System.out.println(driver.getTitle());
	  
	   driver.navigate().refresh();//for refresh
	   System.out.println(driver.getTitle());

	}

}
