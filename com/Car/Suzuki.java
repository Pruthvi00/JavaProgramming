package com.Car;

import java.util.Scanner;

public class Suzuki extends Car {
	public void Version() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice 1 Maruti800 \nChoice 2 Dezire \nChoice 3 Brezza");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("********Maruti800**********");		
			break;
		case 2 :
			System.out.println("********Dezire**********");
			break;
		case 3 :
			System.out.println("********Brezza**********");
			break;
		default :
			System.out.println("Choice is not available");
		}
	}
}
