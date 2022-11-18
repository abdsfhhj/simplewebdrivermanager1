package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreesnshot1 {

	public static void main(String[] args)throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getCurrentUrl() + "   " + driver.getTitle());
		
		captureScreenshhot(driver, "login");
		
		//driver.findElement(By.id("email")).sendKeys("vasant@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Vasant@123");
		
		//captureScreenshhot(driver, "fb_login_cred");

		//driver.findElement(By.name("login")).click();
		
		//captureScreenshhot(driver, "fb_login_clicked");
		
		driver.quit();

	}
	
	
	public static void captureScreenshhot(WebDriver driver, String screenshotName) throws WebDriverException, IOException
	{
		FileHandler.copy(((TakesScreenshot)driver).
				getScreenshotAs(OutputType.FILE), new File("./Screenshot/"+screenshotName+".png"));
	}

		

	}



