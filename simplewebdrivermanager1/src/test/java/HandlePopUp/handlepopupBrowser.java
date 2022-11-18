package HandlePopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlepopupBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	WebElement  js_alert =	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
	WebElement	js_confirm =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
	WebElement js_prompt =	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));

		 js_alert.click();
		Alert alert=  driver.switchTo().alert();
		   String alertText = alert.getText();
		   System.out.println(alertText);
		   alert.accept();

		String Result =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	    System.out.println(Result);



		  js_confirm.click(); 
	    Alert alert1=  driver.switchTo().alert();
		   String alertText1 = alert1.getText();
		   System.out.println(alertText1);
		   //alert.accept();
		  alert.dismiss();

		String Result1 =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	    System.out.println(Result1);


		 js_prompt.click();
		 Alert alert2=  driver.switchTo().alert();
		   String alertText2 = alert2.getText();
		   System.out.println(alertText2);
		   //alert.accept();
		   alert.sendKeys("i am a kishor");
		   alert.accept();
		String Result2 =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	    System.out.println(Result2);
	    driver.close();
	    alert.sendKeys("i am a kishor");
	    alert.accept();
	    
	     

			}

}
