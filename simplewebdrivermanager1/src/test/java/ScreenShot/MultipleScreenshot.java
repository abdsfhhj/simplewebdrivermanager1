package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File("./ScreenShot/facebook_logIn.png");
		FileHandler.copy(Source, Target);


		driver.findElement(By.linkText("Sign Up")).click();
	    TakesScreenshot ts1=(TakesScreenshot)driver;
	     File source1=  (File) ts1.getScreenshotAs(OutputType.FILE);
	     File destination1 = new  File("./Screenshot/facebook_SignUp.png");
	     FileHandler.copy(source1, destination1);


		driver.quit();


	}

}
