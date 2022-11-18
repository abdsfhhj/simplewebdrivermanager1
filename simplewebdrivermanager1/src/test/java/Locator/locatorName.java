package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("@1Vasant23$");

		driver.findElement(By.name("login")).click();
		
		

	}

}
