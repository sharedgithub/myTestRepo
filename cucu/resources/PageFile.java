package resources;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageFile extends BasePage {

	@FindBy(xpath="")
	WebElementFacade googleSearchBox;
	
	public void searchText(String text) {
		googleSearchBox.type(text);
	}
	

}
