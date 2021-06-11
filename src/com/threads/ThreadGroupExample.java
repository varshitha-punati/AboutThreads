package com.threads;

public class ThreadGroupExample {
	public static void main(String[] args) {
		//this is by using new keyword
		int[] sno=new int[5];
		int []sno3=new int[5];
		int sno4[]=new int[5];
		
//		int[] sno2=new int[-5];
		
		//using literal way
		int sno1[];
		sno1=new int[5];
		
		
		sno[0]=1;
		sno[1]=3;
		
		sno[3]=15;
		sno[2]=10;
		sno[4]=11;
//		sno[6]=12;
//		System.out.println(sno[6]);
		
//		Object x[] = new String[3];
//        x[0] = 0;
        
//        System.out.println("using for loop:");
//		for(int i=0;i<5;i++) {
//			System.out.println(sno[i]);
//		}
		System.out.println("using for-each loop:");
		for(int j:sno) {
			System.out.println(j);
		}
//		
//		System.out.println(sno[5]);
		
	}
}
