package Variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
	public static Properties property;
	private static String configpath = "config/config.properties";
	
	public static void instializePropertyFile() {
		property = new Properties();
		try {
			InputStream input = new FileInputStream(configpath);
			try {
				property.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
