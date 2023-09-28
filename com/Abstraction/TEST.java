package com.Abstraction;
import java.util.*;
public class TEST {
	public static void main(String[] args) {
		System.out.println("Enter the choice :\nfor MOBILE 1 \nfor Laptop 2");
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
		case 1 : 
			System.out.println("You selected for 'MOBILE'. ");
			System.out.println("Enter choice for MOBILE BRAND : \n Vivo 1 \n SAMSUNG 2");
			int y = sc.nextInt();
			switch(y) {
			case 1 : 
				System.out.println("**********You selected for VIVO_PHONE************");
				Vivo v = new Vivo();
				System.out.println("Enter choice for model :");
				int rp = sc.nextInt();
				switch(rp) {
				case 1 : 
					System.out.println("*********VIVO V19*********");
					break;
				case 2 :
					System.out.println("*********VIVO V17**********");
					break;
				default :
					System.out.println("Choice not available :");
				}
				v.Battery();
				v.Camera();
				v.Memory();
				v.Price();
				break;
				
			case 2 :
				System.out.println("**********You seleceted for SAMSUNG_PHONE************");
				SAMSUNG s = new SAMSUNG();
				System.out.println("Enter choice for model :");
				int r = sc.nextInt();
				switch(r) {
				case 1 : 
					System.out.println("*********SAMSUNG M31*********");
					break;
				case 2 :
					System.out.println("*********SAMSUNG S9**********");
					break;
				default :
					System.out.println("Choice not available :");
				}
				s.Battery();
				s.Camera();
				s.Memory();
				s.Price();
				break;
			default :
				System.out.println("******* Enter Valid Choice for Mobile *********");
			}
			break;
			
		case 2 :
			System.out.println("You Selected for 'Laptop'.");
			int z = sc.nextInt();
			switch(z) {
			case 1 :
				System.out.println("**********you selected for DELL_LAPTOP************");
				Dell abc = new Dell();
				System.out.println("Enter choice for model :");
				int rip = sc.nextInt();
				switch(rip) {
				case 1 : 
					System.out.println("******** DELL ALIENWARE*********");
					break;
				case 2 :
					System.out.println("*********DELL Insperia X50**********");
					break;
				default :
					System.out.println("Choice not available :");
				}
				abc.RAM();
				abc.ROM();
				abc.Version();
				abc.Price();
				break;
				
			case 2 :
				System.out.println("**********you selected for HP_LAPTOP************");
				HP xyz = new HP();
				System.out.println("Enter choice for model :");
				int rx = sc.nextInt();
				switch(rx) {
				case 1 : 
					System.out.println("******** DELL ALIENWARE*********");
					break;
				case 2 :
					System.out.println("*********DELL Insperia X50**********");
					break;
				default :
					System.out.println("Choice not available :");
				}
				xyz.RAM();
				xyz.ROM();
				xyz.Version();
				xyz.Price();
				break;
				
			default :
				System.out.println("Enter Valid Choice for Laptop");
			}
			
			break;
			
		default :
			System.out.println("*********Enter Valid Choice**********");	
		}
	}
}
