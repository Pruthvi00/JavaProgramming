package com.pune;

public class Class1 {
	
	int a = 20;
	int b = 10;
	
	public void add() { 
		System.out.println("Add : " + (a+b));
	}
	
	
	public void sub() {
		Class1 c1 = new Class1();
		c1.add();
		System.out.println("Sub : " + (a-b));
	}
	
	
	public static void main(String[] args) {			
		
													/*     Main Method       */
		Class1 c2 = new Class1();
		c2.sub();
	}

}
