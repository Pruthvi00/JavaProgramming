package com.Practice;
import java.util.Scanner;
public class Calci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Numbers : ");
		int sum = 0;
		int diff = 0;
		int mult = 1;
		int div = 0;
		
		int n = sc.nextInt();
		System.out.println("Enter the choice");
		int a = sc.nextInt();
//		System.out.println("Enter the " + n + " numbers :");
		switch(a) {
		case 1:
			for(int i =1; i<=n; i++) {
				System.out.println("Enter the " + i + " Number : ");
				int x = sc.nextInt();
				sum += x;
			}
			System.out.println("sum : " + sum);
			break;
		case 2 :
			for(int i=1; i<=n;i++) {
				System.out.println("Enter the " + i + " Number : ");
				int x = sc.nextInt();
				if(i==1) {
					diff = x ;
				}
				else {
					diff -= x;
				}
			}
			System.out.println("difference : " + diff);
			break;
		case 3 :
			for(int i=1 ; i<=n ; i++) {
				System.out.println("Enter the " + i + " Number : ");
				int x = sc.nextInt();
				mult *= x ;
			}
			System.out.println("Multiplication : " + mult);
			break;
		case 4 :
			for(int i=1; i<=n; i++) {
				System.out.println("Enter the " + i + " Number : ");
				int x = sc.nextInt();
				if(i==1) {
					div = x ;
				}
				else {
					div /= x;
				}
			}
			System.out.println("Division : " + div);
			break;
		default :
			System.out.println("Enter Valid Choice");
			
		}	
		
	}

}
