package ZooKeeper;

import Zoo.IInt;

public abstract class AccessmModi3 implements IInt{
	
	
	protected AccessmModi3(){
	}
	
	public enum myenum{
		THIS, IS, NOT
	}
	static protected void dom() {};
	
	public static void main(String[] args) {
		final int a=3;
		int b=2;
		b=22;
		
		String s="THIS";
		if(s.equals(myenum.THIS.toString())) {
			System.out.println("hello");
		}
		
	}
}


class child extends AccessmModi3{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
}
