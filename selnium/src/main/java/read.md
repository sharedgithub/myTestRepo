Ques.85. What is testNG?

Ans. TestNG(NG for Next Generation) is a testing framework that can be integrated with selenium or any other automation tool to provide multiple capabilities like assertions, reporting, parallel test execution etc.


Ques.86. What are some advantages of testNG?

Ans. Following are the advantages of testNG-

TestNG provides different assertions that helps in checking the expected and actual results.
It provides parallel execution of test methods.
We can define dependency of one test method over other in TestNG.
We can assign priority to test methods in selenium.
It allows grouping of test methods into test groups.
It allows data driven testing using @DataProvider annotation.
It has inherent support for reporting.
It has support for parameterizing test cases using @Parameters annotation.

Ques.87. What is the use of testng.xml file?

Ans. testng.xml file is used for configuring the whole test suite. In testng.xml file we can create test suite, create test groups, mark tests for parallel execution, add listeners and pass parameters to test scripts. Later this testng.xml file can be used for triggering the test suite.


Ques.88. How can we pass parameter to test script using testNG?

Ans. Using @Parameter annotation and 'parameter' tag in testng.xml we can pass parameters to the test script.
Sample testng.xml -

<suite name="sampleTestSuite">
   <test name="sampleTest">   
      <parameter name="sampleParamName" value="sampleParamValue"/>
      <classes>
         <class name="TestFile" />
      </classes>      
   </test>
</suite>

Sample test script-

public class TestFile {
   @Test
   @Parameters("sampleParamName")
   public void parameterTest(String paramValue) {
      System.out.println("Value of sampleParamName is - " + sampleParamName);
   }

Ques.89. How can we create data driven framework using testNG?

Ans. Using @DataProvider we can create a data driven framework in which data is passed to the associated test method and multiple iteration of the test runs for the different test data values passed from the @DataProvider method. The method annotated with @DataProvider annotation return a 2D array of object.

//Data provider returning 2D array of 3*2 matrix
 @DataProvider(name = "dataProvider1")
   public Object[][] dataProviderMethod1() {
      return new Object[][] {{"kuldeep","rana"}, {"k1","r1"},{"k2","r2"}};
   }

   //This method is bound to the above data provider returning 2D array of 3*2 matrix
   //The test case will run 3 times with different set of values
   @Test(dataProvider = "dataProvider1")
   public void sampleTest(String s1, String s2) {
      System.out.println(s1 + " " + s2);
   }

Ques.90. What is the use of @Listener annotation in TestNG?

Ans. TestNG provides us different kind of listeners using which we can perform some action in case an event has triggered. Usually testNG listeners are used for configuring reports and logging. One of the most widely used lisetner in testNG is ITestListener interface. It has methods like onTestSuccess, onTestFailure, onTestSkipped etc. We need to implement this interface creating a listener class of our own. After that using the @Listener annotation, we can use specify that for a particular test class, our customized listener class should be used.

@Listeners(PackageName.CustomizedListenerClassName.class)

public class TestClass {				
    WebDriver driver= new FirefoxDriver();
    
    @Test		
    public void testMethod(){
    //test logic
    }
}	

Ques.91. What is the use of @Factory annotation in TestNG?

Ans. @Factory annotation helps in dynamic execution of test cases. Using @Factory annotation we can pass parameters to the whole test class at run time. The parameters passed can be used by one or more test methods of that class.
Example - there are two classes TestClass and the TestFactory class. Because of the @Factory annotation the test methods in class TestClass will run twice with the data "k1" and "k2"

public class TestClass{
    private String str;
 
    //Constructor
    public TestClass(String str) {
        this.str = str;
    }
 
    @Test
    public void TestMethod() {
        System.out.println(str);
    }
}
 
public class TestFactory{
    //The test methods in class TestClass will run twice with data "k1" and "k2"
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new TestClass("K1"), new TestClass("k2") };
    }
}

Ques.92. What is difference between @Factory and @DataProvider annotation?

Ans. @Factory method creates instances of test class and run all the test methods in that class with different set of data.
Whereas, @DataProvider is bound to individual test methods and run the specific methods multiple times.


Ques.93. How can we make one test method dependent on other using TestNG?

Ans. Using dependsOnMethods parameter inside @Test annotation in testNG we can make one test method run only after successful execution of dependent test method.

 @Test(dependsOnMethods = { "preTests" })

Ques.94. How can we set priority of test cases in TestNG?

Ans. Using priority parameter in @Test annotation in TestNG we can define priority of test cases. The default priority of test when not specified is integer value 0. Example-

@Test(priority=1)

Ques.95. What are commonly used TestNG annotations?

Ans. The commonly used TestNG annotations are-

@Test- @Test annotation marks a method as Test method.
@BeforeSuite- The annotated method will run only once before all tests in this suite have run.
@AfterSuite-The annotated method will run only once after all tests in this suite have run.
@BeforeClass-The annotated method will run only once before the first test method in the current class is invoked.
@AfterClass-The annotated method will run only once after all the test methods in the current class have been run.
@BeforeTest-The annotated method will run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest-The annotated method will run after all the test methods belonging to the classes inside the <test> tag have run.

Ques.96. What are some common assertions provided by testNG?

Ans. Some of the common assertions provided by testNG are-

assertEquals(String actual, String expected, String message) - (and other overloaded data type in parameters)
assertNotEquals(double data1, double data2, String message) - (and other overloaded data type in parameters)
assertFalse(boolean condition, String message)
assertTrue(boolean condition, String message)
assertNotNull(Object object)
fail(boolean condition, String message)
true(String message)

Ques.97. How can we run test cases in parallel using TestNG?

Ans. In order to run the tests in parallel just add these two key value pairs in suite-

parallel="{methods/tests/classes}"
thread-count="{number of thread you want to run simultaneously}".
<suite name="ArtOfTestingTestSuite" parallel="methods" thread-count="5">

Check Running Selenium Tests in parallel for details.