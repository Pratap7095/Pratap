package App.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import commonutils.utils;

public class Locator_1 extends BaseClass{

	public Locator_1() throws IOException {
		super();
		System.out.println("sashdgajdjahd");
	}
	
	static By Register =By.xpath("//*[@id=\"section\"]/div/h2");
	
	public static String Register() {
		WebElement element = driver.findElement(Register);
		String text = element.getText();
		System.out.println(text);
		return utils.TextValidation(element);
		
	}
	

}
