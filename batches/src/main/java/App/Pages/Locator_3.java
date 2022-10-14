package App.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Locator_3 extends BaseClass{

	public Locator_3() throws IOException {
		super();
	}
	static By name = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
  
	
	public static void Name_filed() {
		WebElement text =driver.findElement(name);
		text.sendKeys("Ratnam");
		return;
		
	}
}
