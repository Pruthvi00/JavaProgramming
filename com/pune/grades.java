package com.pune;
import java.util.Scanner;
public class grades {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 5 Subjects :");
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int English = sc.nextInt();
		int SSC = sc.nextInt();
		int Marathi = sc.nextInt();
		
		int sum = Marathi + SSC + English + Science + Maths;
		float avg = sum/5 ;
		System.out.println("The Percentage of Student is :" + avg + "%");
		
		if(avg >= 75) {
			System.out.println(" Student Pass With Distinction");
		}
		else if(avg>=60 && avg<75) {
			System.out.println("Student Pass With First Class");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("Student Pass with Second Class");
		}
		else {
			System.out.println("Better Luck Next Time");
		}
	}
}
