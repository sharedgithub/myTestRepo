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
<parameter name="my-string-param" value="my string value" />
   <test name="sampleTest">   
      <parameter name="sampleParamName" value="sampleParamValue"/>
      <classes>
         <class name="TestFile">
         <methods>
			 <include name="paramTest" />
		 </methods>
		 </class>
      </classes>      
   </test>
</suite>


Sample test script-

public class TestFile {
   @Test
   @Parameters("sampleParamName")
   public void parameterTest(String paramValue) {// see how  parameter is read
      System.out.println("Value of sampleParamName is - " + sampleParamName);
   }
   
   {
 @Parameters({ "opt-value" })
 @Test
 public void optionTest(@Optional(opt-value") String strValue) {//see how optional parameter is read
 System.out.println("The value is: " + strValue);
 }
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
   
   @DataProvider(parallel=true, name="fooDP", indices= {1,3,5,7,9} we can make method like this
   indicies are the rows which you want to execute

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

@Test(groups="story1")
public class TestClass{
    private String str;
 
    //Constructor
    public TestClass(String str) {
        this.str = str;
    }
 
 
    @Test(groups={"story1","story2"})
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

or

@Factory(dataprovider="dp")
public object[] factoryMethod(String s){

Object[] t=new Object[2];
t[0]=new TestClass(s)
return t

}

@Dataprovider
public Object[] dp(){
	new Object[]{"a","b"};
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

Tests – Execute all tests in parallel that fall under the “test” tag.
Classes – Execute all tests in parallel corresponding to the “classes” mentioned in the “classes” tag
methods – Execute all tests in parallel specified with the @Test annotation.
Instances – Execute those tests in parallel which has the same InstanceId else will run them in a different thread.

Check Running Selenium Tests in parallel for details.

Run A Set Of TestNG Groups Using Maven
 mvn test -Dgroups=story1,story2,story3
 
 Run A Single TestNG Test Using Maven?
 mvn -Dtest=<Test Class>#<Test Method> test
 
 
 We can follow any of the two methods to run a specific group in TestNG.

Run via TestNG XML file.
Execute from Eclipse IDE.
 <?xml version="1.0" encoding="UTF-8"?>
<suite name="Suite">
    <test name="story1">
        <groups>
            <run>
                <include name="story1" />
                <exclude name="story2" />
            </run>
        </groups>
        <classes>
            <class name="com.techbeamers.test.TestEpic" />
        </classes>
    </test>
</suite>



Real TestNG Interview Questions To Make You Stand Out In 2018

 
Interview Questions Selenium Interview Meenakshi Agarwal 

 
In this post, we bring you some of the real TestNG interview questions. Our goal is not only helping you master the subject but to see you doing well during the interviews. That’s why our experts have written answers with an absolute simplicity to make the learning more effective.

TestNG is mainly a unit testing framework for Java developers. However, it is quite easy to integrate TestNG with Selenium so that the testers can also use it for functional and Regression Testing.

If you already are using TestNG in your projects, then please proceed directly to the TestNG interview questions. For those who are just beginning to learn TestNG, we highly recommend them to follow the below two tutorials.

TestNG Tutorial for Beginners
Selenium Webdriver Tutorial
Real TestNG Interview Questions
Real TestNG Interview Questions & Answers

Q-1: Tell Me Briefly What Is TestNG And Why Should You Use It?
TestNG is an innovative test framework built on top of the JUnit framework. Its primary consumers are Java developers who use it for the unit testing purpose.

It comes with many useful features like TestNG annotations and TestNG assertions that give a lot of flexibility to testers. Also, there are a couple of solid reasons to use TestNG for automation testing.

The reporting in the TestNG framework is one of its cornerstone features. It can generate reports both in HTML and XML format. The report provides many indicators for predicting the health of the project. It includes the count of passed/failed cases, the age of a defect and a lot more.
Since Selenium doesn’t have a built-in report generator, the TestNG report is an ideal candidate to be used for Selenium report generation.
TestNG provides an excellent exception-handling mechanism to ensure seamless execution of your test automation project.
Q-2: What Are The Core Features Of TestNG Framework?
Some of the notable features of TestNG are as follows.

Concurrency – TestNG can run multiple tests in parallel. It creates a thread for each test and executes them in a thread-safe manner.
Dependency – In TestNG, we can add a test method which depends on a single or a group of test methods. This feature ensures the execution of the dependency methods before the actual test.
Prioritization – We can specify the order of tests using the “priority” parameter inside the @Test annotation.
Grouping – It is a unique feature of TestNG which didn’t exist in the JUnit framework. We can use it for smart/efficient distribution of tests. It lets us create groups with own test methods and groups having other groups. Please note that we can only specify groups in the “TestNG.XML” file. Also, the include/exclude tags can help us customize the test execution in groups.
Parameterization – TestNG has a parameter annotation that allows values to pass as arguments to test methods.
Data Sourcing – TestNG introduces data provider annotation to take input from external sources like excel.
Q-3: What Are The Standard Annotations Available In TestNG?
TestNG annotations control the way the test method below them will get executed. They begin with the “@” symbol.

//TestNG annotation syntax

@<annotation-name>(<attribute-name>=<value>)
public void SampleTest() {
...
}
TestNG supports fifteen different annotations.

Test
BeforeMethod
AfterMethod
BeforeClass
AfterClass
BeforeTest
AfterTest
BeforeSuite
AfterSuite
BeforeGroups
AfterGroups
DataProvider
Factory
Listeners
Parameters
Q-4: What Are The Standard Assertions Available In TestNG?
Assertions not only let us add validation into the tests but also help decide their state (Passed/Failed).

assertEquals – Passes if the arguments match else fails.
assertNotEquals – If the actual and expected values match, then the assertion fails.
assertTrue – Passes if the input condition is true else throws AssertionError.
assertFalse – Passes if the input condition is false else throws AssertionError.
assertNull – Performs the null test on an object. In case of a null, the test aborts with an exception.
assertNotNull – It does the opposite of the “asserNull.” The test method breaks with an exception upon discovering a non-null object.
Q-5: What Are TestNG Hard And Soft Assertions And How Do They Differ?
Hard assertions break a test immediately with an AssertException after the assert method reports failure. If one of the many test cases fails, then the execution continues with the remaining tests.

However, in some cases, we want the test to complete all steps even if one of them fails. TestNG offers to use a soft assertion in such scenarios.

A soft assertion doesn’t throw an exception on failure instead it collects all the errors until it finishes. And that’s how we could manage to run all the steps of a test.

You can read more about these and see examples from the below tutorial.

Hard Assertions in TestNG
Soft Assertions in TestNG
Q-6: What Is The Purpose Of The “TestNG.XML” File?
The “TestNG.XML” is a configuration file which contains the TestNG project settings. It also represents a TestNG suite which can include one or more tests.

We can do several customizations with this file. The list is as follows.

Setup multiple tests to run with a single click.
Include/Exclude test cases.
Select a specific group or groups.
Supply parameters for tests.
Introduce group-level dependencies.
Setup test parallelization.
Configure listeners for tests.
Q-7: Can You Run A TestNG Test Without The “TestNG.XML” File? If Yes, Then How?
Yes, we can run the test straight from the command-line using ant or maven. We may need to pass the required class, method or group name in the command.

However, we can only use a limited set of TestNG features without the “TestNG.XML” file.

Q-8: How To Pass A String Value To A Test Using The “TestNG.XML” File?
We can supply a string value using the parameter tag to the desired test case inside the “TestNG.XML.”

<suite name="TestNG Param Suite" verbose="1">
 <parameter name="my-string-param" value="my string value" />
 <test name="Param Test">
 <classes>
 <class name="com.techbeamers.test.ParamTest">
 <methods>
 <include name="paramTest" />
 </methods>
 </class>
 </classes>
 </test>
</suite>
Next, we’ll need to access the string value using the parameter annotation just above the test inside the Java code.


 
package com.techbeamers.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	/**
	 * * Following method takes one param as input argument. * Its value is set
	 * at the suite level.
	 */
	@Parameters({ "my-string-param" })
	@Test
	public void paramTest(String strValue) {
		System.out.println("The input parameter is: " + strValue);
	}
}
Q-9: How To Pass An Optional Parameter To A Test Using The “TestNG.XML” File?
We can supply an optional parameter with the help of “@Optional” annotation.

Below is the sample “TestNG.XML” file.

<suite name="Optional Param Suite" verbose="1">
 <test name="Optional Param">
 <parameter name="opt-value" value="optional text" />
 <classes>
 <class name="com.techbeamers.test.OptionalParam" />
 </classes>
 </test>
</suite>
Here is the Java code to access the optional parameter.

package com.techbeamers.test;
 
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class OptionalParam
{
 @Parameters({ "opt-value" })
 @Test
 public void optionTest(@Optional(opt-value") String strValue) {
 System.out.println("The value is: " + strValue);
 }
}
Q-10: How To Run Multiple TestNG Tests In Parallel?
TestNG supports concurrent executions of tests. We can utilize this feature to run the tests in different browsers simultaneously.

In the TestNG XML, there is a “suite” tag which has a “parallel” attribute. This tag can parallelize the test execution at different levels.

We can set the “parallel” attribute with any of the following values.

Tests – Execute all tests in parallel that fall under the “test” tag.
Classes – Execute all tests in parallel corresponding to the “classes” mentioned in the “classes” tag
methods – Execute all tests in parallel specified with the @Test annotation.
Instances – Execute those tests in parallel which has the same InstanceId else will run them in a different thread.
Q-11: How To Block A Test Method From Execution In TestNG?
We can set the “enabled” attribute to “false” for a test method to block. Its default value is “true.”

Turning this flag to “false” will block the test from execution.

package com.techbeamers.test;
import org.testng.annotations.Test;

public class SimpleTest {

@Test(enabled = false)
 public void testOne() {
 System.out.println("Test one.");
 }

@Test(enabled = true)
 public void testTwo(String strValue) {
 System.out.println("Test two.");
 }
}
Q-12: How To Block A TestNG Test Depending On A Condition?
We can utilize TestNG’s annotation transformer to initialize the disabled property of a @Test annotation with a “true” or “false” value.

public class TestNGTest implements IAnnotationTransformer {
 public void transform(ITest annotation, Class myClass,
 Constructor myConstructor, Method myMethod){

if (is_test_disabled(myMethod.getName()))) {
 annotation.setEnabled(false);
 }
 }

public boolean is_test_disabled(String strName){
 // Check if the test is disabled or not.
 }
}

Q-13: How To Make A Test Dependent On Another In TestNG?
We can enforce TestNG’s dependency feature in such a case. It provides the “dependsOnMethods” attribute to declare dependencies of a test method. Please follow the below example.

package com.techbeamers.test;
import org.testng.annotations.Test;

public class TestNGDependency {
	@Test
	public void stepOne() {
		System.out.println("Executing stepOne");
	}

	@Test(dependsOnMethods = { "stepOne" })
	public void stepTwo() {
		System.out.println("Executing stepOne->stepTwo");
	}

	@Test(dependsOnMethods = { "stepOne", "stepTwo" })
	public void stepThree() {
		System.out.println("Executing stepOne->stepTwo->stepThree");
	}
}
Q-14: How To Control The Order Of Test Execution In TestNG?
We can set the “preserve-order” attribute to “true” in the “TestNG.XML.”

<test name="MyTestOrder" preserve-order="true">
    <classes>
        <class name="TestNGOrder">
            <methods>
                <include name="stepOne" />
                <include name="stepTwo" />
            </methods>
        </class>
    </classes>
</test>
Alternatively, we can specify a pre-defined sequence value in the “priority” attribute for each test.

package com.techbeamers.test;
import org.testng.annotations.Test;

public class TestNGOrder {
	@Test(priority = 1)
	public void stepOne() {
		System.out.println("Executing stepOne");
	}

	@Test(priority = 2)
	public void stepTwo() {
		System.out.println("Executing stepOne->stepTwo");
	}

	@Test(priority = 3)
	public void stepThree() {
		System.out.println("Executing stepOne->stepTwo->stepThree");
	}
}
Q-15: What If The Priority Of A Test Case In TestNG Is Zero?
By default, every test case in TestNG gets a zero priority.

Let’s assume: If there exist two cases – one with priority 1 and another with the default value, then the latter will execute first.

Please note – A test case with lower priority value will always have higher precedence.

Q-16: What Is DataProvider Annotation In TestNG And Why You Use It?
The TestNG framework introduced the data provider annotation to support data-driven testing. It allows us to use both internal and external sources of input.

If the input size is small, then we can keep the data inside the project files. However, in most cases, the need is to have a big dataset to feed into the test cases. And no tester or a developer would like to bloat his/her code with such a massive set of input.

Hence, the solution is to use the TestNG “@DataProvider” annotation. It can allow a test to accept input from external data sources like CSV, MS Excel, and many others.

Please find below a simple example of using the “@DataProvider” annotation to read input from a 2-D array.

package com.techbeamers.test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataDrivenTest {
	@Test(dataProvider="empSalary")
	public void processSalary(String empName, int empSal) {
		System.out.println("Employee: " + empName);
		System.out.println("Salary: " + empSal);
	}	

	@DataProvider
	public Object[][] empSalary() {
		return new Object[][]{{"John", 15000}, {"Andi", 18000}};
	}
}
Q-17: What Is Factory Annotation In TestNG And Why You Use It?
The “@Factory” as the name suggests is an annotation which can produce tests at runtime using the given data-sets/conditions.

This annotation solves a common problem of executing tests with different datasets without explicitly creating them.

Another advantage it brings is to allow the parameters to pass to test classes while instantiating them.

Check out the below example to understand it in depth.

package com.techbeamers.test;
import org.testng.TestNG;

public class TestClass
{
 private int arg;
 
 public TestClass(int arg) {
 this.arg = arg;
 }
 
 @Test
 public void firstTest() {
 int param = arg + 1;
 System.out.println("firstTest(): " + param);
 }
 
 @Test
 public void secondTest() {
 int param = arg + 2;
 System.out.println("secondTest(): " + param);
 }
}
 
public class TestFactory
{
 @Factory
 public Object[] factoryMethod() {
 return new Object[] { new TestClass(0), new TestClass(1) };
 }
}
Must Read – How to use TestNG Factory Method?
Q-18: How Is The @Factory Annotation Different From The @DataProvider?
The @Factory annotation leads to following actions.

It creates the instances of a test class at runtime.
All the test methods of the TestNG class executes with the given dataset.
Whereas, if we use the @DataProvider, then the following happens.

The data provider is only applicable for the test methods which comes immediately after it.
It can run a specific method the no. of times equals to the row count returned by the data provider handler.
Q-19: What Are Listeners In TestNG And Why You Use Them?
TestNG framework defines a set of classes known as listeners to monitor the different states of the tests.

The Listeners extend the following marker interface – “org.testng.ITestListener”. Using them, we can improvise the behavior of a TestNG test.

Below is the list of listeners that TestNG implements.

IExecutionListener – It keeps track of a TestNG run from the beginning to end.
IAnnotationTransformer – It can customize a TestNG annotation and make it work accordingly.
ISuiteListener – It monitors the start and finish of a test suite.
ITestListener – It keeps checking on different states of a TestNG test.
IConfigurationListener – It tracks the events triggered w.r.t. configuration methods.
IMethodInterceptor – It gives us the ability to change the list of test methods during a TestNG run.
IInvokedMethodListener – It adds handlers to invoke before calling the TestNG before and after methods.
IHookable – It allows setting up a callback method to trigger before a test method.
IReporter – It lets us produce a test report for overall execution.Real TestNG Interview Questions To Make You Stand Out In 2018
