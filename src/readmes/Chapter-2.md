

class A{
}

Class C{}

public interface D{}

class B extends A implements D{
    private C animal;
}

B extends A => B IS-A A and B IS-A D and B IS-A Object
B HAS-A C

Every class in java is subclass of object class

Class can not extend multiple classes due to deadly diamond of death trap

![](https://1.bp.blogspot.com/-l3ZiXtNH22g/UXKwMchtD1I/AAAAAAAACFY/E_ql9QRIjj8/s1600/Capture.JPG)

private members( methods and variables) are not exposed by the class it can only be called by public members of the class but not from reference variable of the class

### Overriding
overriding is for defining behaviour specific to the class. Here the implementation of method of superclass is changed but with the following rules

private and static and final methods cannot be override. because we say final just to prevent overriding and static things are class level hence reference variables and child classes cant see them

argument list must match

return type should be same

The access level cannot be more restrictive

And overriding method must not throw new or broaded checked exception than overridden method

if you want to invoke superclass version of overrriden method  then within the overriding method call 

super.methodOfParentClass();

### Overloading

Overloading is just so be nice to the people who will be using our code and making your code available with different argument types so that they dont have to do any conversions prior to calling our code. So the rules are

Arguments MUST change

RetrunType, Access Modifier, Checked exception  CAN change

so which  overloaded version should be called is decided at compile time and which overridded version is to be called is decided at run time

But sometime a method can be both overloaded and overriden

public class Animal{

public void eat(){

}
}

public class Horse{

public void eat(){}   //overriding

public void eat(String food){}  // overloading

}

![](http://apprize.info/javascript/oca_2/oca_2.files/image211.jpg)

![](http://apprize.info/javascript/oca_2/oca_2.files/image213.jpg)


### Reference Variable Casting

Implicit Cast==> Dog d=new Dog(); Animal a=d;

Explicit Cast==> Animal a=(Dog) d;

Up Casting==> same as above

Down Casting==> Dog d=(Dog)(new Animal())


so in downcasting check below example...we can create refrence variable of more generic type from child class		

		Animala a=new Dog();  /// to create a dog instance from animal we have to upcast =>>   Dog d=(Dog) new Animala();
		if(a instanceof Animala) {   //// check instanceof
			Dog d= (Dog)a; //down casting....to use dog specific thing from animal refrence
			d.speak();
		}
		
 
		Dog d=new Dog();
		Animala a=(Animala)d;  //upcasting
		a.speak();// this is ok but at runtime overridden method will be called as initially object is of type dog




### Constructor chaining
http://apprize.info/javascript/oca_2/oca_2.files/image253.jpg


## Constructor rules

Constructor must be of same name as class

must not have return type. if it has then it is a method of same name that of class

complier creates default constructor with no arguments and same access modifiers only when not written explicitly

interfaces does not have constructors. they do not inherit from Object class however Object is supertype for interfaces

Within a method constructor can not be called it can be called via another construcctor

Constructor overloading is possible

So first statement of every constructor is either this() or super()

And when we dont call super() in constructore compliers take care of this

this() invokes another constructor and super() invokes constructor of parent class. pass paramenters inside super and this() to call parammeterized constructores

constructor can use any acccess modifier inlcuding private

### Coupling and Cohesion

Encapsulation: Loose coupling and High Cohesion

Coupling : is the degree by which one class knows about other class apart from exposed apis...like maybe a public or static member. so this should be as low as possible

Cohesion: One class one purpose











