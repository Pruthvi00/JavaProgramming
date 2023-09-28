package com.Overloading;

public class Static {
	public static void Static() {
		System.out.println("Non parameterized Constructor");
	}
	
	public static void Static(int a) {
		System.out.println("Integer parameterized Constructor");
	}
	
	public static void Static(int a, float b) {
		System.out.println("Integer and float (multi) parameterized Constructor");
	}
	
	
	public static void main(String[] args) {
		Static a = new Static();		// default constructor will print
		a.Static();							// non parameterized constructor will print
		a.Static(10); 						// single parameterized 
		a.Static(29, 1.4f); 					// multi parameterized 
	}	
}
