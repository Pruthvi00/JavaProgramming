package com.Inheritance;
import java.util.*;
public class Kunal {
	
	public void Car_companay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		Kunal b = new Kunal();
		
		switch (choice) {
		case 1 :
			b.BMW();
			break;
		case 2 :
			b.Hundai();
			break;
		case 3 :
			System.out.println("Choice is not available");
			
		}
		
	}
	
	public static void main(String[] args) {
		Kunal a = new Kunal();
		a.Car_companay();
		System.out.println("wheels : 4 wheeler");
		System.out.println("Speed : 400 km/hr");
		System.out.println("Confortable : Max");
	}
	
	
	public void BMW () {
		System.out.println("Enter the ModelChoice :");
		Scanner sc = new Scanner(System.in);
		int choice  = sc.nextInt();
		
		switch (choice) {
		case 1 : 
			System.out.println("BMW M5");
			break;
		case 2:
			System.out.println("BMW X7");
			break;
		default :
			System.out.println("Choice Not available");
		}
	}
		
		public void Hundai () {
			System.out.println("Enter the ModelChoice :");
			Scanner sc = new Scanner(System.in);
			int choice  = sc.nextInt();
			
			switch (choice) {
			case 1 : 
				System.out.println("Hundai Creta");
				break;
			case 2:
				System.out.println("Hundai Verna");
				break;
			default :
				System.out.println("Choice Not available");
			}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
