package com.Inheritance;

public class Gaurav extends Keshav {
	public void Apples() {
		System.out.println("Apples by Gaurav");
	}
	public static void main(String[] args) {
		Gaurav x = new Gaurav();
		x.Apples();
		x.grapes();
	}
}
