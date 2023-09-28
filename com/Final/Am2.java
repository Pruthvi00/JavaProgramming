package com.Final;

public class Am2 extends Am1 {
	public void m11() {						
		System.out.println("We can't override final method");
	}

	public static void main(String[] args) {
		Am2 xyz = new Am2();
		xyz.m11();
		xyz.m1();
	}
}
