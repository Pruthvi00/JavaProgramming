package com.pune;
import java.util.Scanner;
public class Class2 {

	public static void main(String[] args) {
		
		Class1 abc = new Class1();
		NonStatic xyz = new NonStatic();
//		abc.add();
//		abc.sub();
		System.out.println("Enter the choice : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1 :
			abc.add();
			break;
		case 2 :
			abc.sub();									// it will print both sub and add because in class1 we code for that 
			break;
		case 3 :
			xyz.mul();
			break;
		case 4 : 
			xyz.div();
			break;
		default :
			System.out.println("Enter valid credentials");
		}
		
	}

}


			/* to call method into another package we need to import that package first as import com.pkg */