package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserStack {
	
	
		WebDriver driver;
		String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
		
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
		public void browserStack()
		{
			WebElement username=driver.findElement(By.id("txtUsername"));
			WebElement password=driver.findElement(By.id("txtPassword"));
			WebElement login=driver.findElement(By.name("Submit"));
			username.sendKeys("Admin");
			password.sendKeys("admin123");
			login.click();
			String actualUrl="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
		}
		@AfterTest()
		public void CloseBrowser()
		{
			//driver.quit();
		}

	}



