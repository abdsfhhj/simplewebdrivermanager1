package Configration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oranghrm {

	public static void main(String[] args) throws IOException {
		File fs = new File("./Configrartion/config1.properties");
		FileInputStream fins = new FileInputStream(fs);
		Properties prop = new Properties();
		prop.load(fins);


		System.setProperty(prop.getProperty("driver_key"), prop.getProperty("driver_value"));
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		driver.findElement(By.name("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("Submit")).click();



	}

}
