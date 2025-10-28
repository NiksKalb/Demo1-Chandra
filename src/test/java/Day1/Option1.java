package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Option1 {

	public static void main(String[] args) throws InterruptedException {
		// Chrome options
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless=new");//execute all things in backend
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});//to remove "chrome is being controlled b y test software
		opt.addArguments("--Incognito"); // use incognito
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://medimention.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		

	}

}
