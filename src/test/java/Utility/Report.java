package Utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report extends TestListenerAdapter {

	WebDriver driver;
	ExtentReports extentReports;
	ExtentHtmlReporter html;
	ExtentTest test;

	public void onStart(ITestContext testContext) {
		extentReports = new ExtentReports();
		html = new ExtentHtmlReporter("er1.html");
		extentReports.attachReporter(html);
	}

	
	
	public void onFinish(ITestContext testContext) {
		extentReports.flush();
	}
}
