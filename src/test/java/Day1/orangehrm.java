package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
	
		
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Admin");
		
        WebElement Pwd=driver.findElement(By.xpath("//input[@name='password']"));
	    Pwd.sendKeys("admin123");
		//Thread.sleep(500);
		
		//doubt needs to verify name & pwd then login[use if else conditoin]
		//or directly we click submit button it fine
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
	    btn.click();
				
	    WebElement admindash=driver.findElement(By.xpath("//span[text()='Admin']"));
	    admindash.click();
	    Thread.sleep(500);
	    
	    //how to select path username
	    List<WebElement> username1=driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
	    username1.get(1).sendKeys("Nikhil");
	    Thread.sleep(2000);
	   List<WebElement>st= driver.findElements(By.xpath("//div[text()='-- Select --']"));
	   st.get(0).click();
	   Thread.sleep(1000);
	    
	    
	   //for dropdown not working properly so used   keyboard action options
	    Actions dropact=new Actions(driver);
	    dropact.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
	    Thread.sleep(1000);
	    

	    WebElement empName=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	   empName.sendKeys("ABC");
	    Thread.sleep(5000);
        driver.quit();
	}}