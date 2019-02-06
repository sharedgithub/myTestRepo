# EXceptions

Exception is an error event that can happen during the execution of a program and disrupts it’s normal flow. Exception can arise from different kind of situations such as wrong data entered by user, hardware failure, network connection failure etc.

exceptions are object of class java.lang.Throwable;
Throwable is superclass of all exceptions

Throw keyword throws exception like => throw new Exception();
Throws keyword is used in method declaration to inform the called to handle declared exception or relay the exception by adding the same exceptions in its method signature



Throwable
|_ Exception
|					|_IOException   (filenotfound, eof exception) [checked exception]
|					|_RuntimeExceptions [Unchecked Exception]
|														|_Null Pointer, ArrayOutOfBound, IllegalArgument,Number Format     Exceptions
|
|_Errors[Unchecked Exception]
		|_VirtualMachineError 
		|			|_OutOfMemoryError 
		|_LinkageError( No class definationfound)

Checked Exception: occurs by things not in our control like connecting server down. These exceptions we can predict and hence we will like to handle this is our code

uncheck exceptions occurs due to either programming flaws or system errors (like out of memory)  these execption are not checked by compiler

error represent unusual situation which is not caused by the program  like running out of memory

to understand the differnce clearly ..check Exceptions.java

So handling checked exception is done by
1) include throws keyword in the method declaration
2) exception handling via try catch

Runtime Exceptions are caused by bad programming, for example trying to retrieve an element from the Array. We should check the length of array first before trying to retrieve the element otherwise it might throw ArrayIndexOutOfBoundException at runtime. RuntimeException is the parent class of all runtime exceptions.



programming flaws: runtime exceptions ( should not be catched ideally)  why?? because if you just throw null pointer exception without handling  it then its a bad practice 
system errors: errors ....  never should be caught


Rule 1: If the super class method does not declare an exception, then the overriding method in the subclass cannot declare a checked exception, but can declare an unchecked exception.

Rule 2: 

(a) If the super class method declares a checked exception, then the overriding method in the subclass can declare same exception or a subclass exception or no exception at all, but cannot declare parent exception.

(b) If the super class method declares an unchecked exception, then the overriding method can declare any unchecked exception or no exception at all, but cannot declare a checked exception.

try block must contain atleast one finally or catch block

with java 7 we have someting called try with resources

Ex:

try ( FileInputStream in =new FileInputStream ( filewriter ) ;
			FileInputStream in2 =new FileInputStream ( filewriter ) ){
	//do something
}catch (FileNotFoundException e){
		//do something
}

both in and in2 are implicilty final so you cannot change that in try block, even the e variable in catch is final

so normally we would like to call in.close(); method in the finally block but try with resources feature automatically close that for us
this feature is called automatic resource manament (ARM)	
one condition to use try with resouce is that the resource class must be of type java.lang.AutoCloseable with close method implemented
try with resources need not have either a catch or finally block

robustnuss is how well a software handle exceptions ...that with exceptions the software should continue working 
Correctness is how correct the software is working...assertions is just for that

from Java 7 we can catch multiple exception
catch(IOException | SQLException | Exception ex){
     logger.error(ex);
     throw new MyException(ex.getMessage());
}

https://www.journaldev.com/2167/java-exception-interview-questions-and-answers

## Garbage collector

it makes sure that the heap has as much free space as possible

The garbage collector is under the control of the JVM; JVM decides when to run the garbage collector.

an object is eligible for garbage collection when no live thread can access it

### There are some ways by which we can make object elligible for garbage collection

StringBuffer sb=new StringBuffer("hello");
sb=null;   // nulling a reference
sb=new StringBuffer("world");   // reassinment

so the reference variable sb when set to null the stringbuffer object with value hello is elligible for Garbage collection

reassignment also makes the previous hello strigbuffer object elligible for GC

so to request jvm's garbage collector we can use System.gc(). But it is only a request, whether or not jvm will perform garbage collection is not guaranteed.

Object class has finalize() method which is for the object to do cleanup before getting removed by GC. but then again it will run or not is not guranteed. You can override finalize method and write steps which will be performed before the garbage collector remove it from the heap

