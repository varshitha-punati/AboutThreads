// Thread Creation by implementing runnable interface
package com.threads;

import java.util.Map;

public class ThreadDemoOne implements Runnable {
	public static void main(String[] args) {
		
		ThreadDemoOne thread=new ThreadDemoOne();
		
		Thread t=new Thread(thread);
		Thread t1=new Thread(thread);
		
		// returns the context ClassLoader for this Thread
		
		System.out.println(t.getContextClassLoader());
		
		System.out.println(t.getDefaultUncaughtExceptionHandler());
		
		
		/* returns the handler invoked when this thread abruptly 
        terminates due to an uncaught exception. */
		System.out.println(
				"uncaught excecption handler :"+t.getUncaughtExceptionHandler());
		
		
		ClassLoader c=t.getContextClassLoader();	
		t1.setContextClassLoader(c);
		
		System.out.println("Class = " + c.getClass());
	     System.out.println("Parent = " + c.getParent());
		t.start();
		t.interrupt();
		System.out.println("is interrupted:"+t.isInterrupted());
		 Map m = Thread.getAllStackTraces();
		 
//		t.getAllStackTraces();
		System.out.println("Thread name:"+Thread.currentThread().getName());
		thread.run();
		System.out.println(t.activeCount());
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println("interrupted:"+t.interrupted());
		
		/* prints a stack trace of the current thread to the standard
        error stream, used for debugging */
		t.dumpStack();
	}

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			System.out.println("i value is:"+i);
		}
		
		
	}
}
