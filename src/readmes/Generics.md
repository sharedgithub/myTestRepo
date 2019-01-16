![](http://apprize.info/javascript/oca_2/oca_2.files/image1290.jpg)


type erasure means that generic type information is not available to the JVM at runtime, only compile time.

we can not have primitive type


package Generics;

import java.util.ArrayList;
import java.util.List;

import Zoo.Animala;
import Zoo.Dog;

public class TestGener {

	//Generics are for compile time type safety of your program

	// the below declaration is type safe and consider string object only
	List<String> st=new ArrayList<>();
	
	//return type and method argument can be type safe
	public List<String> dummyMethod(List<String> a){
		return a;
	}
	

	
	public static void main(String[] args) {
		//this will not compile and will show error and will ask to change list type to Dog
//		List<Animala> p=new ArrayList<Dog>();

		// but if you really want to make list in which child type can be put
		List<? extends Animala> anLi=new ArrayList<>();
		
		// we cannot make any modification in the list declared like this
//		anLi.addAll(new Dog());  // this will not compile
		
		//
		
	}
	
	public void hey(List<? extends Animala> a) { 
	// this method will accept Animala class and its subtype.
		
	// but the list cannont be modified inside the method
//	a.add(new Dog); // will not compile
	}
	
	public void heys(List<? super Dog> a) {
	// this method will accept dog and its super class
		
	// again the list in argument cannot be modified
	}
	
	public void method(List<?> list) {}
	public void method2(List<Object> list) {}
	
	// this first method takes list of any type
	
	// the second method takes list of type "Object" only
	
	// list modification is not allowed in the method if we take any list using wildcard. as shown in above three example
	

	
}

//Create your own generic classes and methods

class Zoo <T>{
	// the T here is to get what T is before creation of class
	
	Zoo(T param){
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Zoo<Dog> z=new Zoo<>(new Dog());
		
	}
	
	//<T> here is to get type of T before getting the param. So if in the class declaration as in above <T> is not present then in method you have to specify <T> tag else you can omit
	// after <T>.. T is return type
	public <T> T methodName(T param){
		List<T> list=new ArrayList<>();
		list.add(param);
		return param;
	}
}





