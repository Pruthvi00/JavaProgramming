package com.Overloading;

public class Construction {
	public void Construction() {
		System.out.println("sNon parameterized Constructor");
	}
	
	public void Construction(int a) {
		System.out.println("Integer");
	}
	
	public void Construction(int a, float b) {
		System.out.println("Integer and float");
	}
	
	
	public static void main(String[] args) {
		Construction a = new Construction();		// default constructor will print
		a.Construction();							// non parameterized constructor will print
		a.Construction(10); 						// single parameterized 
		a.Construction(29, 1.4f); 					// multi parameterized 
	}	
}
