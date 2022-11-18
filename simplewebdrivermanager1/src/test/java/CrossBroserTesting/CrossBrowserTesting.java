package CrossBroserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CrossBrowserTesting {
	static WebDriver driver;
	
	public static void LunchBrowser(String Browsename,String url)
	{
		if(Browsename.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","./Good/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (Browsename.equals("Firefox"))
		{
			//System.setProperty("webdriver.firefox.driver","/Good/geckodriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
	}
	public static void main(String[] args) {
		CrossBrowserTesting.LunchBrowser("chrome", "https://www.facebook.com/");
		CrossBrowserTesting.LunchBrowser("Firefox", "http://www.gmail.com/");

	}

}
