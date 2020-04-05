package MultiThreading;
public class Task implements Runnable{ // task is nothing but runnable 
//	public class Task extends Thread{ // this is the second way of creation of thread
	Integer x=0;

	@Override
	public void run() {  // and runnable has only one method run ..which has to be overridden
		doSomething();
		doMore();
		System.out.println("task is running");
	}

	private void doMore() {
		System.out.println("doing more");
		
	}

	private synchronized void doSomething() {
		
		for(int i=0; i<=1000; i++) {
				x=x+1;
		}
		System.out.println(Thread.currentThread().getName() + " X: " + x);
	}
	
}
