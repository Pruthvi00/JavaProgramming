package com.pune;

public class staticblock {
		
	static {
		System.out.println("Inside Static Block");												// Static Block(we use static keyword "static { }")
	}
	
	{
		System.out.println("Inside non Static Block");											// Non-Static Block (it runs only when we create object)
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main");														// Main Method
		staticblock A = new staticblock();
		
	}

}



	// static block runs before the main method. don't need to call it.