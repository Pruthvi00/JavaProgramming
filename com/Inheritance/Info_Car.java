package com.Inheritance;
import java.util.*;
public class Info_Car {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1 for Maruti and 2 for BMW :");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			Maruti x = new Maruti();			
			x.R2();
			x.Roof_Top();
			x.Speed();
			break;
		case 2 :
			BMW y = new BMW();
			y.R1();
			y.Type();
			y.Color();
			break;
		default :
			System.out.println("NO data available for this choice");
		}
		
//		suzuki1 sz = new suzuki1();
//		sz.Color();
//		sz.R2();
		

	}

}


/*                                                       Main_Car
                                                         /		\
                                                        / 		 \
                                                       BMW      Maruti    
                                                       /\		  /\
                                                      /	 \		 /	\
                                                     X1   X2  XUV   Suzuki                                                
                                                                                                                  
 */
 