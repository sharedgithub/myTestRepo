package Basics;

public abstract class Rough {
	static char a;
	static boolean b;
	public static void main(String[] args) {
	System.out.println(b);
	}
	
	public void doSomethind(String name) {
		killme();
	}
	
	public static void killme() {
		
	}

}


abstract class Dough{
	
	public static int c;
	
	public abstract void rocky(int a, String b);
	
	public void rock(String name) {
		System.out.println("asdf");
	}
}

class My extends Dough{

	@Override
	public void rocky(int a, String b) {
		c=2;
		
	}
	
	@Override
	public void rock(String b) {
		
	}
	
	
}