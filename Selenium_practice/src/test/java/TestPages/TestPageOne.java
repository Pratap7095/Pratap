package TestPages;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import Application_Locators.mouse_actions;
import Application_Locators.sendkeys;
import Application_Locators.validations;
import Base_Page.Bassclass;

public class TestPageOne extends Bassclass {
	public TestPageOne() throws IOException{
		super();
		
	}

	@Test (priority = 0)
	public void Welcome_to_TestNg() {
		System.out.println("R-Testing Tools – Manual & Automation Testing");
	}
	@Test (priority = 1)
	public void Validation_Package_Text() throws InterruptedException {
		Assert.assertEquals(validations.packaage_text(), "Package 1 : Self Paced Video Course for Manual Testing (INR 499)");
		Thread.sleep(5000);
	}
	@Test (priority = 2)
	public void Validation_Mouse() throws InterruptedException {
		mouse_actions.Validation_action();
		Assert.assertEquals(validations.demo_text(), "Register For Demo");
		Thread.sleep(5000);
	}
	@Test (priority = 3)
	public void Validation_sendkeys() throws InterruptedException {
		sendkeys.firstname_send(prop.getProperty("Fname"));
		Thread.sleep(5000);
		sendkeys.lastname_send(prop.getProperty("Lname"));
		Thread.sleep(5000);
	}
	
	@BeforeClass
	public void open_Browser() {
		inselizaation();
	}
	@AfterClass
	public void Browser_Close() {
		TearDown();
	}
	private void TearDown() {
		// TODO Auto-generated method stub
		
	}
}


