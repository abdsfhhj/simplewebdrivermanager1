package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkartlogin {
   
	
	
	WebDriver driver;
	String url="http://www.flipkart.com";
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "./Good/Chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@Test
	public void LoginFlipkard()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
