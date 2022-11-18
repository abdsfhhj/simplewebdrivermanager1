package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class goode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		
	 boolean b1 =	driver.findElement(By.name("websubmit")).isDisplayed();
	System.out.println(b1);
		
		boolean b2 =driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);
		    
		
		
		boolean b3 =driver.findElement(By.name("birthday_day")).isSelected();
            
		System.out.println(b3);
		
		driver.quit();
		

	}

}
