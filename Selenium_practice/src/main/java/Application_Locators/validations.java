package Application_Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Page.Bassclass;

public class validations extends Bassclass {

	public validations() throws IOException{
		super();

	}
	static By demo =By.xpath("//*[@id=\"item-vfb-1\"]/div/h3");
	static By packaage = By.xpath("//*[@id=\"content\"]/article/div/div/section[3]/div/div/div/div/div/h2");

	public static String demo_text() {
		WebElement element = driver.findElement(demo);
		String text = element.getText();
		System.out.println(text);
		return text;
	}
	public static String packaage_text() {
		WebElement element = driver.findElement(packaage);
		String text = element.getText();
		System.out.println(text);
		return null;
	}
}
