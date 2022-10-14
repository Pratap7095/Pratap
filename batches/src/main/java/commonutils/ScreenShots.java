package commonutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import baseClass.BaseClass;

public class ScreenShots extends BaseClass {
	public ScreenShots() throws IOException {
		super(); 
		// TODO Auto-generated constructor stub
	}
	
	public static void screenshots_failedtcs() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\Ratnam\\Desktop\\sdsd"));
		System.out.println("the Screenshot is taken");
		driver.quit();
		}
	

}
