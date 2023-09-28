package com.pune;

public class Parameter_method {
	
	public void Add (int a , int b) {
		int c = a + b;
		System.out.println("Addition : " + c);
	}
	
	public void Sub (int a, int b) {
		int d = a - b;
		System.out.println("Subtraction : " + d);
	}
	
	public void mul (int a, int b) {
		int e = a * b;
		System.out.println("Multiplication : "+ e);
	}
	public static void main(String[] args) {
		
		Parameter_method hanu = new Parameter_method();
		hanu.Add(30, 40);
		hanu.Sub(50,12);
		hanu.mul(20, 100);
		
	}

}
