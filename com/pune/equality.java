
									/* Three numbers are equal or not */

package com.pune;
import java.util.Scanner;
public class equality {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b) {
			if(b==c) {
				System.out.println("All numbers are equal");
			}
			else {
				System.out.println("All numbers are not equal");
			}
		}
		else {
			System.out.println("Numbers are not equal");
		}
		
	}
}
