package Application_Locators;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Page.Bassclass;

public class click_methode extends Bassclass {
	
	public click_methode() throws IOException{
		super();
	}
		static By Male = By.id("vfb-8-1");
		static By Female = By.id("vfb-8-2");
		
		public void clickon_male() {
			WebElement element = driver.findElement(Male);
			element.click();
			
	}
public void click_female() {
	WebElement element = driver.findElement(Female);
	element.click();
}
}
