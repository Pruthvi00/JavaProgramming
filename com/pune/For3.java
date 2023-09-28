package com.pune;
import java.util.Scanner;
public class For3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println(i*2);
			}
			else if(i%2==0) {
				System.out.print(i*2 + "+");
			}
			else {
				System.out.print(i*2 + "-");
			}
			
		}

	}

}
