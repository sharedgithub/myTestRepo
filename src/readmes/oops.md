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


* composition is nothing but has a relation ship
with inheritance things are tightly coupled and fragile and the hierarchy can be messy
hence we use compostion


Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
4. Constructor of object is never called when an object is deserialized.
5. Associated objects must be implementing Serializable interface.


FileOutputStream file = new FileOutputStream(filename); 
 ObjectInputStream in = new ObjectInputStream(file); 
 ObjectOutputStream out = new ObjectOutputStream(file); 
 out.writeObject(person); 
object1 = (person)in.readObject(); 

Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
Whenever an object is created, it’s always stored in the Heap space and stack memory contains the reference to it. Stack memory only contains local primitive variables and reference variables to objects in heap space.
Memory management in the stack is done in a LIFO manner whereas it’s more complex in Heap memory because it’s used globally.

Composition - I own an object and I am responsible for its lifetime. When Foo dies, so does Bar

public class Foo {
    private Bar bar = new Bar(); 
}
Aggregation - I have an object which I've borrowed from someone else. When Foo dies, Bar may live on.

public class Foo { 
    private Bar bar; 
    Foo(Bar bar) { 
       this.bar = bar; 
    }
}
