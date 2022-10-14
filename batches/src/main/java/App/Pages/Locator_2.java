package App.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;

public class Locator_2 extends BaseClass{
	

	public Locator_2() throws IOException {
		super();
		
	}

	static By Print_text = By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']");
	static By drop1 = By.id("Skills");
	public static void TextData() {
		List<WebElement> text = driver.findElements(Print_text);
		int size = text.size();
		System.out.println(size);
		for(int i = 0; i <size; i++) {
			String text1 = text.get(i).getText();
			System.out.println(text1);
		}
	}
	public static void drop_down() {
		Select drop = new Select(driver.findElement(drop1));
		drop.selectByIndex(0);
	}

}
