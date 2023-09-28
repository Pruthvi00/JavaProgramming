package com.pune;

public class ParameterizeConstructor1 {
	
	public void Sum (int a, int b) {
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
	public static void SSum(int a , int b) {
		int sum = a + b;
		System.out.println("Sum = "+ sum);
	}
	
	public void Sub (int a, int b) {
		int sum = a - b;
		System.out.println("Sub = " + sum);
	}
	public static void SSub(int a , int b) {
		int sum = a - b;
		System.out.println("Sub = "+ sum);
	}
	
	public void mul (int a, int b) {
		int sum = a * b;
		System.out.println("Mul = " + sum);
	}
	public static void Smul(int a , int b) {
		int sum = a * b;
		System.out.println("Mul = "+ sum);
	}
	
	public void Div (int a, int b) {
		int sum = a / b;
		System.out.println("Div = " + sum);
	}
	public static void SDiv(int a , int b) {
		int sum = a / b;
		System.out.println("Div = "+ sum);
	}
	
}
