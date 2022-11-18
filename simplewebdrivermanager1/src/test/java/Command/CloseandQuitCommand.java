package Command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseandQuitCommand {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
				driver.get("https://opensource-demo.orangehrmlive.com/");

		
		String ptitle=driver.getTitle();
		System.out.println(ptitle );
		
		driver.close();
		
		String CuurUrl =driver.getCurrentUrl();
		System.out.println(CuurUrl);
		//driver.quit();
		
	}


	}


