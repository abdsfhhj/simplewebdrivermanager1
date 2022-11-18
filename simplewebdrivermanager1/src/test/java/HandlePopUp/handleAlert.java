package HandlePopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(result);


	}

}
