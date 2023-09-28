package com.Inheritance;
import java.util.Scanner;
public class Car1 {
	public void Car_Details() {
		System.out.println("Type : 4 wheeler.");
		System.out.println("RoofTop : open ");
	}
	
	public void Car_Company () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice for Car Company : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("Faraari");
			break;
		case 2 :
			System.out.println("Ford");
			break;
		case 3 :
			System.out.println("Hundai");
			break;		
		}
	
	}
	
}
