package Gener;


import java.util.ArrayList;
import java.util.List;



public class TestGener {

	//Generics are for type safety of your program
	


	// the below declaration is type safe and consider string object only
	List<String> st=new ArrayList<>();
	
	//return type and method argument can be type safe
	public List<String> dummyMethod(List<String> a){
		return a;
	}
	

	
	public static void main(String[] args) {
		
		List a=new ArrayList();
		a.add(2);
		Integer b=(Integer) a.get(0); // casting required
		
		List<Integer> a2=new ArrayList<>();
		a2.add(22);
		Integer b2=a2.get(0); // casting not required
		
		//this will not compile and will show error and will ask to change list type to Dog
//		List<Animala> p=new ArrayList<Dog>();

		// but if you really want to make list in which child type can be put
		List<? extends Animala> anLi=new ArrayList<Dog>();
		
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

class Xoo<T,U,V>{
	// class with more than one generic types
}



