package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static  void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Good//chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://the-internet.herokuapp.com/iframe");
		  List<WebElement> Frame= driver.findElements(By.tagName("iframe"));
		   int TotalFrame  =  Frame.size();
		        System.out.println("toatal number of Frame:"+TotalFrame);
		        
		  WebElement frames= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		          driver.switchTo().frame(frames);
		           
		           
		          String str = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).getText();
		          System.out.println(str);
		          
		WebElement textbox  = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		 textbox.clear();
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Elemental Selenium")).click();
		   }
	
		
	
}
