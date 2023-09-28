package com.Hard;
import java.util.Scanner;
public class World {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = sc.nextInt();
		System.out.println("The given number is : " + Number);
		
		int l_digit = Number %10;
		System.out.println("The Last digit of given Number is : "+l_digit);
		
		int f_digit = 0;
		while(Number !=0) {
			f_digit = Number % 10;
			Number /= 10;
		}
		System.out.println("The first digit of given Number is : " + f_digit);
		
		int Sum = l_digit + f_digit ;
		System.out.println("The sum of 1st and last digit of given number is : " + Sum);
	}

}
