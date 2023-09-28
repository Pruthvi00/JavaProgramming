package com.pune;

public class Static2 {
	static int a = 10;
	int b = 20;
	public static void main(String args[]) {
		
//		int a = 20;
		
		Static2 A = new Static2();
		
//		System.out.println(a);			// it will print local variable 
//		System.out.println(A.a);		// it will print global variable			// (local > global) preference
		                                     
		
		System.out.println(A.b);		/*  
											to access non static global variable then 
											we need to create object and call through it
										*/
		System.out.println(a);			/* 
											to access static global variable then 
											we don't need to create and object we can directly call it.
										*/
		
	}
}
