package IsDisableMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/reg/");
		
		//1.isDisplayed()Method applicable for ll element
		boolean b1=driver.findElement(By.name("websubmit")).isDisplayed();//button
		System.out.println(b1);//true
		
		//2.isEnabled()Method
		boolean b2=driver.findElement(By.name("websubmit")).isEnabled();//button
		System.out.println(b2);//true
		
		
		// Select
		driver.findElement(By.name("websubmit")).click();
		boolean b3=driver.findElement(By.name("websubmit")).isEnabled();//button
		System.out.println(b3);//true
		
		//3.isSelected()Method only CheckBox,RadioButton,DropDown
		boolean b4=driver.findElement(By.name("birthday_day")).isSelected();
		System.out.println(b4);//true
		
		
	}

}
