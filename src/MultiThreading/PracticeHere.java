package MultiThreading;

import java.util.concurrent.TimeUnit;

// Create a runnable thread and how to use shared resources
// use of volatile
// use of synchronization keyword
// deadlock example
// notify notifyall 
// example of race condition


public class PracticeHere{
	
	public static void main(String[] args) throws InterruptedException {
		To t=new To();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t.getX());
	}
}


class To implements Runnable{
	private Object lock1=new Object();
	private Object lock2=new Object();
	private volatile int x;
	public void run() {
		increment();
		decrement();
	}
	
	void increment() {
		synchronized(lock1) {
			for(int i=0;i<20000;i++) {
				synchronized(lock2) {
					x++;	
				}
				
			}
		}

	}
	
	void decrement() {
		synchronized(lock2) {
			for(int i=0;i<20000;i++) {
				synchronized(lock1) {
					x--;	
				}
			}
		}

	}
	
	 int getX() {
		return x;
	}
}