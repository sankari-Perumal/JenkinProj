package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;

	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 15);
	}

	public abstract String pageTitle();

	public abstract String pageHeader(By locator);

	public abstract WebElement getElement(By locator);

	public abstract void waitForElement(By locator);

	public abstract void waitForPageTitle(String title);

	public<TPage extends BasePage> TPage getInstance(Class<TPage> PageClass)
	
	{
		try {
			return PageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
}