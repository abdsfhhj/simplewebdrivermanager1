package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	String url="https://www.facebook.com/";
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Good/Chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	@Test
	public void Loginfb()
	{
		driver.findElement(By.id("email")).sendKeys("nobody");
		driver.findElement(By.id("pass")).sendKeys("kishore123");
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}
	@AfterTest()
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
