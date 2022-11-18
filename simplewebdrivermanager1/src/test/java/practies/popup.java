package practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//I am a JS Alert
		WebElement js_alert  = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		WebElement jsConfirm =driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		WebElement jsPrompt =driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		   
		
		js_alert.click();
		
	    Alert alert = driver.switchTo().alert();
	    String str=alert.getText();
	    System.out.println(str);
	    
	    alert.accept();
	    Thread.sleep(5000);
	     String stre = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	     System.out.println(stre);
	     
	   
	     jsConfirm.click();
	    // driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	     Alert alert1 = driver.switchTo().alert();
	       String str1= alert1.getText();
	       System.out.println(str1);
	       //alert1.dismiss();
	       alert1.accept();
	       
	     String string = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	     System.out.println(string);
	     
	     
	     //
	    // driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	     jsPrompt.click();
	     Alert alert2 = driver.switchTo().alert();
	      String str2= alert2.getText();
	      System.out.println(str2);
	      
	     // alert.accept();
	      alert.dismiss();
	     String string1= driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	     System.out.println(string1);
	            
	       
	       
	           
	       


	}

}
