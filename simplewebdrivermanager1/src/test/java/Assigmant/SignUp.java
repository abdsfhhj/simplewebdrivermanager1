package Assigmant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUp {
	 //private static final TimeUnit TimeUnit = null;
	
	WebDriver driver;
	 String url="https://www.facebook.com/";
	 
	String  facebookUrl ="https://www.facebook.com/reg/";
	
	@BeforeClass
	 public void f()
	 {
		 System.setProperty("webdriver.chrome.driver","./Good/chromedriver.exe");
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		driver.get(url);
		driver.get(facebookUrl);
		String urlFromBrowser = driver.getCurrentUrl();
		 //String actualURL = driver.getCurrentUrl();
		 //System.out.println(actualURL);
		// Assert.assertTrue(expectedURL.equals(actualURL));
	      //  System.out.println("Test Passed");  
		Assert.assertEquals(urlFromBrowser, facebookUrl, "redirection happened");
		
		
	 }

		
		@Test
		public void FacebookSignUp(){
	
				driver.findElement(By.name("firstname")).sendKeys("kishor");
				driver.findElement(By.name("lastname")).sendKeys("Talele");
				driver.findElement(By.name("reg_email__")).sendKeys("kishortalele95@gmail.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("@234weere");
				
		  WebElement day=driver.findElement(By.name("birthday_day"));
		  WebElement month=driver.findElement(By.name("birthday_month"));
		  WebElement year=driver.findElement(By.name("birthday_year"));
		
		Select DropdownDay =new Select(day);
		Select DropdownMonth =new Select(month);
		Select DropdownYear =new Select(year);
		
		DropdownDay.selectByIndex(03);
		DropdownMonth.selectByVisibleText("May");
		DropdownYear.selectByValue("1992");
		
		
	driver.findElement(By.xpath("//input[@type='radio' and @ value=\"2\"]")).click();
		
		
		//driver.findElement(By.name("websubmit"));
		}
		
		@AfterClass
		  public void closeBrowser() {
		  	  //System.out.println("Closing the browser session");
		  	//  driver.quit();
		  }
		
	 }


