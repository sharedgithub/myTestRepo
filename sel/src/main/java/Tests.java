package src.main.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends TestBase{
	
	TestPage tp =new TestPage();
	
	@BeforeMethod
	public void setup() {
		init();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void runTest1() {
		tp.openApp("https://www.google.com", "","");
		tp.enterText("hello");
	}
	
	
	
}
