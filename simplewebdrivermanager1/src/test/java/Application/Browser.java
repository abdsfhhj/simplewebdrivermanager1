package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browser {

  	WebDriver driver;
  	String url="ttps://www.facebook.com/";
  
  @Test
  public void f() {
  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
  	  System.setProperty("webdriver.chrome.driver", "./good/chromedriver.exe");
  	 
  	//Setting the driver to chrome driver
  	  driver = new ChromeDriver();
  	 
  	  driver.get(url);
  	  //Capturing the title and validating if expected is equal to actual
  	 String expectedTitle = "Create a new account";
  	 String actualTitle = driver.getTitle();
  	Assert.assertEquals(actualTitle,expectedTitle);
    }
  @BeforeMethod
  	public void beforeMethod() {
  	 // System.out.println("Starting the browser session");
	  driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
  
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }
}


