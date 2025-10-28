package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {
		// CSS Selectors
		/*We have multiple css selectors as below 
		 * 1-Tag ID , 2-Tag Class, 3-Tag Attribute, 4-Tag Class Attribute*/

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// How to use CSS selector Tag ID
		// "Tagname#ID Name" - (format)
		driver.findElement(By.cssSelector("input#email")).sendKeys("nskalbandhes");
		
	/*How to use tag class 
	 * format (.input)
		it has very lessefficency to find the particular element */
		//driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("Pass@123");
		
		// HOw to use Tag Attribute
		// tagname [attribute name='attribute value']
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("pass@123");
		
		// How to use class atrribute
		// tagname .classname[attributename='attribute value']
		
	}

}
