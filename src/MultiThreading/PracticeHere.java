package MultiThreading;


// Create a runnable thread and how to use shared resources
// use of volatile
// use of synchronization keyword
// deadlock example
// notify notifyall 
// example of race condition


public class PracticeHere extends Thread{

	public static void main(String[] args) {
		PracticeHere t=new PracticeHere();
		t.start();
		PracticeHere t2=new PracticeHere();
		t2.start();
		
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Running"+ Thread.currentThread().getName());
	}
}
