package com.pune;
import java.util.Scanner;
public class Bank {

	public void ROI() {
		int Roi = 23;
		System.out.println("Rate of Interest " + Roi + " %");
	}
	public void Ac_Bal() {
		int Ac_bal = 23000;
		
		System.out.println("Account Balance " + Ac_bal);
	}
	public void Acc_No() {
		long Ac_No = 2345;
		System.out.println("Acc_NO " + Ac_No);
	}
	public void IFSC() {
		int IFSC_Code = 234;
		System.out.println("IFSC_CODE "+ IFSC_Code);
	}
	
	
	public static void main(String[] args) {
		
		Bank xyz = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			xyz.Ac_Bal();
			break;
		case 2 :
			xyz.Acc_No();
			break;
		case 3 :
			xyz.ROI();
			break;
		case 4 :
			xyz.IFSC();
			break;
		default :
			System.out.println("Enter valid detail.");
		}
		
		
		
		
		

	}
//	Bank yz = new Bank();
//	yz.ROI();

}
