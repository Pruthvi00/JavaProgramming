package com.Inheritance;
import java.util.Scanner;
public class Car2 extends Car1 {
	public void Car_Model() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Model name choice : ");
		int Model_Name_Choice = sc.nextInt();
		
		switch(Model_Name_Choice) {
		case 1 :
			System.out.println("Maruti Suzuki");
			break;
		case 2 :
			System.out.println("Creta");
			break;
		case 3 :
			System.out.println("Crysta");
			break;
		case 4 : 
			System.out.println("Fortuner");
		default :
			System.out.println("Not valid choice");
		}
	}
}
