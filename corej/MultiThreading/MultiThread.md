Refer multithreading package of practice java

Threads are basically for small tasks. Threads can share resources and memory
Process are for heavy tasks and do not share memory and resources

Multithreading is for resources optimization and better CPU utilization

Threads are managed by thread scheduler

Threads can be created by 1) implementation of  Runnable Interface and 2) extending Thread Class 

We can specify the priority of thread but it doesn’t guarantee that higher priority thread will get executed before lower priority thread.

A Race condition is a problem which occurs in the multithreaded programming when various threads execute simultaneously accessing a shared resource at the same time. The proper use of synchronization can avoid the Race condition.

Time Slicing is the process to divide the available CPU time to the available runnable threads. 
Thread Scheduler is the Operating System service that allocates the CPU time to the available runnable threads.

Thread join() method to make sure all the threads created by the program is dead before finishing the main function...????

Thread communicate by wait notify and notifyAll 
Object class wait(), notify() and notifyAll() methods allows threads to communicate about the lock status of a resource. 
with wait thread goes into blocked state until some other thread calls the notify method on the object to which the first thread was locked

All these method should be inside synchronized method or code to prevent thread interviening

sleep and yield method are static because it has to operate on current thread.

Synchronization is the capability to control the access of multiple threads to any shared resource

Synchronizaton and atomic concurrent classes can be used for thread safety...also volatile keyword 	

Deadlock is the condition where threads wait on each other to release lock of an object

Ways to avoid the deadlock condition in Java:

Avoid Nested lock: Nested lock is the common reason for deadlock as deadlock occurs when we provide locks to various threads so we should give one lock to only one thread at some particular time.
	
Avoid unnecessary locks: we must avoid the locks which are not required.
Using thread join: Thread join helps to wait for a thread until another thread doesn't finish its execution so we can avoid deadlock by maximum use of join method.

When a method is synchronized, it locks the Object, if method is static it locks the Class, so it’s always best practice to use synchronized block to lock the only sections of method that needs synchronization.

Java synchronized keyword cannot be used for constructors and variables

It is preferable to create a dummy private Object to use for synchronized block, so that it’s reference can’t be changed by any other code

When we use volatile keyword with a variable, all the threads read it’s value directly from the memory and not from the cache

Synchronized block is more preferred way because it doesn’t lock the Object, synchronized methods lock the Object and if there are multiple synchronization blocks in the class, even though they are not related, it will stop them from execution and put them in wait state to get the lock on Object.



The fundamental difference is wait() is from Object and sleep() is static method of Thread . The major difference is that wait() releases the lock while sleep() doesn't releas any lock while waiting



Deadlock

        Thread thread1 = new Thread() {
            public void run() { synchronized (lock1) { Threads.sleep(); synchronized (lock2) { }}}
        };

        Thread thread2 = new Thread() {
            public void run() { synchronized (lock2) {Threads.sleep(); synchronized (lock1) { }}}
        };

        thread1.start();thread2.start();

