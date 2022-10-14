package baseClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() throws IOException {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./configs/config.properties");
			prop.load(ip);
			ip.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void initlization() {
		String BrowserName = prop.getProperty("Browser");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println("Chrome Opend...");

		} else {
			System.out.println("no browser....");
		}

		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		System.out.println("executing.............." + getClass());
	}
	@AfterClass
	public void TearDown() {
		driver.close();
	}
}
