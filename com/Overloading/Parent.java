package com.Overloading;

public class Parent {
	public void X(int a) {
		System.out.println("Parameterized Int value a ");
	}
	
	public void X(int a, int b) {
		System.out.println("Multiparameterized Int value a ");
		
	}
	
	public void X() {
		System.out.println("Non Parameterized");
	}
	
	public void X(String name) {
		System.out.println("Parameterized String Value");
	}
	
	
	
	public static void main(String args []) {
		Parent ab = new Parent();
		ab.X();											// for non parameterized method
//		ab.X(10);										// for parameterized int value method
		ab.X("Shejal");									// for parameterized String value method
//		ab.X(10,20);									// for parmeterized Multi value Method 
	}
}



/*
 * 
 * 							************ 	Method Overloading | Compile time Polymorphism	 *************
 * 
 * 					
 * 		*******  according to parameters it automatically decides which method it should be called even if the method name is same *******
 * 
 * 										**********	 static methods can be overloaded 	**********
 * 
 * 										******** Sequence of Parameter Should be same **********
 * 
 * 									****** we can achieve overloading by using inheritance ******
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */