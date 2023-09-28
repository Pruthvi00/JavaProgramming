package com.pune;

import java.util.Scanner;

public class Static_M1 {
	
	public static void Patte() {
		System.out.println("Why your growth has been stopped ?");
	}
	
	public static void Hanmya() {
		System.out.println("Why are you feeling so sleepy");													// Static method
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Nik = sc.nextInt();
		
		if (Nik == 1) {
			Patte();
		}																			
		else {
			Hanmya();
		}
	}

}
/*	for calling static method we don't need to create an object directly we can call it.  but we can call static method by non_static method
 * ***** 				Method_Name();  or Class_Name.Method_Name();
 * 
 * *********   for calling non-static method we need to create an object then call it with the help of that object.																												*
 */