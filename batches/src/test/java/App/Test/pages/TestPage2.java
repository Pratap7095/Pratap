package App.Test.pages;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import App.Pages.Locator_2;
import App.Pages.Locator_3;
import baseClass.BaseClass;

public class TestPage2 extends BaseClass{
	
	public TestPage2() throws IOException {
		super();
		}
	@Test(priority = 0)
	public void Validate_FieldElement_text() throws InterruptedException {
		Locator_2.TextData();
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void Validate_FieldElement_texts() throws InterruptedException {
		Locator_2.drop_down();
		Thread.sleep(5000);
	}
	@BeforeClass
	public void Browser_initilization() {
		initlization();
		System.out.println("Delivery Address Page Test excecuting..");
	}
//	@AfterClass
//	public void BrowserClose() {
//		TearDown();
//	}
}
