package frameworkdesigney.pages;

import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import frameworkdesigney.utilites.BrowserFactory;
import frameworkdesigney.utilites.ExcelDataProvider;
import frameworkdesigney.utilites.Helper;
import frameworkdesigney.utilites.configreader;

public class Baseclass 

{
	public WebDriver driver;
	
	public ExcelDataProvider excel;
	 public configreader reader;
	 public ExtentReports report;
	
	@BeforeSuite
	public void  setupSuite() throws FileNotFoundException 
	{
		excel=new ExcelDataProvider();
		reader=new configreader();
	
		
	
	}
	
	@BeforeClass
	public void  setuppage() 
	{
		driver=BrowserFactory.startApplication(driver,reader.browser(),reader.url());
	}
@AfterClass
	
	public void testdown()
	{
		BrowserFactory.quitbrowser(driver);
		
	}
@AfterMethod
public void testdownmethod(ITestResult Result)
{
	if(Result.getStatus()==ITestResult.FAILURE)
	{
		Helper.captureScreenshot(driver);
	}
	
}
}
