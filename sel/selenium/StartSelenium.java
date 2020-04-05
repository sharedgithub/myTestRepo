package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 	
public class StartSelenium {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/selnium/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.getCurrentUrl();
		driver.getTitle();
		
		WebElement element= driver.findElement(By.xpath("//div/ancestor::div[last()]"));
		
		
		
		
		int a=2;
	}

}
