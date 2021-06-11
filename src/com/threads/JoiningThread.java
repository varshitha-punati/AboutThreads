package com.threads;
import java.lang.InterruptedException;
public class JoiningThread extends Thread {
	public static void main(String[] args) throws InterruptedException {
		
		JoiningThread thread=new JoiningThread();
		JoiningThread thread1=new JoiningThread();
		
		thread.start();
		
		thread.join();
	
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

