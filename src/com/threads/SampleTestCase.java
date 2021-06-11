package com.threads;

public class SampleTestCase extends Thread {
	public static void main(String[] args) {
		
		SampleTestCase obj = new SampleTestCase();
		obj.setPriority(MIN_PRIORITY);
		Varshi v=new Varshi();
//		v.setPriority(9);
		v.setPriority(MAX_PRIORITY);
		System.out.println("varshi class priority:"+v.getPriority());
		System.out.println("sampletestclass priority:"+obj.getPriority());
		obj.start();
		v.start();
		
		
	}

	public void run() {
		System.out.println("sample test case class started");
		for(int i=0;i<4;i++) {
		System.out.println("i value is");
		}
		System.out.println("sample test case class ended");
		
	}
}
class Varshi extends Thread{
	public void run() {
		System.out.println("varshi class started");
		for(int i=1;i<5;i++) {
		System.out.println("in run method");
		}
		System.out.println("varshi class ended");
		
	}
}
