package MultiThreading;

import java.util.concurrent.TimeUnit;

public class DeadLockHaha implements Runnable{
	
	Object boy1=new Object();
	
	public void Huggu() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "HHH####################");
		synchronized(boy1){
//			print("acquired hugging lock");
//			print("boy doing huggu");
//				print("calling muttu");
//				Thread.sleep(500);
				boy1.wait();
				muttu();
			}
//		System.out.println(Thread.currentThread().getName() +"HHH####################");
	
	}
	

	public void muttu() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "HHH####################");
		synchronized(boy1){
//			print("acquired mutting lock");
//			print("boy doing muttu");
//				print("calling huggu");
//				Thread.sleep(500);
				boy1.wait();
				Huggu();
		}
	}
	
	public void print(String message) {
		System.out.println(Thread.currentThread().getName() + "  : " + message);
	}
	
	public void run() {
		try {
			Huggu();
			muttu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new DeadLockHaha());
		Thread t2= new Thread(new DeadLockHaha());
		t1.start();
		t2.start();
		System.out.println("starting");
	}
}
