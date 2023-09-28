package com.pune;
import java.util.Scanner;
public class ParameterizeConstructor2 {
	public static void main(String args[]) {
		
		ParameterizeConstructor1 obj = new ParameterizeConstructor1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter the numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		switch(choice) {
		case 1:
			obj.Sum(num1,num2);
			ParameterizeConstructor1.SSum(num1,num2);
			break;
		case 2:
			obj.Sub(num1,num2);
			ParameterizeConstructor1.SSub(num1,num2);
			break;
		case 3 : 
			obj.mul(num1,num2);
			ParameterizeConstructor1.Smul(num1,num2);
			break;
		case 4 :
			obj.Div(num1,num2);
			ParameterizeConstructor1.SDiv(num1,num2);
			break;
		default :
			System.out.println("Enter the valid Choice");
			
		}	
		
	}
}
