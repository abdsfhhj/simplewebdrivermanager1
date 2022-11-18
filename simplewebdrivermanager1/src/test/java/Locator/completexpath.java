package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class completexpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		 driver.get("https://opensource-demo.orangehrmlive.com/");

		 //driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		 //driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		 //driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
         // tagname(attributrname="attributevalue");

		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();

	}

}
