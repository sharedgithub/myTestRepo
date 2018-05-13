# chapter 1
*class is a template that describes what kind of state and behaviour its objects can be

*state->instance variables
behaviour->methods


# inheritance
*inheritance is for code reuse

*interfaces are 100 percent abstact superclass

*identifiers can only start with a letter, $ and _ characters after that it can have any number of characters without space
int _a; int $b  are legal


# Modifiers-> Access and Non Access Modifiers

*Access Modifiers-> Public Protected Private Default. Classes can use public and default. 

* Methods can use all the four. Protected methods can be accesed by subclasses. Final method can not be overridden.

* Final argument of a method cannot be modified

*Non Access Modifiers-> final abstract strictfp

*Default access is package level access. Classes can be accessed only by the classes of same package

* to local variables only one non access modifiers can be applied which is final

* Public classes can be accessed from any where

* you make a class final when you dont want it to be subclassed for its methods to be overridden. 

* abstract classes can not be instantiated they are only to be extended for its method to be overridden. abstract classes contains both abstact methods and non abstract methods. But a non abstract class can never have a abstract method. The concept of abstract class is to implement or declare generic methods. 

public abstract class Animal{

  public abstract void color(); // abstract methods ends with semi colon
  
}
* since the static things are class level things and member functions and instance variable are object level. Abstract can not be used with static. Also abstract can not be final and private since subclass wont be able to override them to implement the methods.

* the first concrete subclass has to implement all the declared abstract method of the super class.

# Interfaces
* interfaces are contract for a class...if a class implements an interface or multiple interfaces then it has to implement all the methods interfaces contains

* interfaces contains only abstract methods which are implicitly public and abstract. and are not static and final and private

* interfaces contains only constants: Public static final

* interfaces can only extent one or more than one interfaces. cannot extent class

* interfaces are implicitly abstract

public interface honagaki{

  public abstract void runTo();
  
}

public class jadu implements honagaki{

  public void runTo(){
  
   system.Out.Println("this is jandu);
   
  }

}

* so within interface few things are not mandate to say like if i declare a method  void abc(); then this is legall as it is public and abstract implcitily so no need to say implicit things like if i define a variable int i; then we know it is constant implicity ie public static and final. also the order in which we specify these keyworrd are kind of less important i mean if write public 











