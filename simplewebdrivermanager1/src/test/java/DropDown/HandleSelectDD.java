package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSelectDD {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();

		WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		WebElement doy_dd = driver.findElement(By.name("birthday_year"));

		HandleSelectDD.selectDropDownByIndex(dob_dd, 2);
		HandleSelectDD.selectDropDownByVisibleText(dom_dd, "Apr");
		HandleSelectDD.selectDropDownByValue(doy_dd, "1996");

	}

	public static void selectDropDownByVisibleText(WebElement dropdown, String visibleText) {
		new Select(dropdown).selectByVisibleText(visibleText);
	}

	public static void selectDropDownByValue(WebElement dropdown, String value) {
		new Select(dropdown).selectByValue(value);
	}

	public static void selectDropDownByIndex(WebElement dropdown, int index) {
		new Select(dropdown).selectByIndex(index);
	}

	}


