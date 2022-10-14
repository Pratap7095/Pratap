package App.Test.pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import App.Pages.Locator_1;
import baseClass.BaseClass;
import commonutils.ScreenShots;

public class TestPage1 extends BaseClass{
	
	public TestPage1() throws IOException {
		super();
		
	}
	@Test(priority = 0)
	public void Validate_Registe_text() throws InterruptedException {
		Assert.assertEquals(Locator_1.Register(), "Register");
//		Assert.assertEquals(Locator_1.Register(), "Register");
//		Locator_1.Register();
//		Thread.sleep(5000);
	}

	@BeforeClass
	public void Browser_initilization() {
		initlization();
		System.out.println("Delivery Address Page Test excecuting..");
	}
	@AfterMethod
	public void screenshots_failedtcs() {
		try {
			ScreenShots.screenshots_failedtcs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	
	}
//	@AfterClass
//	public void BrowserClose() {
//		TearDown();
//	}
	
}
