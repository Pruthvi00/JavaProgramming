
						/* Check how the given two numbers are related to each other */

package com.pune;
import java.util.Scanner;
public class Conditional1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("First value is greater than Second Value");
		}
		else if (a<b) {
			System.out.println("Second value is greater than First Value");
		}
		else {
			System.out.println("Both values are same");
		}		
	}
}
