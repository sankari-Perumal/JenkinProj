package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.LoginPage;

public class LoginTest extends TestBase {

	@Test
	public void verifyLogin() {
//		test = extentReports.createTest("test");

		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Sign In | Amil Freight");
		/*
		 * test=er.createTest("Login Test"); test.log(Status.PASS, "Login Passed");
		 */
	}

}
