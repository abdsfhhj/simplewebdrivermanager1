package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorId {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");		
		//driver.findElement(By.id("btnLogin")).click();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
