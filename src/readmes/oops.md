Abstraction
Encapsulation
Polymorphism: compile time and run time.
Inheritance
Association
Composition
Aggregation

* Abstraction is to hide the implementation and expose only which is meaningful and simple...like exposing object methods but leave the details in its implementation

* encapsulation is bringing data and funtions to a single unit like classes
Polymorphism is the ability of an object to take on many forms.
* compile time polymorphism is method overloading and It is also known as Static binding, Early binding and overloading as well. call to overloaded method is resolved at compile time.

Polymorphism is when a single object can take differ forms
public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}
A Deer IS-A Animal
A Deer IS-A Vegetarian
A Deer IS-A Deer
A Deer IS-A Object

* runtime polymorphism is method overiding as it is at runtime when the compiler decides. Dynamic binding and late binding
Polymorphism lets us perform a single action in different ways. like eat method of different animals
Polymorphism allows you to define one interface and have multiple implementations
We can create functions or reference variables that behave differently in different programmatic context.

* inhertance is implemented by extending a class(ex parent and child class) to promote code reuse

* association is when objects can exist independently of each other and can have one to one or one to many relation ship. like teacher and students objects are also independent of each other. No ownership is involved

public class Teacher {
   private String name;
   private List<Student> students;
   // getter and setter methods 
}

public class Student {
   private String name;
   private List<Teacher> teachers;
   // getter and setter methods 
}

There are two form of association 
1) aggregation ie weak association
2) composition ie strong association

* Aggregation owner ship is involved so object also have HAS-A relation ship. Can exist without owner. Car has a driver.

class Product{
}

class ListOfProduct{
	List<Product> abc=new List<>();
	
	void add(Product p){
		abc.add(p)
	}
}

class Order{
Product p1=new Product();


}

* composition is when object can not existe without other like engine is part of car









