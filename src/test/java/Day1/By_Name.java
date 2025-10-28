package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
WebElement email=driver.findElement(By.name("username"));
email.sendKeys("nskalbandhes");
email.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);

email.sendKeys(Keys.DELETE);
Thread.sleep(2000);

	}

}
