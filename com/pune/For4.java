
										/* Sum of First n/2 even numbers */

package com.pune;
import java.util.Scanner;
public class For4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
					sum = sum + i;		
			}
		}
		System.out.println(sum);
	}
}