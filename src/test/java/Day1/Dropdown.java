package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Drop Down
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select dropdown = new Select(country);
		Thread.sleep(2000);
		//dropdown.selectByValue("Brazil");
		//Thread.sleep(1000);
		dropdown.selectByIndex(4);
		List<WebElement> count =dropdown.getOptions();
		for (int i =0;i<count.size();i++ ) {
			System.out.println(count.get(i).getText());
		}
	}

}
