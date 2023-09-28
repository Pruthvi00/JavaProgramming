package com.pune;

public class Constructor_Para {
	public void m1() {
		System.out.println("Hello Gaurav");
			}
	
	public static void m2() {
		System.out.println("Hello pruthviraj");
	}
	
	static{System.out.println("Hello");}
	
	{System.out.println("non static");}
	
	public static void main(String[] args) {
		Constructor_Para obj = new Constructor_Para();
		obj.m1();
		Constructor_Para.m2();
		  
		Pruthviraj P= new Pruthviraj();
		P.meth1(10,20);
	}
	}



class Pruthviraj{
	
	public int  meth1(int a, int b) {
		int c=a+b; 
		System.out.println(c);
		return c;
	}
}
