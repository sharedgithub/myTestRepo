package design.pattern;

public class SingleTon {
	
	private static SingleTon s;
	
	private SingleTon() {
	}
	
	public static SingleTon getObj() {
		if(s==null) {
			s=new SingleTon();
		}
		return s;
	}
}
