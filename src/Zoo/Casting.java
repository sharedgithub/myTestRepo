package Zoo;

public interface Casting {

	public static void main(String args[]) {
		Animala a=new Dog();
		Dog b=(Dog)a;
		b.eat();
		

	}
}
