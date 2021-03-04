//Thread Creation by extending Thread Class
//The dumpStack() method is a static method of Thread class and it can be used to print or display stack tracing of the current thread to System.err. The purpose of the dumpStack() method is basically for debugging and Internally this method is calling the printStackTrace() method of Throwable class.
//This method does not raise any exceptions
package com.threads;

public class ThreadDemo {
	public static void main(String[] args) {
		
		System.out.println("main thread");
		System.out.println("Thread name:"+Thread.currentThread().getName());

	Tests thread=new Tests();
//	thread.show();
//	thread.run();
	thread.start();
	thread.setDaemon(true);
	System.out.println("Thread name:"+Thread.currentThread().getName());
	
	}
}
class Tests extends Thread{
		
	void show() {
		System.out.println("present in show method");
	}
	
	public void run() {
		
		System.out.println("Thread name:"+Thread.currentThread().getName());
		
		for(int i=0;i<5;i++) {	
			System.out.println("i value:"+i);
		}
		
	}
	
}
