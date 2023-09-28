package com.Overloading;

public class Parent2 {
	public static void X(int a) {
		System.out.println("Parameterized Int value a ");
	}
	
	public static void X(int a, int b) {
		System.out.println("Multiparameterized Int value a ");
		
	}
	
	public static void X() {
		System.out.println("Non Parameterized");
	}
	
	public static void X(String name) {
		System.out.println("Parameterized String Value");
	}
	
	
	
	public static void main(String args []) {
		
		Parent2.X();											// for non parameterized method
		Parent2.X(10);										// for parameterized int value method
		Parent2.X("Shejal");									// for parameterized String value method
		Parent2.X(10,20);									// for Multi_parameterized value Method 
	}
}
