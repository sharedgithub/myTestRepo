# Type Casting => implicit or explicit

byte(8 bits) short,char(16) int,float(32) double,long(64)

### Implicit casting:> 

widening casting,  like casting int to long

int x=65; long y=x;

### Explicit casting

narrowing casting 

long y=65: int x = (int) y

so with both implicit and explicit typecast there is a chance of data loss like if you convert float to int the value after the points get truncated

=> object are stored in heap with null as there default value

arrays are basically object with fixed number of items and of same type

so for array O(1) time complexity for data access and O(N) for search

### Methods

-void methods can have return statement in the function as 

return;

 -from an instance method we can use static methods or variable
 
 -java is pass by value
 
 - 	int id=1000  so this is how this statement is stored in the memory
 	-1) logical name
	-2) value
	-3) memory  address
	
	Student s=new Student
	
	- s is refrence variable. it stores the memory address of the new student object in the heap
	- so when passing an object refrence variable we are sending memory address of the object
	-when passing primitive we pass the value of the primitive
	
	## overloading methods
	
	- the only criteria is list of parameter  should be different
	
	- if order of parameter is changed then it is valid overloading
	- if only parameter name is changed then its invalid
	- if only return type is changed then also invalid
	
	## varargs
	
	- so a method can contain only one varargs parameter. varargs is basically array of parameter and specified by three dots after the parameter
	
	"java
	
	public dosomething(int... abc, String d) is illegal
	
	public dosome(int... ac, int... dc) //illegal. can only contain one vararg at the end of the method parameter list
	
	##this
	
	when we say "this" we mean instance level things ...so this cannot be used inside static context

compiler consider explicit imported packages first, to find class which mentioned without fully qualified name

import java.util.date   //explicit import
import java.sql.*     // *(star) import

Date d=new Date(); //this is class without fully qualified name 

import java.sql.Date
import java.util.Date 

the above will throw error only one Date package can be exported explicityly

import java.util.*
import java.sql.*

java.util.Date d=new java.util.Date();
java.sql.Date d=new java.sql.Date();


# String 

Java uses UTF 16 to represent characters
String is a sequence of unicode characters
String is immutable

Strings literal are created in string pool on the heap.
 if String abc; and String bcd are storing same "anuj" value then they are refering to the same value in the string pool and not two different "anuj" value. So memory is saved.
  But with the new keywork ie new String("anuj") if we make two string object then two copy of same string literal anuj is created in memory.

startwith
endswith
compareTo
substring
String.valueOf // valueOfMethod takes primitive values and give there string representation whereas toString is for string representation of objects

String s1="anuj";
String s2="anuj";

String s3=new String("anuj")
String s4=new String("anuj")

so for all the above statement one string literal "anuj" is created in the string pool first two string variable refer to same string literal
The next two variable contains two object on the heap refering to the same string literal

s1==s2 will return true whereas s3==s4 will return false

== actually checks wheather the object reference and value on both the side is same
whereas .equals method checks the value only...hence we should use .equals only on strings object

String pool also known as String table. The whole process of string creation is called string interning

on an string object we can call .intern() method so that string object refers to the same literal in string pool

like :

String a="anuj"
String b=new String(("anuj")
a==b  //false
a==b.intern() //true


##why string immutable: just check on internet for detailed solution

1) string interning  .... yes interning is possible ...ie creation of string pool ...because string is immutable  ..
2) concurency ...string by default are synchronized for multiple thread...
3) Security ...if it is mutable then any hacker can change string value

### string concat

String a="hello" + "world" + 24 +34 //  helloworld2434

String b=25 + 35 + "abc" + "dkf" //60abcdkf evaluation happens from left to right

StringBuilder sb=new StringBuilder(); // sb is mutable and not synchronized

sb.append

String s=""
s+="a" // copy of  "" and a is used to make a
s+="b" //copy of a and b is used to make ab
space complexity of above method is O(N^2)
using stringbuilder it is O(N) with its append method


mutator and accessor=> setter and getter

# instance initializers

static initializers and non static initializers

class test(){

{
instance initializers
}

static{
static 
}

}

## constant and final variable ...

in java final variable initialized at the same time are called constants

and final variable initialized later after the declaration is called final variable  :P

##Boxed primitive/ wrapper class

these are classes which encloses the primitive value

Interger acb=new Integer(32) //acb is called boxed primitive
acb.intValue();  //unwraping

if we write Integer boxed=35;
then compiler adds Integer boxed=new Integer(25); //Autoboxing

if we write int j=boxed;
then compiler adds int j =boxed.intValue();  //Auto unboxing

so Integer is the class to wrap that primitive int data type

Integer.parseInt("25")

Character c= new Character("A")
c.isLetter();
c.isDigit();
c.isLowerCase();

Double d=new Double(123)

Parsing string'
int a=Integer.parseInt("234");
Integer a=Integer.valueOf("234");

Object.hashcode(); will provide memory address in hashcode


effective java says minimize inhertance
for this we can mark clasess as final classes which cannot be extended but can be instantiated like String class

If all methods are static we can mark the constructor private then we wont be able to instantiate the class... like Math class
since the constructor is private only the class can use the constructor and the extend classes who by default have to call super class wont be able to extend classes with private constructors.

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
So handling checked exception is done by
1) include throws keyword in the method declaration
2) exception handling via try catch

Runtime Exceptions are caused by bad programming, for example trying to retrieve an element from the Array. We should check the length of array first before trying to retrieve the element otherwise it might throw ArrayIndexOutOfBoundException at runtime. RuntimeException is the parent class of all runtime exceptions.

uncheck exceptions occurs due to programming flaws or system errors (like out of memory)  these execption are not checked by compiler

programming flaws: runtime exceptions ( should not be catched ideally)
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




##Nested Classes

nested classes is for coupling classes using only each other together for better design

Types:
	Inner Classes 
		Annonymous Classes
		Local Classes
		Non Static Member clasess
		
	Static member clasess // these classes can never access instance member of the class
		
Access Level : Private Public Protected Default  // note that the main outer class access level can only be public or default

Outer.class  Outer$Nested.class   // compiler produces these two classes





