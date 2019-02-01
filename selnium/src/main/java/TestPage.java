package src.main.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends TestBase{

	
	@FindBy(name="")
	WebElement googleBox;
	
	//initialization of page objects
	public TestPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterText(String text) {
		googleBox.sendKeys(text);
	}
	
	public void openApp(String url,String userName, String Pwd) {
		driver.get(url);
	}
	
	
	public TestPage clickOnButton() {
		return new TestPage();
	}
	
}
