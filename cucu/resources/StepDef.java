package resources;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class StepDef {
	@Steps
	StepFile stepFile;
	
//	@When("user search about <searchString>")
//	public void givenHain(String searchString) {
//		
//	}
	
	@When("^user search about kamehameha$")
	public void givenHain() {
	}
	
	@Given("user is on google home page")
	public void openApplicaiton() {
		stepFile.openApp();
	}
	
	@Then("user should get search results")
	public void getSearchResult() {
		
	}
}
