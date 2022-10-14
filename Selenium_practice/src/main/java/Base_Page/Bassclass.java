package Base_Page;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bassclass {
	public static WebDriver driver;
	public static Properties prop; 

	public Bassclass() {
		try {
			prop = new Properties();
			FileInputStream mp = new FileInputStream("./config//configs.properties");
			prop.load(mp);
			mp.close();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void inselizaation()	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println("chrome is opened");
		}else {
			System.out.println("chrome is not open");
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	public void windowclose() {
		driver.close();
	}
}