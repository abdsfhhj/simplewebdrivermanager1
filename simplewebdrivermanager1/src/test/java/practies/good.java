package practies;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class good {
	
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver","./Demo/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
			WebElement Washington=driver.findElement(By.id("box3"));
			WebElement UnitedStates=driver.findElement(By.id("box103"));
		
			good.DragandDropActions(Washington, UnitedStates, driver);
		
		  	}
	public static void DragandDropActions(WebElement source,WebElement Target,WebDriver driver)
	{
		new Actions(driver).dragAndDrop(source, Target).build().perform();
	}
}
	
	
		


