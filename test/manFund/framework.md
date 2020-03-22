Module

QE


_______________UI MODULE

		src/main/java
			package
				functionality wise page objects
				BasepageObject
				
		src/main/java 
			package
			  functionality wise tests classes
			  BaseTest

		class BasePageObject{

		protect final WebDriver driver
			
			public BasePageObject(WebDriver browser, By pageLocator) {
				this.browser = browser;
				this.pageLocator = pageLocator;
			}
			
			isElementPresent(WebElement element){
			}

		}


		Class ABC extends BasePageObject{
			@FindBy
			WebElement username;
			
			BasePageObject(){
				PageFactory.initElement(driver,this)
			}
			
			public void enterPassword(){
				isElementPresent(username)
		}






______________________COMMON MODULE

		ActionUtils
		ElementUtils
		BrowserUils
		SelectUtils
		SleepUtils
		ScrollUtils

		DriverUtils



_________________ALM Module



_______________________EDGE Test Module
	__TPM
	__ZCS
	
	
________________rest client

				Functionality
					Request
					Response
					JSONfiles
				Functionality
					Helpers
					
_______________rest tests
	
