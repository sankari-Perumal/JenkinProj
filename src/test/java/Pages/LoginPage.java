package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By un = By.xpath("//*[@id='txtusername']");
	private By pwd = By.xpath("//*[@id='txtpassword']");
	private By login = By.xpath("//*[@id='btnSignIn']");
	private By header = By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/h3");
	

	public WebElement getuname() {
		return getElement(un);
	}

	public WebElement getpassword() {
		return getElement(pwd);
	}

	public WebElement getlogin() {
		return getElement(login);
	}

	public WebElement getheader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		return pageTitle();
	}
	
	public String getLoginPageHeader() {
		return pageHeader(header);
	}
	
	
	public HomePage doLogin(String userName,String password)
	{
		getuname().sendKeys(userName);
		getpassword().sendKeys(password);
		getlogin().click();
		return getInstance(HomePage.class);
	}
	
}
