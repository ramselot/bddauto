package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;



import io.appium.java_client.android.AndroidDriver;

public class Base {
	
	public static final Logger log=Logger.getLogger(Base.class.getName());
	public AndroidDriver dr;
	public String path="log4j.properties";
	public FileInputStream fis;
	public Properties prop;
	public static WebDriver driver;
	
	
	public void init() throws IOException {
	     log.info(Base.class.getName().toString()+"is getting executed");  
		fis = new FileInputStream(System.getProperty("user.dir")+"//or.properties");
		prop = new Properties();
		prop.load(fis);
		PropertyConfigurator.configure(path);

		File dir = new File(System.getProperty("user.dir"));
		File app = new File(dir, "\\apps\\willu-debug.apk");
		System.out.println(app);
		DesiredCapabilities cap = DesiredCapabilities.android();
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ASUS_T00J");
		cap.setCapability("app", app.getAbsolutePath());
		
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		

	}
	
	
	public void getScreenShot(String name) {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String reportDirectory = new File(System.getProperty("user.dir"))
					.getAbsolutePath() + "\\src\\main\\java\\screenshotcap\\";
			File destFile = new File((String) reportDirectory + name + "_"
					+ formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);
			// This will help us to link the screen shot in testNG report
			Reporter.log("<a href='" + destFile.getAbsolutePath()
					+ "'> <img src='" + destFile.getAbsolutePath()
					+ "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
