package com.thread.synchornization;
public class SynchronizedMethodExample{
	public static void main(String[] args) {
		ThreadSample ts=new ThreadSample();
		ts.start();
		Mythread t=new Mythread();
		t.start();
		
	}
}
class ThreadSample extends Thread{
	
	void thriceValues(){//synchronized method 
		System.out.println("thricing the values");		
		   for(int i=1;i<=5;i++){  
		     System.out.println(i*3);  
		     }
		   System.out.println("thricing the values is completed");	
		   }  
	
	public void run() {
		thriceValues();
	}
	
}
class Mythread extends Thread{
	
	synchronized void twiceValues(){
		System.out.println("twicing the values");
		//synchronized method 	
		   for(int i=1;i<=5;i++){  
		     System.out.println(i*2);  
		     }
		   }  
	public void run() {
		twiceValues();
	}
}