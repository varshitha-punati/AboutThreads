package com.threads;

public class ThreadExtraMethods{
	public static void main(String[] args) {
		sample();	
	}
	public static void sample() {
		try {
			System.out.println("try block");
			int a=10/0;
		}
		catch(Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		
			System.out.println(e);
			System.out.println("tostring:"+e.toString());
			System.out.println(e.getMessage());
		}
	}
}
