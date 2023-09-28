package com.pune;
import java.util.Scanner;
public class While {
	public static void main(String args[]) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = sc.nextInt();
		while(i<n) {
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
	}
}
