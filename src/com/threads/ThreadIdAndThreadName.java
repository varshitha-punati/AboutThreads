package com.threads;

public class ThreadIdAndThreadName extends Thread {
	
	public static void main(String[] args) {
		
//		ThreadIdAndThreadName t1=new ThreadIdAndThreadName();
//		t1.setDaemon(true);
////		System.out.println(t1.getName()+"("+t1.getId()+")");
//		ThreadIdAndThreadName t2=new ThreadIdAndThreadName();
//		t2.setDaemon(true);
////		System.out.println(t2.getName()+"("+t2.getId()+")");
		
		for(int i=1;i<=20;i++) {
			
			ThreadIdAndThreadName t=new ThreadIdAndThreadName();	
			System.out.println("main Thread:"+t.currentThread().getName()+"("+t.currentThread().getId()+")");
		
		t.start();
		System.out.println(t.getName()+"("+t.getId()+")");
		}
		
	}
	public void run() {
		System.out.println("In run method:"+getId());
	}
}
