package MultiThreading;
public class Task implements Runnable{

	@Override
	public void run() {
		doSomething();
		doMore();
		System.out.println("task is running");
	}

	private void doMore() {
		System.out.println("doing more");
		
	}

	private void doSomething() {
		System.out.println("doing something");
		
	}
	
}
