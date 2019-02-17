package Gener;

public class temp {
	void hello() {}

	public static void main(String[] args) {
	
		zoeo<temp> t=new zoeo<>();
		t.doit(new tempc2());
		
	}
}


class tempc1 extends temp{
	
	void hello() {System.out.println("heelo c1");}
}

class tempc2 extends temp{
	
	void hello() {System.out.println("heelo c2");}
}

class zoeo<T>{
	T t;
	
	void doit(T t) {
	}
}