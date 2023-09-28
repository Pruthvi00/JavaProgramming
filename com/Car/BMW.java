package com.Car;
import java.util.*;
public class BMW extends Car{
	public void Version() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choice 1 X1 \nChoice 2 X2 \nChoice 3 X3");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("********BMW X1**********");
			break;
		case 2 :
			System.out.println("********BMW X2**********");
			break;
		case 3 :
			System.out.println("********BMW X3**********");
			break;
		default :
			System.out.println("Choice is not available");
		}
	}
}
