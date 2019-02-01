package resources;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject{

	public void openApp() {
		openUrl("https://www.google.co.in");
	}
}
