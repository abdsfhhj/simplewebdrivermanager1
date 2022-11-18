package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleApp {
	
	WebDriver driver;
	
	String url="https://www.google.com";
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "./Good/Chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		System.out.println("Starting the browser session");	
		
		
		String expectedTitle ="Google";
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle);
	}
	@Test
	public void f()
	{
	 WebElement act= driver.findElement(By.name("q"));
			 act.sendKeys("fb.com");
	 		act.click();
	 	
		
		
	}
	
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Closing the browser session");	
		driver.quit();
	}
}
