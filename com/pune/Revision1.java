package com.pune;

public class Revision1 {
		
//		{
//			System.out.println("Non-Static Block");						//Non_static Block
//		}
//		
//		
//		static {
//			System.out.println("Static Block");							//Static Block
//		}
		
		
		public void add(int a , int b) {
			System.out.println("Non-Static sum = "+ (a+b));		// Parameterized Non static Method
		}
		
		public static void sub(int a, int b) {
			System.out.println("Static Sub = "+ (a-b));			//Parameterized Static Method
		}
		
		public static void main(String[] args) {
			
			Revision1 r = new Revision1();
			
			
			r.add(10, 20);
			Revision1.sub(20, 20);
			
			
//			System.out.println("hii");									// Main Block
			
		}

	}


