package Day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        Thread.sleep(2000);

         ((JavascriptExecutor) driver).executeScript("window.open('https://testautomationpractice.blogspot.com/', '_blank');");
        Thread.sleep(2000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        		driver.switchTo().window(tabs.get(0));
                driver.findElement(By.id("inputText1")).sendKeys("Hello, My name is Nikhil");

         Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

         driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);

        driver.findElement(By.id("inputText2")).click();
        Actions actions2 = new Actions(driver);
        actions2.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

       String pasted = driver.findElement(By.id("inputText2")).getAttribute("value");
        System.out.println("✅ Pasted text in second tab: " + pasted);

        
        Thread.sleep(3000);
       
}}