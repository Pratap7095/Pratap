package Application_Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Page.Bassclass;

public class sendkeys extends Bassclass {
	public sendkeys() throws IOException{
		super();
	}
	
	static By firstname = By.name("vfb-5");
	static By lastname = By.name("vfb-7");

	public static void firstname_send(String pk) {
		WebElement element = driver.findElement(firstname);
		element.sendKeys(pk);

	}
	public static String lastname_send(String mp) {
		WebElement element = driver.findElement(lastname);
		element.sendKeys(mp);
		return null;
	}

}
