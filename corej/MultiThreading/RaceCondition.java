package MultiThreading;

/*
A race condition occurs when two or more threads can access shared data and they try to change it at the same time. Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e. both threads are "racing" to access/change the data.

A Race condition is a problem which occurs in the multithreaded programming when various threads
execute simultaneously accessing a shared resource at the same time. The proper use of synchronization
 can avoid the Race condition.
 */

public class RaceCondition {

	public static void main(String[] args) {
		//try running this code again and again ...with and without synchronized keyword used in  do something method in task class
		Task task=new Task();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		
		t1.start();
		t2.start();
	}
}
