package MultiThreading;

import java.util.concurrent.TimeUnit;

/*

Concurrency vs Parallel execution
Concurrency is when programs can be executed in the ovrelapping time ie running simultanously but one at a time
Parallel is when program can be executed simultaneously at the same time
 
Multithreading is for resources optimization and better CPU utilization

 Thread is single sequential flow of control within a process
 Thread is a light weight process
 Threads are basically for small tasks. Threads can share resources and memory
 
 Process are for heavy tasks and do not share memory and resources
 
 
 Two type of thread
 Daemon thread ...background thread such as gc
 Non Doemon ...created by the application...JVM run main which is Non Doemon thread
 
 
 Threads can be created by 1) implementation of  Runnable Interface and 2) extending Thread Class 
 first is prefered as you can also extend any other class 
 
 java.lang.Thread...it is a process
 
 java.lang.Runnable interface ...is actualy to create task which process performs
 
 Runnable has exactly one method run
 
 class Task implements Runnable{
 	@override
 	public void run(){
 	}
 }
 
 Thread t =new Thread(task) // here task is in New State
 
 t.start(); // task is in runnable state
 
 
 When you call the start() method, it creates a new thread and executes code declared in the run()  
 while directly calling the run() method doesn't create any new threads and executes code on the same calling thread.
 
 Threads are managed by thread scheduler
 Thread scheduler..is responsible for moving thread between different state

 Possible state transition

New
|
Runnable=Blocked
|
Terminated

 Should not rely on Thread Scheduler
 
 We can specify the priority of thread but it doesn’t guarantee that higher priority thread will 
 get executed before lower priority thread.
 
 
Time Slicing is the process to divide the available CPU time to the available runnable threads. 
Thread Scheduler is the Operating System service that allocates the CPU time to the available runnable threads.

Thread join() method to make sure all the threads created by the program is dead before finishing the thread who is calling the join method

Thread communicate by wait notify and notifyAll 
Object class wait(), notify() and notifyAll() methods allows threads to communicate about the lock status of a resource. 

All these method should be inside synchronized method or code to prevent thread interviening

sleep and yield method are static because it has to operate on current thread.

Synchronization is the capability to control the access of multiple threads to any shared resource

Synchronizaton and atomic concurrent classes can be used for thread safety...also volatile keyword 	

Deadlock is the condition where threads wait on each other to release lock of an object

Ways to avoid the deadlock condition in Java:

	Avoid Nested lock: Nested lock is the common reason for deadlock as deadlock occurs when 
	we provide locks to various threads so we should give one lock to only one thread at some particular time.
	
	Avoid unnecessary locks: we must avoid the locks which are not required.
	Using thread join: Thread join helps to wait for a thread until another thread 
	doesn't finish its execution so we can avoid deadlock by maximum use of join method.

When a method is synchronized, it locks the Object, if method is static it locks the Class, 
so it’s always best practice to use synchronized block to lock the only sections of method 
that needs synchronization.

Java synchronized keyword cannot be used for constructors and variables

It is preferable to create a dummy private Object to use for synchronized block, so that it’s reference 
can’t be changed by any other code

When we use volatile keyword with a variable, all the threads read it’s value directly
 from the memory and not from the cache

Synchronized block is more preferred way because it doesn’t lock the Object, 
synchronized methods lock the Object and if there are multiple synchronization blocks in the class,
 even though they are not related, it will stop them from execution and put them in wait state to get 
 the lock on Object.



The fundamental difference is wait() is from Object and sleep() is static method of Thread . 
The major difference is that wait() releases the lock while sleep() doesn't releas any lock while waiting
 
 */

public class ThreadBasic {
	public static void main(String args[]) {
		Task t = new Task();
		Thread n = new Thread(t);
		n.start();
		try {
			TimeUnit.SECONDS.sleep(4);// inspite of Thread.sleep use this
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// second way to do this is to have task class extend Thread and implement run..check task class
		// in Task class

		// after that we can start the thread as shown below
		// Task t= new Task();
		// t.start();

		// but the first way is prefered due to good design practice as it seperates
		// tasks from process

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
		n.setPriority(Thread.MAX_PRIORITY);// Thread.MIN_PRIORITY;Thread.NORM_PRIORITY
	}

	// What is race condition

	// Synchronization is to share mutable data. To avoid thread interfering with
	// each other

	// Synchronized block or intrinsic lock or monitor lock

	public synchronized void synchronizedTest() {
		synchronized (this) {
			// code that needs to be guarded by lock on object a
			// if the lock is not available thread will go into blocked state
		}

		// locks are per object and not per method...threads acquired lock of any
		// synchronized method then no other thread can access any other synchronized
		// method of clas
		// thread can enter unsynchronized methods even when lock is acquired by a
		// different thread
	}

}


class Tasks extends Thread{

    public static AtomicInteger counter=new AtomicInteger();
    private static final Object lock=new Object();
    private static ReentrantLock lock2=new ReentrantLock();
    public void run(){
        increment();
    }

    public synchronized static void increment(){
        for(int i=0;i<10_00_000;i++){
            synchronized (lock){
                lock2.lock();
                counter.getAndIncrement();
                lock2.unlock();
            }
        }
    }


	Deadlock....
	
	Thread thread1 = new Thread() {
            public void run() { synchronized (lock1) { Threads.sleep(); synchronized (lock2) { }}}
        };

        Thread thread2 = new Thread() {
            public void run() { synchronized (lock2) {Threads.sleep(); synchronized (lock1) { }}}
        };

        thread1.start();thread2.start();

}
