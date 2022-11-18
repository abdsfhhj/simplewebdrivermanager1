package ScreenShot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UtilityScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl() + "   " + driver.getTitle());
		
		captureScreenShot(driver,"login.png");
		//driver.findElement(By.linkText("Sign Up")).click();
		captureScreenShot(driver,"Sign Up");


}

		
	
public static void captureScreenShot(WebDriver driver,String ScreenShotName) throws IOException
{
   
	
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File sourse =scrShot.getScreenshotAs(OutputType.FILE);

   File Destination =new File("./Screenshot/"+ScreenShotName+".png");
    FileHandler.copy(sourse, Destination);


	}

}
