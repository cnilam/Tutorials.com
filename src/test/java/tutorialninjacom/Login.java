package tutorialninjacom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String args[])
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver_win32 (1)\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
			
			
		}
	
}
	
