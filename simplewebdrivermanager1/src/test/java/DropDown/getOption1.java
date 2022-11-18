package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getOption1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();


		WebElement dom = driver.findElement(By.name("birthday_month"));


		Select sel = new Select(dom);
		List<WebElement> ddlist = sel.getOptions();
		int totalmonth = ddlist.size();
		System.out.println("total month :"+ totalmonth );


	}

}
