package com.threads;

public class JoiningThread extends Thread {
	public static void main(String[] args) throws InterruptedException {
		
		JoiningThread thread=new JoiningThread();
		
		thread.start();
		thread.join();
		
		test thread1=new test();
		thread1.start();
		
		System.out.println("isAlive:"+thread.isAlive());
	}
	public void run() {
		System.out.println("thread1 started");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("thread1 ended");
	}
}
class test extends Thread{
	
	public void run() {
		System.out.println("thread 2 started");
		System.out.println("in thread 2");
		System.out.println("thread 2 ended");
	}
}
