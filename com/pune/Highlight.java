package com.pune;
													



														/* ALL ABOUT STATIC AND NON-STATIC WITHOUT PARAMETERS */





public class Highlight {
	
	public Highlight(){
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Non Static Block");
	}
	
	public static void M1() {
		System.out.println("Static Method");
	}
	
	public void M2() {
		System.out.println("Non Static Method");		
	}
	
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) {
		System.out.println("************** Constructor, Non_static block ************");
		Highlight H1 = new Highlight();
		System.out.println("*********** Static and Non Static Methods ************");
		M1();
		H1.M2();
		System.out.println("************ Static and Non-static Variables*******************");
		System.out.println("Static Variable : "+ a);
		System.out.println("Non-Static Variable : "+ H1.b);
	}

}
