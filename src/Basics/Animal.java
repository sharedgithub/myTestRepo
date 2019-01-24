package Basics;

public interface Animal {
	// interface can only have constants
	int NUMBER_OF_ANIMALS=10;
	public static String TYPE="Animals";

	public abstract void eat();
	
	public default void eat(String food) {
		System.out.println(NUMBER_OF_ANIMALS);
	}
}
