package frameworkdesigney.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage 


{
	WebDriver driver;
	public void Loginpage(WebDriver cdriver)
	{
		this.driver=cdriver;
	}

	
	@FindBy(id="txtUsername")
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	
	public void logintoorange(String uname,String pwd) throws InterruptedException
	{
		System.out.println(uname);
    Thread.sleep(2000);
	txtUsername.sendKeys(uname);
	txtPassword.sendKeys(pwd);
	btnLogin.click();
	}
	
}
