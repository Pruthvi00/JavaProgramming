package com.Inheritance;

import java.util.Scanner;

public class Maruti extends Main_Car {
	public void R2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1 for XUV and 2 for Suzuki");
		int choice = sc.nextInt();
		Maruti ch = new Maruti();
		switch (choice) {
		case 1 :
			ch.Maruti800();
			
			break;
		case 2 :
			ch.Suzuki();
			
			break;
		default :
			System.out.println("Choice not available.");
			}	
	}


	public void Maruti800() {
		System.out.println("Car Model : XUV");
	}
	public void Suzuki() {
		System.out.println("Car Model : Suzuki");
	}
}
