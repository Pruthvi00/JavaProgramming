package com.pune;

public class Revision11 {
		Revision11(){													// by default it has default as access modifier 
			System.out.println("Constructor");
		}
	public static void main(String[] args) {
		Revision11 srk = new Revision11();
		Revision1 sk = new Revision1();
		sk.add(20, 10);
		Revision1.sub(20, 10);
	}

}
