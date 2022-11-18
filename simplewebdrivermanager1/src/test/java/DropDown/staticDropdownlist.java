package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticDropdownlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
		WebElement n =  driver.findElement(By.id("countriesSingle"));
		//WebElement n =  driver.findElement(By.id("countriesSingle"));
		
	
		Select sel = new Select(n);
		WebElement ele =  sel.getFirstSelectedOption();
		    String str =  ele.getText();
		    System.out.println("select the countries:"+ str);
		    sel.selectByValue("china");
		   // sel.selectByIndex(1);
	}

}
