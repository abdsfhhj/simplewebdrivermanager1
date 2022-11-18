package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		 WebElement Capital_Washington = driver.findElement(By.id("box3"));
		 WebElement Country_UnitedStates = driver.findElement(By.id("box103"));

		 WebElement Capital_Rome= driver.findElement(By.id("box6"));
		 WebElement Country_Italy= driver.findElement(By.id("box106"));

		 WebElement Capital_Madrid =driver.findElement(By.id("box7"));
		 WebElement Country_Spain =driver.findElement(By.id("box107"));

		 DragandDropAction.dragDropActions(Capital_Washington, Country_UnitedStates, driver);
		 DragandDropAction.dragDropActions(Capital_Rome, Country_Italy, driver);
		 DragandDropAction.dragDropActions(Capital_Madrid, Country_Spain, driver);


	}
	public static void dragDropActions(WebElement source, WebElement target, WebDriver driver) {
		new Actions(driver).dragAndDrop(source,target).build().perform();
	}


	}


