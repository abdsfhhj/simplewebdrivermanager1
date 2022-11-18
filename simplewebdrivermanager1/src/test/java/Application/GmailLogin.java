package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailLogin {
	WebDriver driver;
	String url ="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	@BeforeClass
	public void lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Good/Chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	@Test
	public void gmail()
	{
		WebElement demo=	driver.findElement(By.id("txtUsername"));
			demo.sendKeys("Admin");
		
			WebElement good=	driver.findElement(By.id("txtPassword"));
					good.sendKeys("admin123");
	      WebElement act=driver.findElement(By.id("btnLogin"));
	       act.click();
	}   
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}

}
