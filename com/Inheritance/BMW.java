package com.Inheritance;
import java.util.*;

public class BMW extends Main_Car{
	
	public void R1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1 for X1 and 2 for X2");
		int choice = sc.nextInt();
		BMW ch = new BMW();
		switch (choice) {
		case 1 :
			ch.X1();
			break;
		case 2 :
			ch.X2();
			break;
		default :
			System.out.println("Choice not available.");
			}
		
		}
	
	
		public void X1() {
			System.out.println(" Car Model : BMW X1");
		}
		public void X2() {
			System.out.println("Car Model : BMW X2");
		}
			
}
