package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreesnshot2 {

	public static void main(String[] args)throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getCurrentUrl() + "   " + driver.getTitle());

		WebElement form = driver.findElement(By.xpath("//form"));

		File source = form.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/fb_form.png");

		FileHandler.copy(source, target);

		driver.findElement(By.id("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vasant@123456");

		captureScreenshot(form, "form1");
		
		captureScreenshot(driver.findElement(By.xpath("//img[@alt='Facebook']")), "fb_logo");

		driver.quit();

	}

	public static void captureScreenshot(WebElement ele, String name) throws WebDriverException, IOException {
		FileHandler.copy(ele.getScreenshotAs(OutputType.FILE), new File("./Screenshot/" + name + ".png"));

	}


	}


