package commonutils;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class utils extends BaseClass{
	public utils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String TextValidation(WebElement element) {
		String text = element.getText();
		return text;
		}
		public static Boolean DoesElementExist(WebDriver driver, By locator) {
		// attempt to locate element
		   try
		   {
		       // return true if found
		  driver.findElement(locator);
		       return true ;
		   }
		   catch (NoSuchElementException e) { 
		// TODO: handle exception
		}
		   {
		       // if we catch exception, element does not exist, return false
		       return false;
		   }
		}
}
