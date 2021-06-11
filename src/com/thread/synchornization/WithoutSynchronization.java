package com.thread.synchornization;

public class WithoutSynchronization extends Thread{
	public static void main(String[] args) {
		WithoutSynchronization wosync=new WithoutSynchronization();
		 Sample s=new  Sample();
		wosync.start();
		s.start();
		
	}
	public void run() {
		System.out.println("withoutsynchronization class started");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("withoutsynchronization class ended");
	}
}
class Sample extends Thread{
	public void run() {
		System.out.println("sample class started");
		for(int i=20;i<=25;i++) {
			System.out.println(i);
		}
		System.out.println("sample class ended");
	}
}