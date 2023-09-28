package com.pune;
import java.util.Scanner;
public class NonStatic {
	
	public void add() {
		int a = 10;				/* Non Static Method */
		int b = 20;
		System.out.println(a+b);
	}
	
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println(a-b);
	}
	
	
	public void mul() {
		int a = 20;
		int b = 10;
		System.out.println(a*b);
	}
	
	public void div() {
		int a = 20;
		int b = 10;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		NonStatic a = new NonStatic();	//Object Created with name a	// class_name obj_name = new constuctor/Method();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : 
			a.add();
			break;
		case 2 :
			a.sub();
			break;
		case 3 :
			a.mul();
			break;
		case 4 :
			a.div();
			break;
		default :
			System.out.println("Enter the Valid Choice");
			break;
		}
	}
}



			/* 
			 
			 Syntax : for non static method
			  
			 * Public				 Void				method_name(){}
				|						|
				AcccessModifier		RETURN_TYPE
				private					int
				default					String
										boolean
										float
										etc.
										
										
			How to create object for method ---
			Syntax : c_name obj_name = new c_name();
		
			for calling that method ----
			Syntax : obj_name.method_name();
			
			
						*/
						