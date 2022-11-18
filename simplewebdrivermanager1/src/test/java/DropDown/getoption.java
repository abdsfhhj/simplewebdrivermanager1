package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getoption {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();

		WebElement dom = driver.findElement(By.name("birthday_month"));


		Select sel = new Select(dom);
		WebElement before_select = sel.getFirstSelectedOption();
		String before_select_month =before_select.getText();
		System.out.println("Already selected month:"+ before_select_month);
		sel.selectByIndex(9);

		WebElement after_select = sel.getFirstSelectedOption();
		String after_select_month =after_select.getText();
		System.out.println("Already selected month:"+ after_select_month);
		sel.selectByIndex(2);


	}

}
