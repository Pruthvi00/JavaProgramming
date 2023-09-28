package com.pune;
import java.util.Scanner;
public class Divisible6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 1st scanner is class and 2nd scanner is constructor
		int a = sc.nextInt();
		if(a%2==0) {
			if(a%6==0) {
				System.out.println("Even and divisible by 6 ");
			}
			else {
				System.out.println("Even but not divisible by 6");
			}
		}
		else {
			System.out.println("given number is odd number");
		}
	}

}
