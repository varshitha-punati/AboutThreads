package com.threads;

class ThreadExample extends Thread {
	
	SampleThread obj = new SampleThread();

	public void run() {
		//obj.addition();
		for (int i = 0; i < 5; i++) {

			System.out.println("current Thread name : " + Thread.currentThread().getName());
//			System.out.println("ThreadDemo clas");
			
		}
	}
}

public class ThreadSampleTest { 
	public static void main(String[] args) {
//		ThreadSampleTest t = new ThreadSampleTest();
		ThreadExample t1 = new ThreadExample();
		Thread thread = new Thread(t1);
		thread.setName("first thread");

		Thread thread1 = new Thread(t1);
		thread1.setName("second thread");

		thread.start();
		thread1.start();

//		ThreadSampleTest t1 = new ThreadSampleTest();
//		ThreadSampleTest t2=new ThreadSampleTest();
//		t2.start();
//		t1.start();
//		t.start();
	}

}

class SampleThread {
	public void addition() {
		System.out.println("in Addition method ");
	}
}
