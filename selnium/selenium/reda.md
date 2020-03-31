Selenium is a suite of tools for automated web testing.  It is composed of:

*Selenium IDE (Integrated Development Environment). It is a tool for recording and playing back. It is a Firefox plugin.

*WebDriver It provides the APIs for a variety of languages like Java, .NET, PHP, etc. They work with most of the browsers.

*Selenium RC:A Selenium server which exposes APIs for scripting tests in different languages and also runs them in browsers.

*Grid: you can distribute tests on multiple machines so that test can be run parallel which helps cutting down the time required for running test suites in the browser.

## Selenium 3 feature

* selenium core is obsolete
* Selenium RC API are moved to legacy code
* java 8 is required
* stability and bug fixes

## Selenium 4 feature

* Microsoft edge support
* Releative locators
* Tab management 

### PROS

*Open source: Since it is an OSS, so we don’t have to bear any licensing cost for using it.

*Cross-browser: It works on all standard browsers such as Chrome, FF, IE, and Safari. We can run same the test script in all browsers.

*Multi-language: We can choose a familiar programming language from Java, Python, C#, Ruby to use with Selenium.

*Cross-platform: It provides test compatibility across Window, Linux, and Mac OSX. We can run same the test script on all platforms.

*Concurrency: With Selenium Grid, we can execute thousands of test in parallel.

### CONS:

*Doesn’t support automation of Windows applications

*Can’t perform mobile automation on its own

*Lacks a good built-in reporting

*Not 100% perfect for handling dynamic web elements

*Poses challenges while processing popups or frames

*Not that efficient in coping with the page load

*Can’t automate a captcha

__________________________________________________________________

SSL(secure socket layer) is used to keep sensitive information which is sent across the Internet encrypted so that only the intended recipient understand it. This is important because, the information that we send on the internet is passed from one system to other system to the destination server.

If it is not encrypted with an SSL certificate, any computer in between you and the destination server can see your private information such as credit card numbers, usernames, passwords and other sensitive information.

When ever you try to visit a website whose web address starts with https, your communication with this site is encrypted to ensure your privacy. Before starting the encrypted communication the website, you will be presented with a "certificate" to identify itself.

The certificate helps to determine whether the site you are visiting is actually the site that it claims to be. If there is any problem with the certificate, you will see an alert saying 'This Connection Is Untrusted'.


for untrusted connection error:


                FirefoxProfile profile = new FirefoxProfile();

		profile.setAcceptUntrustedCertificates(true); 

		profile.setAssumeUntrustedCertificateIssuer(false);
		
in chrome it can be done using chrome options or desired capabilities


### Types of webdriver api

* AndroidDriver,
* ChromeDriver,
* EventFiringWebDriver,
* FirefoxDriver,
* HtmlUnitDriver,
* InternetExplorerDriver,
* iPhoneDriver,
* iPhoneSimulatorDriver,
* RemoteWebDriver


There are two types of wait in selenium
1) Implicit wait
2) Explicit wait

Implicit wait: 

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

Explicit Wait

A) Thread.sleep();
B) Expected Conditons
     
WebDriverWait ww=new WebDriverWait(driver,16);
WebElement e=wait.until(ExpectedConditions.presenceOfElementLocated(driver.findElement(By.id("")));
or elementToBeClickable or  elementToBeSelected visibilityOfElementLocated

Some of the commonly used expected conditions of an element that can be used with expicit waits are-

elementToBeClickable(WebElement element or By locator)
stalenessOf(WebElement element)
visibilityOf(WebElement element)
visibilityOfElementLocated(By locator)
invisibilityOfElementLocated(By locator)
attributeContains(WebElement element, String attribute, String value)
alertIsPresent()
titleContains(String title)
titleIs(String title)
textToBePresentInElementLocated(By, String)

Element = wait.until(ExpectedConditions.alertIsPresent());

driver.manage().timeouts().pageLoadTimeout(500, SECONDS); // time to wait before throwing any error for pageload

Wait wait = new FluentWait(driver)
 
    .withTimeout(20, SECONDS)
 
    .pollingEvery(5, SECONDS)
 
    .ignoring(NoSuchElementException.class);
 
  WebElement textBox = wait.until(new Function<webdriver,webElement>() {
 
    public WebElement apply(WebDriver driver) {
 
    return driver.findElement(By.id("textBoxId"));
 
    }
}
);


assert and verify if the given condition is true or false but assert will halt the execution as well

XPath is used to locate a web element based on its XML path. XML stands for Extensible Markup Language and is used to store, organize and transport arbitrary data.

JavaScriptExecutor is an interface which provides a mechanism to execute Javascript through the Selenium WebDriver. It provides “executescript” and “executeAsyncScript” methods, to run JavaScript in the context of the currently selected frame or window


The framework is a constructive blend of various guidelines, coding standards, concepts, processes, practices, project hierarchies, modularity, reporting mechanism, test data injections etc. to pillar automation testing.

Types of framework...keyword hybrid behaviour data driven

Here is an illustration for you to explain the challenges faced with Selenium.

* Wrong implementation: I used the page object model but had it implemented incorrectly. My classes were focussing on the web elements rather than they should have resembled the user actions.
* Duplicate code: The project had many category pages. Each category had a different search function instead of handling them at a central place.
* Less Abstraction: The framework missed on abstracting several steps into one. For example – Searching for an item took three actions such as clicking the box, typing the word, and clicking the search.
* Ineffective use of wait: I used implicit wait with a fixed timeout. But some pages were timing out due to higher load time. I’d to adopt the Fluent wait (with a variable timeout) to overcome this problem.
* Improper error handling: It was getting hard to debug the cause of a failed test. At some places, the {try-catch} blocks were missing and hence cases were skipping w/o giving a proper message. Therefore, I’d to refactor the code by adding asserts and exception handling.
* Inconsistent XPath: The 90% of the objects were using XPath. And they were inconsistent as the developers kept them changed while fixing new defects. The unfortunate practice was prevailing at both ends, the Dev/QA. I’d to call a discussion with them. And finally, we came to an agreement that either to have a fixed XPath or an ID for the web elements.

### Same origin policy

The “Same Origin Policy” is introduced for security reason, and it ensures that content of your site will never be accessible by a script from another site.  As per the policy, any code loaded within the browser can only operate within that website’s domain.

To avoid “Same Origin Policy” proxy injection method is used, in proxy injection mode the Selenium Server acts as a client configured HTTP proxy , which sits between the browser and application under test and then masks the AUT under a fictional URL

### capabilities

The desired capability is a series of key/value pairs that stores the browser properties like browser name, browser version, the path of the browser driver in the system, etc. to determine the behavior of the browser at run time.

For Selenium,

It can be used to configure the driver instance of Selenium WebDriver.
When you want to run the test cases on a different browser with different operating systems and versions.

driver.close – To close the browser window on which the focus is set.
driver.quit – To call the driver.dispose method that closes all the browser windows and ends the WebDriver session gracefully.


Yes. Although Selenium IDE is a Firefox add on, however,the  tests created in it can also be run in other browsers by using Selenium RC (Selenium Remote Control) and specifying the name of the test suite in command line.

For example:

with command line

c:\Program Files\Mozilla Firefox\firefox.exe” -chrome “chrome://selenium-ide/content/selenium/TestRunner.html?baseURL=http://localhost&test=file:///c:\tests\testsuite.html&auto=false”

With Java program

C:\Program Files (x86)\Java\jre6\bin\java.exe” -jar c:\seltest\selenium-server-standalone-2.18.0.jar -htmlSuite “*firefox” “http://127.0.0.1” “c:\seltest\mytestsuite.html” “c:\seltest\logs\results-firefox.html” -port 5555


* TimeoutException: This exception is thrown when a command performing an operation does not complete in the stipulated time
* NoSuchElementException: This exception is thrown when an element with given attributes is not found on the web page
* ElementNotVisibleException: This exception is thrown when the element is present in DOM (Document Object Model), but not visible on the web page
* StaleElementException: This exception is thrown when the element is either deleted or no longer attached to the DOM

NoSuchElementException - When no element could be located from the locator provided.
ElementNotVisibleException - When element is present in the dom but is not visible.
NoAlertPresentException - When we try to switch to an alert but the targetted alert is not present.
NoSuchFrameException - When we try to switch to a frame but the targetted frame is not present.
NoSuchWindowException - When we try to switch to a window but the targetted window is not present.
UnexpectedAlertPresentException - When an unexpected alert blocks normal interaction of the driver.
TimeoutException - When a command execution gets timeout.
InvalidElementStateException - When the state of an element is not appropriate for the desired action.
NoSuchAttributeException - When we are trying to fetch an attribute's value but the attribute is not correct
WebDriverException - When there is some issue with driver instance preventing it from getting launched.


Selenium wbdriver= new WebDriverBackedSelenium(WebDriver object name, "URL path of website")

The main use of WebDriverBackedSelenium is when we want to write code using both WebDriver and Selenium RC , we must use above created object to use selenium commands.

http://username:password@url  => this line to login anysite if it is showing username and password

[Errors](https://www.seleniumeasy.com/sites/default/files/pictures/selenium/Httpstatuscodes.png)

getWindowHandles()- is used to get the address of all the open browser and its return type is Iterator<String>.

getWindowHandle()- is used to get the address of the current browser where the conrol is and return type is String.





org.openqa.selenium
// WebDriver driver=new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// driver.get("www.google.com");

		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/workspace/Sample Projects/libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// driver.navigate().to(Url);
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();
		// driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys(
				"aksr30587@gmail.com" + Keys.TAB);
		driver.findElement(By.id("pass")).sendKeys();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_d\"]")).click();
		driver.findElement(By.name("websubmit")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("locator")));



//		File scrnsht = ((TakesScreenshot) driver)
//				.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrnsht, new File("e:\\google_page.png"));

you can also use FileHandler.copyFile(scrnsht, new File("e:\\google_page.png"));


		// Select a value from a dropdown buttton
		// WebElement monthElement=driver.findElement(By.name("birthday_month"));
		// Select dropdown=new Select(monthElement);
		// dropdown.selectByVisibleText("Jun");
			
      dropdown.selectByValue("");   this will select by actual value in dom...but selectByVisibleText will select by actual value in the drop down

      dropdown.selectByIndex();

deselectAll();deselectByVisibleText();deselectByIndex();deSelectByValue()

		// System.out.println(monthElement.getText());

		
		//To get all the options present in the dropdown
		List<WebElement> allOptions = se.getOptions();
		for (WebElement webElement : allOptions)
		{
		System.out.println(webElement.getText());
		}
		se.getAllSelectedOptions();
		se.getFirstSelectedOption();
		se.isMultiple() ///returns true if select tag allows multiple selections

		// performing mouseover and dragdrop operations
		// WebElement loginButton=driver.findElement(By.id("loginbutton"));
		// Actions action=new Actions(driver);
		// action.moveToElement(loginButton).perform();
		// action.click(loginButton);

		// WebElement element = driver.findElement(By.name("source"));
		// WebElement target = driver.findElement(By.name("target"));
		// (new Actions(driver)).dragAndDrop(element, target).perform();

		// Keyboard Keyboard=((HasInputDevices)driver).getKeyboard();
		// Keyboard.pressKey(Keys.F5);
		// Keyboard.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"o"));

                String press = Keys.chord(Keys.SHIFT,Keys.ENTER);
 
                 webelement.sendKeys(press);

Actions builder = new Actions(driver);
Action seriesOfActions = builder
 .moveToElement(txtUerName)
 .click()
 .keyDown(txtUserName, Keys.SHIFT)
 .sendKeys(txtUserName, “hello”)
 .keyUp(txtUserName, Keys.SHIFT)
 .doubleClick(txtUserName);
 .contextClick();
 .build();
seriesOfActions.perform();



		// javascript alert

		// Alert alert = driver.switchTo().alert();
		// String message = alert.getText();
		// alert.accept();
		// alert.dismiss();

		// List allLinks= driver.findElements(By.xpath("//a"));
		// //display the count of links in the page
		// System.out.println(allLinks.size());
		// //display the text for each link on the page
		// for(int i=0;i
		// {
		// //display href for each link
		// System.out.println(allLinks.get(i).getAttribute("href"));
		// //display text for each link
		// System.out.println(allLinks.get(i).getText());
		// //perform click action
		// allLinks.get(i).click();
		//
		// }

		// WebElement parentMenu =
		// driver.findElement(By.linkText("Tourist Trains"));or By.partialLinkText("tour")
		//
		// Actions act = new Actions(driver); //Create Action object for Driver
		//
		// act.contextClick(parentMenu).build().perform(); //Context Click
		//
		// act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		// Thread.sleep(1000);
		// act.sendKeys(Keys.ARROW_DOWN).build().perform();
		// Thread.sleep(1000);
		// act.sendKeys(Keys.ENTER).build().perform();
		//

		// Set windowHandles = driver.getWindowHandles();
		// Iterator it = windowHandles.iterator();
		//
		// String parentBrowser= it.next();
		// String childBrowser = it.next();
		// driver.switchTo().window(childBrowser);
		// Thread.sleep(3000);
		//
		// driver.close(); //close the current window(Child Browser)
		// driver.switchTo().window(parentBrowser); //Switch to Parent Browser

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		// List frms= driver.findElements(By.tagName("iframe"));
		// System.out.println(frms.size());
		// driver.switchTo().frame(0);
		// driver.findElement(By.id("clicktripad")).click();

		//
		// driver.close();
		// driver.quit();

WebElement el = driver.findElement(By.id(“Radio button id”));

//to perform check operation

el.click()

//verfiy to radio button is check it return true if selected else false

el.isSelected()

List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));

 int numOfFrames = frameList.size();

driver.findElement(By.xpath(“xpath of textbox ”)).getSize().getWidth();
driver.findElement(By.xpath(“xpath of textbox ”)).getSize().getHeight();

WebDriver driver = new FireFoxDriver();
	
	if (driver instanceof JavascriptExecutor) {
		((JavascriptExecutor)driver).executeScript("{JavaScript Code}");
	}

 	JavascriptExecutor jsx = (JavascriptExecutor)driver;
 
 	jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down
  	jsx.executeScript("window.scrollBy(450,0)", ""); //scroll up
 	js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); scroll to the end
 	js.executeScript("arguments[0].scrollIntoView();", Element); bring element to visible area
	js.executeScript("arguments[0].scrollIntoView();", Element);
 	js.executeScript("return document.readyState").equals("complete");
 
 	((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", checkbox); see if webelement checkbox is checked
 	Thread.sleep(3000);
 


// Get the current window handle.
String hBefore = driver.getWindowHandle();

// Click to open new windows.

// Switch to new windows.
for(String hNew: driver.getWindowHandles()){
    driver.switchTo().window(hNew);
}

// Close all new windows.
driver.close();

// Switch back to first window.
driver.switchTo().window(hBefore);

// Resume your work.

File ieDriver = new File("path/to/iexploredriver.exe");
System.setProperty("webdriver.ie.driver", ieDriver.getAbsolutePath());

driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); opening a new tab

ArrayList<String> tablist = new ArrayList<String> (driver.getWindowHandles());

driver.switchTo().window(tablist.get(0));


String color = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("color");

 String backcolor = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("background-color");

 System.out.println(color);

 System.out.println(backcolor);

if both color and backcolor different then element is highlighted


List<webElement> chkBox = driver.findElements(By.xpath(“//htmltag[@attbute='checkbox']”));
 
for(int i=0; i<=chkBox.size(); i++){
 
chkBox.get(i).click();
 
}


((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

driver.switchTo().window(currentWindowHandle);
				driver.close();

to upload file 
WebElement element= driver.findElement(By.name("datafile"));
element.sendKeys("C:\Users\Easy\Desktop\testfile.txt");



System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420,600);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);

File upload action can be performed in multiple ways-

Using element.sendKeys("path of file") on the webElement of input tag and type file i.e. the elements should be like - 
<input type="file" name="fileUpload">
Using Robot API.
Using AutoIT API.

for multiple checkbox

		List<WebElement> allOptions = element.findElements(By.tagName("input"));
		for (WebElement option : allOptions) {
			   System.out.println("Option value "+option.getText());
			        if (valueToSelect.equals(option.getText())) {
			            option.click();
			            break;
			        }
			    }
	}


https://www.seleniumeasy.com/selenium-tutorials/webdriver-select-methods-to-work-with-dropdowns






Following are the web drivers supported in Selenium 3.0.

| WebDriver Name | WebDriver API | Supported Browser |

Gecko Driver (a.k.a. Marinetto) | FirefoxDriver() | Firefox
Microsoft WebDriver (a.k.a. Edge) | InternetExplorerDriver() | IE
Google Chrome Driver | ChromeDriver() | Chrome
HTML Unit Driver | WebClient() | {Chrome, FF, IE}
OperaChromium Driver | ChromeDriver() | Opera
Safari Driver | SafariDriver() | Safari
Android Driver, AndroidDriver() | Android browser
ios Driver | IOSDriver() | ios browser
EventFiringWebDriver | EventFiringWebDriver() | ALL

taking screenshots on error


EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver).register(new AbstractWebDriverEventListener() {

  @Override
  public void onException(Throwable throwable, WebDriver browser) {

    // Take the screenshot using the Webdriver.
    File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    // Now you can copy the screenshot somewhere on your system.
    FileUtils.copyFile(screen, new File("c:\\Selenium Testing Questions\\screen.png"));
  }
});


java –jar <selenium-server-standalone-x.xx.x.jar> –role node –hub http://<node IP>:4444/grid/register


java -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig "c:/software/config/selenium_node.json"

{
  "capabilities": [
  {
    "browserName": "chrome",
    "maxInstances": 10,
    "seleniumProtocol": "WebDriver"
  }
],
  "configuration":
  {
    "proxy": "org.openqa.grid.selenium.proxy.DefaultRemoteProxy",
    "maxSession": 10,
    "port": 5555,
    "host": "3.232.124.25",
    "register": true,
    "registerCycle": 5000,
    "hubPort": 4444,
    "hubHost": "3.57.32.5"
  }
}


Page Object is a class in POM corresponding to a web page. It captures the functionality as functions and objects as members.

public class LogInPage
{
    private WebElement user;
    private WebElement pass;

    public LogInPage() {
    }

    public void findObjects() {
        user = browser.findElement(By.id("userName"));
        pass = browser.findElement(By.id("password"));
    }

    public void processLogIn() {
        user.sendKeys("john");
        pass.sendKeys("password");
    }
}

Page Factory is a method to set up the web elements within the page object.

public class LogInPage
{
    @FindBy(id="userName")
    private WebElement user;

    @FindBy(id="password")
    private WebElement pass;

    public LogInPage() {
        PageFactory.initElements(browser, this); // Setup the members as browser.findElement()
    }

    public void processLogIn() {
        user.sendKeys("john");
        pass.sendKeys("password");
    }
}

Page factory is an implementation of Page Object Model in selenium. It provides @FindBy annotation to find web elements and PageFactory.initElements(driver, this); method to initialize all web elements defined with @FindBy annotation.

The fundamental difference between XPath and css selector is using XPaths we can traverse up in the document i.e. we can move to parent elements. Whereas using CSS selector we can only move downwards in the document.

continue
https://www.techbeamers.com/latest-selenium-interview-questions-and-answers/


driver.getCurrentUrl();
