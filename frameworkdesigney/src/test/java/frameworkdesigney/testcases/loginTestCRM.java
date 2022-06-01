package frameworkdesigney.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frameworkdesigney.pages.Baseclass;
import frameworkdesigney.pages.loginpage;
import frameworkdesigney.utilites.BrowserFactory;
import frameworkdesigney.utilites.ExcelDataProvider;
import frameworkdesigney.utilites.Helper;

public class loginTestCRM extends Baseclass




{
	
	
	
	@Test
	public void loginApp() throws InterruptedException, FileNotFoundException
	{
		
		
		
	
		
	//	driver=BrowserFactory.startApplication(driver, "Chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		loginpage loginpage=PageFactory.initElements(driver, loginpage.class);
		
		
		loginpage.logintoorange(excel.getStringData(0, 0, 0),excel.getStringData(0, 0, 1));
		Helper.captureScreenshot(driver);
		
	}
	
	
	
	
	
	
}
