package Application_Locators;

import java.awt.Desktop.Action;

import javax.imageio.IIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Base_Page.Bassclass;

public class mouse_actions  extends Bassclass
{
	public mouse_actions() throws IIOException{
		super();
		
	}
	static By action = By.xpath("//*[@id=\"menu-item-4131\"]");
	static By actionon = By.xpath("//*[@id=\"menu-item-4157\"]/a/span");
	static By action_click = By.xpath("//*[@id=\"menu-item-4134\"]/a");
 
	public void mouse_action() {
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(driver.findElement(action))
		.moveToElement(driver.findElement(actionon))
		.moveToElement(driver.findElement(action_click))
		.click()
		.perform();
	}

	public static void Validation_action() {
		// TODO Auto-generated method stub
		
	}
}
