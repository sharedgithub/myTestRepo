package src.main.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	// this class should be in src main java 
	public static WebDriver driver;
	public static Properties prop;
	
//	public TestBase() {
//		try {
//			prop.load(new FileInputStream(new File("/Practice Java/selnium/src/main/java/prop.configuration")));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	void init(){
		
		try {
			prop.load(new FileInputStream(new File(System.getProperty("USER.DIR")+ "/Practice Java/selnium/src/main/java/prop.configuration")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String browserName=prop.getProperty("browserName");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe path");
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","chromedriver.exe path");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}

}
