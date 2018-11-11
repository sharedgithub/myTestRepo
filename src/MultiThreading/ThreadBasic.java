package MultiThreading;

import java.util.concurrent.TimeUnit;

public class ThreadBasic {
	/* Thread is single sequential flow of control within a process
	 * Thread is a light weight process
	 * 
	 * Two type of thread
	 * Daemon thread ...background thread such as gc
	 * Non Doemon ...created by the application...JVM run main which is Non Doemon thread
	 * 
	 * java.lang.Thread...it is a process
	 * 
	 * java.lang.Runnable interface ...is actualy to create task which process performs
	 * 
	 * Runnable has exactly one method run
	 * 
	 * Thread t =new Thread(task) // here task is in New State
	 * 
	 * t.start(); // task is in runnable state
	 * 
	 * 
	 * Thread scheduler..is responsible for moving thread between different state
	 * 
	 * Possible state transition
	 * Blocked->Runnable->Running->Blocked
	 * Running->Runnable
	 * 
	 * New and Dead are start and end state
	 *
	 * Should not rely on Thread Scheduler
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String args[]) {
		Task t=new Task();
		Thread n=new Thread(t);
		n.start();
		try {
			TimeUnit.SECONDS.sleep(4);// inspite of Thread.sleep use this
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// second way to do this is to have task class extend Thread and implement run in Task class
		
		// Task t= new Task();
		// t.start();
		
		// but the first way is prefered due to good design practice as it seperates tasks from process
		
		
		// once a thread execution is done it goes to dead state
		
		n.currentThread().yield(); /// thread is willing to yield its current cpu use
		try {
			n.join();// main will wait till n dies
			n.join(33);// wait till 33 ms till n dies then continue main thread execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		n.setName("mythread");
		n.setPriority(Thread.MAX_PRIORITY);//Thread.MIN_PRIORITY;Thread.NORM_PRIORITY
	}
	
	
	// What is race condition
	
	//Synchronization is to share mutable data. To avoid thread interfering with each other
	
	//Synchronized block or intrinsic lock  or monitor lock
	
	public synchronized void synchronizedTest() {
		synchronized(this) {
			//code that needs to be guarded by lock on object a
			// if the lock is not available thread will go into blocked state
		}
		
		
		// locks are per object and not per method...threads acquired lock of any synchronized method then no other thread can access any other synchronized method of clas
		// thread can enter unsynchronized methods even when lock is acquired by a different thread
	}
	
}



