package com.pune;
				


					/* **    All about static and non Static with parameters                    */  







public class Highlight1 {
	
	public static void A(int a, int b) {
		System.out.println("Static Method and Add : " + (a + b));
	}
	
	public void B(int a, int b) {
		System.out.println("Non-static Method and Sub :" + (a-b));
	}
	public static void main(String[] args) {
		Highlight1 abc = new Highlight1();
		A(10, 20);
		abc.B(20,10);
	}

}
