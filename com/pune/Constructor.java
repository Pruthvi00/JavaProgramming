package com.pune;

public class Constructor {
	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	{
		System.out.println("Non static block 1");
	}
	
	{
		System.out.println("Non static Block 2");
	}
	
	Constructor() {
		System.out.println("Default Constructor");
	}	
	
	public void A () {
		int a = 10;
		System.out.println(a);
	}
	
	static void B() {
		int b = 20;
		System.out.println(b);
	}
	
	public static void main(String args[]) {
		Constructor obj = new Constructor();
		obj.A();
		B();
	}
}




/* no class is blank when it was created it has always a default constructor
 *Access modifier & return type  -----> doen't present in Constructor
 *  To run constructor we don't need to call it, when we create an object it will automatically gets executed.
 *  
 *  priority ---------->        static block > non-static block > Constructor
 *  
 *  
 *  static will only call once in every class but non-static and constructor will run 
 * 		as many times as we create multiple objects.
 *  means,
 *  	no. of object created = no. of times non-static block runs = no. of times constructor block runs
 *  but 
 *  	static block will run only once
 *  */
 