package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorCssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// located Based on ID
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");		
		driver.findElement(By.cssSelector(".button")).click();



	}

}
