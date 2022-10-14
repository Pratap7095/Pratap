package Screensot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import Base_Page.Bassclass;

public class waits extends Bassclass {
	public waits() throws IOException{
		super();
	}
	public void screenshotTcs(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot pk = (TakesScreenshot)driver;
				File source = pk.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshot/screenshot " + result.getClass() + "_Of_" + result.getName() + ".png");
				FileUtils.copyFile(source, dest);
				
			} catch (Exception e) {
				System.out.println("exception wll taking screenshot" + e.getMessage());
			}
		}
			
	}
}
