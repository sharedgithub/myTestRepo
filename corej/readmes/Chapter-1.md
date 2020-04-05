
* JVM is to run java bytecode
* JVM loads java byte code, verify code and executes code 
* JRE = JVM + rt.jar (lang, util, awt, swing, math etc. libraries)
* JDK contains JRE contains JVM
* JDK contains various resources to develope java application
* JVM containse a class loader a memory area and execution engine

* class is a template that describes what kind of state and behaviour its objects can be.
* state->instance variables
* behaviour->methods

* there are two type of variables in java 

1) Primitive Default-value
char 			'u\0000'
boolean 		false;
byte 			0
short 			0
int 			0
long 			0L
double 			0.0d
float)			0.0f

2) Refrence variables

# Modifiers-> Access and Non Access Modifiers

### Access Modifiers-> Public Protected Private Default. 

* Classes can only use public and default. 
* Methods can use all the four. 
* Protected methods can be accesed by subclasses. 
* to local variables only one non access modifiers can be applied which is final
* Public classes can be accessed from any where
* Default access is package level access. Classes can be accessed only by the classes of same package
* interfaces can have only public and abstract modifiers

### Non Access Modifiers-> final abstract strictfp

* classes can be final or abstract but not both. final classes cannot be subclassed and abstract class cannot be instantiated
* Final argument( as in parameter of a method) of a method cannot be modified. 
*Final method can not be overridden.
* you make a class final when you dont want it to be subclassed for its methods to be overridden. 


# Abstract classes

* abstract classes can not be instantiated they are only to be extended for its method to be overridden. 
* abstract classes contains both abstact methods and non abstract methods. But a non abstract class can never have a abstract method. 
* The concept of abstract class is to implement or declare generic methods. 
* since the static things are class level things and member functions and instance variable are object level. Abstract keyword can not be used with static context. 
*Also abstract method can not be final and private since subclass wont be able to override them to implement the methods.
* the first concrete subclass has to implement all the declared abstract method of the super class.

	public abstract class Animal{
	
	  public abstract void color(); // abstract methods ends with semi colon
	  
	}

# Interfaces

* interfaces are 100 percent abstact superclass
* interfaces are contract for a class...if a class implements an interface or multiple interfaces then it has to implement all the methods interfaces contains
* interfaces contains only abstract methods which are implicitly public and abstract. and are not static and final and private
* interfaces contains only constants: Public static final
* interfaces can only extend one or more than one interfaces. cannot extend class
* classes can implement multiple interfaces
* abstract class can implement interface but they dont have to implement the methods
* interfaces are implicitly abstract
* so within interface few things are not mandate to say like if i declare a method  void abc(); then this is legall as it is public and abstract implcitily so no need to say implicit things like if i define a variable int i; then we know it is constant implicity ie public static and final. also the order in which we specify these keyworrd are kind of less important i mean if write public static final is equivalent to public final static

For Interface:
Interface is used when you don't know anything about implementation but know the contract that implementer should have to accomplish the task.
For Abstract class:
Abstract class is used when you know partial implementation, where say out of 5 methods, you know implementation of 3 methods and don't know implemenatation of 2 methods in that case 2 methods will be abstract and you need to rely on implementer as a contract to must provide body of abstract methods to accomplish the task.

	public interface honagaki{
	
	  public abstract void runTo();
	  
	}
	
	public class jadu implements honagaki{
	
	  public void runTo(){
	  
	   system.Out.Println("this is jandu);
	   
	  }
	
	}


  
# Enum 
* special class containing list of objects

* enum can be declared outside or inside a class but not in methods

* enum can contain constructors, method, variables and constants 

public enum myEnum{
	SUN,MON,TUE;
}


# static

* static methods do not have access to non static memebers.

* there is only one copy of static things which all the members shares

* A static method cant access not static (instance) members(varible and methods) as there no instance

* A non static method can access static method

* 

# Array 

* array can contain primitives or objects but array itself is an object

* int [5] abc is not legal we can declare as int abc[] but int [] abc is prefered

* identifiers can only start with a letter, $ and _ characters after that it can have any number of characters without space
int _a; int $b  are legal


 Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};

Process p=runtime.exec(s);
p.destroy();

