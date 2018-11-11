package design.pattern;

public class Main {

	public static void main(String[] args) {

		// Basically there are three types of design patterns
		// 1) creational 2) structural 3) behavioural

		
		
//----->>>>>>   Below are some creational design patterns
		// Singleton Pattern is created so that a class can be initialized only once
		SingleTon s = SingleTon.getObj();
		SingleTon s2 = SingleTon.getObj();

		System.out.println(s);
		System.out.println(s2);

		
		
		
		// In Factory pattern, we create object without exposing the creation logic to
		// the client and refer to newly created object using a common interface.
		
		
		Shape newShape=ShapeFactory.getShape("circle");
		newShape.draw();
		
		//	Builder pattern builds a complex object using simple objects
		

//----->>>>>>   Below are some structural design patterns
		
		

// ----->>>>>>   Below are some behavioural design patterns
		
		
		//Template pattern are nothing but concrete classes implementing methods of abstract class
		
		//Stratergy patter class behaviour can be changed at runtime
		
		
		ShapeStratergy sd=new ShapeStratergy(new CircleShape()); 
		// now at runtime either circle or rectangle objects can be passed
		sd.draw();
		

	}

}
