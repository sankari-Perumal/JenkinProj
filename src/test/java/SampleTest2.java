import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.BasePage;
import Pages.Page;

public class SampleTest2 {

	WebDriver driver;

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUP(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Sankari\\FrameWork\\NaveenFw\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

			reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Report1.html");
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			test = extent.createTest("Tesr ");
			test.log(Status.PASS,"Passed");

		}
		driver.get("https://test.amilfreight.com/signin");
		Thread.sleep(7000);

	}

	@Test
	public void setup11() {
		System.out.println("Meyhod");
		test = extent.createTest("fddfsd");
	}

	@AfterMethod
	public void tearDown() {
		extent.flush();
		driver.quit();

	}

}
