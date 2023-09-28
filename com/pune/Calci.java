package com.pune;
import java.util.Scanner;
public class Calci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operation choice '1' for addition '2' for subtraction '3' for multiplication '4' for division '5' for reamainder  ");
		int Operation_Choice = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(Operation_Choice) {
		
		case 1*1:					// we can use operations for choice also
			int sum = a + b;
			System.out.print("The addition of a + b : " + sum);
			break;
		case 2:
			int diff = a - b;
			System.out.println("The subtraction of a - b :" + diff);
			break;
		case 3:
			int product = a*b;
			System.out.println("The multiplication of a * b : "+ product);
			break;
		case 4:
			int division = a/b;
			System.out.println("The division of a/b : " + division);
			break;
		case 5 :
			int remainder = a%b;
			System.out.println("The remainder of a%b is "+ remainder);
			break;
		default :
			System.out.println("Enter valid details");
		}
		
	}

}
