package com.Overriding;

public class child extends Parent {
	child(){
		System.out.println("*Constructor child*");						// Constructor
	}
//	
//	static public void m1() {
//		
//		System.out.println("Static M1 Inside Child");					// Static Method of Child
//	}
//	
	public void m2() {
																// "super" keyword used to access the parent's methods which are  
		System.out.println("Non-Static M2 Inside Child");					// override by the child class
		super.m2();	
	}
	
}
