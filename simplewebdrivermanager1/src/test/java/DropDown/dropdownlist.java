package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();

		WebElement dob = driver.findElement(By.name("birthday_day"));
		WebElement dom = driver.findElement(By.name("birthday_month"));
		WebElement doy = driver.findElement(By.name("birthday_year"));


		Select sel_dob= new Select(dob);

		//sel_dob.selectByIndex(02);
		//sel_dob.selectByValue("May");
		//sel_dob.selectByVisibleText("1992");

		Select sel_dom= new Select(dom);
		Select sel_doy = new Select(doy);

		sel_dob.selectByIndex(02);
		sel_dom.selectByVisibleText("May");
		sel_doy.selectByValue("1992");

	}

	}


