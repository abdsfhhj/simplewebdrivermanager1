package Application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {
  //private static final TimeUnit TimeUnit = null;

   WebDriver driver;
	
	String fbUrl = "https://www.fb.com";
	String facebookUrl = "https://www.facebook.com/reg/";
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"./Good/Chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit);

		driver.manage().deleteAllCookies();
		
		driver.get(fbUrl);
		driver.get(facebookUrl);
		
		String urlFromBrowser = driver.getCurrentUrl();
		 //String actualURL = driver.getCurrentUrl();
		 //System.out.println(actualURL);
		// Assert.assertTrue(expectedURL.equals(actualURL));
	      //  System.out.println("Test Passed");  
		Assert.assertEquals(urlFromBrowser, facebookUrl, "redirection happened");
		
		 
	}
	
	@Parameters("Keyword")
	@Test
	//public void facebookSignUp() {
	public void parameterpassing(String Keyword) {
		
		driver.findElement(By.name("firstname")).sendKeys("kishor");
		driver.findElement(By.name("lastname")).sendKeys("Talele");
		driver.findElement(By.name("reg_email__")).sendKeys("kishortalele95@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kish123");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByIndex(03);
		selMonth.selectByVisibleText("May");
		selYear.selectByValue("1992");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
	
	@AfterClass
	public void closeBrowser(){
		
		//driver.quit();
		
	}

}
 

