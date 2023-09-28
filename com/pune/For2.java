
										/* Find Square of first N numbers */


package com.pune;
import java.util.Scanner;
public class For2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			if(i>=1) {
				System.out.println(i*i);
			}
			
		}
	}
}
