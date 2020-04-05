package MultiThreading;

import java.util.concurrent.TimeUnit;

public class DeadLockHaha {
	
	public static Object lock1=new Object();
	public static Object lock2=new Object();
	
	public static void main(String[] args) throws InterruptedException {
		DeadLockHaha d1=new DeadLockHaha();
		task1 t1=d1.new task1();// task1 class is inner public class so accesible via objec of main class and also since main is static but class is not so we have to use the referece object to create task object
		task2 t2=new task2(); // this is static class task2 used in static context
		t1.start();
		t2.start();
	}

	public class task1 extends Thread{
		
		@Override
		public void run() {
			synchronized(lock1) {
				 try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock2) {
					
				}
				
			}
			
		}
		
	}

	
	public static class task2 extends Thread{
		
		@Override
		public void run() {
			synchronized(lock2) {
				 try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock1) {
					
				}
				
			}
			
		}
		
	}

}
