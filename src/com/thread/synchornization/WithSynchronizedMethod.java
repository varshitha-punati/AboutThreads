package com.thread.synchornization;

public class WithSynchronizedMethod extends Thread{
	
	public static void main(String[] args) {
		
		WithSynchronizedMethod wsync=new WithSynchronizedMethod();
		NormMethod n=new NormMethod();
		n.start();
		wsync.start();
	}
	public synchronized void run() {
		System.out.println("even numbers started");
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("even numbers ended");
	}
}
class NormMethod extends Thread{
	public synchronized void run() {
		System.out.println("odd numbers started");
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("odd numbers ended");
	}
}
