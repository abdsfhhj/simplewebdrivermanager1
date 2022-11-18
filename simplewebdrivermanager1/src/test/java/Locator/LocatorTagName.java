package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");

		    Thread.sleep(300);
		    List<WebElement> elm =  driver.findElements(By.tagName("input"));
		    int total = elm.size();
		    System.out.println("Total webelement starting with tagname'input' = "+ total);
		    Thread.sleep(500);


	}

}
