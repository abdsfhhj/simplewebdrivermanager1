package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
   public static void main(String[]args)
   {
	   System.setProperty("webdriver.chrome.driver","./Good/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	List<WebElement> ele = driver.findElements(By.tagName("input"));
	int totalinput=ele.size();
	System.out.println("Total input:"+ totalinput);
   }

}
