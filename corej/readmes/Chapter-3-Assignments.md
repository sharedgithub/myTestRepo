For the most part, the various pieces (methods, variables, and objects) of Java programs live in one of two places in memory: the stack or the heap

Instance variables and objects live on the heap.

Local variables live on the stack.

Example:

Dog d; Reference variable of type d is created on the stack but there is no dog object yet

d=new Dog(); a dog object is created and assigned to d

d.someMethod(d); a copy of reference variable is passed to the method

what are primitive and literal in java

Default values for primitives and Reference type...here we are talking about instance variables

![](http://apprize.info/javascript/oca_2/oca_2.files/image382.jpg)

Since arrays are object by default they are assigned as null

All the primitive data array if not initialized will hold zero value

static int[] year = new int[100] will contain array of 100 zeros


This is legal declaration 

int a, b=2, c=b+2;

###Button b= new Button();

Makes a reference variable named b, of type Button

Creates a new Button object on the heap

Assigns the newly created Button object to the reference variable b


### Variable scope

Static variables have the longest scope; they are created when the class is loaded, and they survive as long as the class stays loaded in the Java Virtual Machine (JVM).

Instance variables are the next most long-lived; they are created when a new instance is created, and they live until the instance is removed.

Local variables are next; they live as long as their method remains on the stack. As we’ll soon see, however, local variables can be alive and still be “out of scope.”

Block variables live only as long as the code block is executing. for(int i=2;i<20,i++) here i is block variable



### Pass by value

Java passes variables by value. ie it passes the bits representing the value of the variable. so the primitive type it refers to a value but when we pass refrence variable, the bits representing the object is passed . and inside the method another copy reference variable is created which refers to the same object.

but in any case whether you pass a primitive data, array, or a reference variable...you cannot change the value/refernece of the passed object. Passed reference variable state can change but the object it is reffering to cannot change.

## local variable and local object references or reference variable

so all the local variable defined should be initialized with a value explicitly. 

## Arrays

Arays are objects which can store multiple variables of same type. It can hold either primitive or object refrences


### initialization block

so initialization block of a class are of two type static and normal initialization block...it is used to execute code when class is loaded first with new keyword. static init block executes first and normal init block executes after static block. 

so every time an object is created non static block will be called. but static block will be called only for the first object.

In case a class has a main method ...and a static block...and inside main, there is no object of the same class created using new keyword then in this case..static initializr block still will be called first as this class has to load first to call the main method inside it.

class Animal{

//static initializer block
static{ int x=3;}

//non static block
{System.out.println("this is normal init")}

}



### ternary operator

(a>b)?b=20:b=0;

String important method: charAt(),trim(),length(),equalsIgnoreCase(),substring(),toLowerCase(), concat()

## wrapper class autoboxing boxing widening and var-args

Wrapper classes is to wrap primitive values in an object so that they can be treated as an object. Also to provide utility methods like mentioned below to primitives


1) xxxValue()
2) parseXxx();
3) valueOf();

There is a wrapper class for every primitive

boolean=>Boolean  byte=>Byte  char=>Character int=>Integer  long=>Long


Integer i=new Integer("42");//wrap it

Integer i=Integer.valueof("42");

Integer i=new Integer(42); 

int x=i.intValue();  //unwrap it

int x=Integer.parseInt(i);


### some conditional stuff

so java loops we have do while and while and for loops

break statement breaks the entire loop while the continue statement breaks only the current iteration. and these two staments cannot be used outside loop because compiler will throw error. however break can be used with switch

switch(var){

  case 1:

   break;

case 2:

  break;

default:

}





