package com.threads;

public class ThreadMethod {
	public static void main(String[] args) {
		
		//creating object
		Sample thread=new Sample();
	
		//currentThread: Returns a reference to the currently executing thread object
		System.out.println("current thread:"+Sample.currentThread());
		
//		getName:This method is used to return the name of this thread.
//		->This method is not static so this method is accessible with 
//		->Thread class object it is not accessible with the class name.
		System.out.println("current thread name:"+Sample.currentThread().getName());
		
//		This method is used to check whether the current thread is a daemon thread.
//		Daemon thread is the thread which runs in the background.
		System.out.println("thread deamon:"+thread.isDaemon());
		
		 thread.setDaemon(true);
		 
		 System.out.println("thread deamon:"+thread.isDaemon());
		
		thread.start();
		
		
//		The getName() method returns the name of the entity (class, interface, array class, primitive type or void)
//		represented by this Class object as a String.
//		his method returns the name of the class or interface represented by this object.
		System.out.println("Thread name:"+thread.getName());
		
//		The setName() method provided by the java.lang.Thread class
//		is used to change the name of the thread.
//		This method does not return any value.   
		thread.setName("sample thread");
		
		System.out.println("Thread name:"+thread.getName());
		
//		It returns the number of active threads in the current thread's thread group.
		System.out.println("Thread active Count:"+Sample.activeCount());
//	The getStackTrace() method of thread class returns an array of stack trace elements 
		System.out.println("thread stackTrace:"+thread.getStackTrace());
//This method is used to return a Map of stack traces for all the existing or live threads.
		System.out.println(Sample.getAllStackTraces());
		
		System.out.println("thread id:"+thread.getId());
		
		System.out.println("thread name:"+thread.getName());
		
//		The getPriority() method of thread class 
//		is used to check the priority of the thread
		System.out.println("thread priority:"+thread.getPriority());
		
		
		
//		The getState() method of thread class returns the thread's state.
//		This method returns the state of the thread.
		System.out.println("thread state:"+thread.getState());
		
//		This method returns this thread's thread group.
		System.out.println("Thread group:"+thread.getThreadGroup());
		
//		thread class determines if the currently running
//		thread has permission to modify the thread and it does not have any return type
		thread.checkAccess();
//		thread.clone();
//		thread.dumpStack();    
		//isAlive method returns true if that thread is alive
		 System.out.println("status = " + thread.isAlive());
		 
	}   
}

class Sample extends Thread{
	
//	@override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("i value is:"+i);
		}
	}


}