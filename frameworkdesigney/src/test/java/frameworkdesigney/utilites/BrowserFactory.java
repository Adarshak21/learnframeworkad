package frameworkdesigney.utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory 


{
	WebDriver driver;
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String appURL)
	{
		
		System.out.println(browsername);
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\XMAS\\Driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("Not supported");
		}
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public static void quitbrowser(WebDriver driver)
	
	
	{
		
		driver.quit();
		
	}

}
