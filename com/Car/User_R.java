package com.Car;
import java.util.*;
public class User_R {
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {		
			System.out.println("Choice 1 BMW \nChoice 2 Maruti ");		
			int choice = sc.nextInt();
			XX1 bz = new XX1();
			Suzuki sz = new Suzuki();
			
			switch (choice) {
			case 1 :
				System.out.println("********BMW**********");											//					|| Hierarchical Inheritance ||
				bz.Version();																			//			
				bz.Color();																				//						CAR
				bz.Speed();																				//						/  \
				bz.X12();																				//					   /    \
				break;																					//	  X1, X2, X3---- BMW   SUZUKI----- BREZZA , MARUTI800, DEZIRE
			case 2 :																					//					  /	
				System.out.println("********Maruti********");											//					XX1									
				sz.Version();
				Suzuki.Roof_Top();
				sz.Color();
				sz.Type();
				break;
			default :
				System.out.println("*******Choice Not available********");			
			}
			System.out.println("Do you want to continue then press 1");
			x =sc.nextInt();
		}while(x==1);
	}
}
