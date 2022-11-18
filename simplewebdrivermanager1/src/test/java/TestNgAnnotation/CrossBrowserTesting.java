package TestNgAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"Browser","url"})
	public void setUp(@Optional("Chrome")String brName,String url)
	{
		if(brName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Good/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(brName.equals("Firefox"))
		{
		System.setProperty("webdeiver.gecko.driver", "./Good/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		driver.manage().window();
		driver.get(url);
	}
	@Test()
	public void verifyfbLoginpagetitle()
	{
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	}

}
