package SynchronizationInWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWait {
	
		@Test
		    public void FluntWait() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(5000);//static wait
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(5000); //static wait

			}
}
