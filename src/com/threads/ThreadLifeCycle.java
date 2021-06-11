package com.threads;

public class ThreadLifeCycle {
public static void main(String[] args) throws InterruptedException {
	
	// Both the  threads are in runnable state
	ThreadTest t=new ThreadTest();
	t.setPriority(6);
	
	//The thread is in new born state
	ThreadSample t1=new ThreadSample();
	t1.setPriority(6);
	
	System.out.println(t.getState());
	//ThreadTest is in running State
	t.start();
	t1.start();
	System.out.println(t.currentThread().getName()+":getstate:"+t.getState());
	
	//Move control to another thread
			t.yield();	
			System.out.println(t.getState());
//			
			System.out.println(t.getState());
//			t1.join();
			
//			//Blocked State of thread B
//			System.out.println("t1 state is:"+t1.getState());
			
			
			
//			System.out.println("t1 state is:"+t1.getState());
			//timewaiting state of t
			System.out.println(t.getState());
			System.out.println();
}
}
class ThreadTest extends Thread{
	
	public void run() {
		System.out.println("first thread started");
		for(int i=0;i<5;i++) {
		System.out.println("In  ThreadTest class run method.....");
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				
			e.printStackTrace();
			}
	}
		System.out.println("first thread is completed");
	
	}
}     
	class ThreadSample extends Thread{
		public void run() {
			System.out.println("second thread is started");
			for(int i=0;i<5;i++) {
			System.out.println("i value is:"+i);
		}
			System.out.println("second thread is completed");
			System.out.println();
		}
	}


