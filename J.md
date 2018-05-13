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

*Access Modifiers-> Public Protected Private Default

*Non Access Modifiers-> final abstract strictfp

*Default access is package level access. Classes can be accessed only by the classes of same package
* Public classes can be accessed from any where

* you make a class final when you dont want it to be subclassed for its methods to be overridden. 
* abstract classes can not be instantiated they are only to be extended for its method to be overridden. abstract classes contains both abstact methods and non abstract methods. But a non abstract class can never have a abstract method. The concept of abstract class is to implement or declare generic methods. 

public abstract class Animal(){
  public abstract void color(); // abstract methods ends with semi colon
}
