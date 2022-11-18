package HandleFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");

		  List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		  System.out.println("Total number of frames : " + frame.size());

		  WebElement frames = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
		  driver.switchTo().frame(frames);

		String para =  driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).getText();
		System.out.println(para);

		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		textBox.clear();

		// textBox.sendKeys("good morning"); 



	}

}
