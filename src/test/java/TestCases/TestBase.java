package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.BasePage;
import Pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	public Page page;
	/*public ExtentReports extentReports;
	public ExtentHtmlReporter html;
	public ExtentTest test;
*/
	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUpTest(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Sankari\\FrameWork\\NaveenFw\\Driver\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			/*
			 * extentReports = new ExtentReports(); html = new
			 * ExtentHtmlReporter("er1.html"); extentReports.attachReporter(html);
			 */
		}
		driver.get("https://test.amilfreight.com/signin");
		Thread.sleep(7000);
		page = new BasePage(driver);

	}

	@AfterMethod
	public void tearDown() {
//		extentReports.flush();
		driver.quit();
	}
}
