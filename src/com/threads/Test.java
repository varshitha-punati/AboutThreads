package com.threads;

public class Test extends Thread implements Runnable  {
public static void main(String[] args) {
	Test t=new Test();
	t.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("in run method");
}
}
