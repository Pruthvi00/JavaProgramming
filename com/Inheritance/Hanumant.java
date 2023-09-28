package com.Inheritance;

public class Hanumant extends Rajesh{			// Keshav -----> Rajesh -----> Hanumant 

	public static void main(String[] args) {
		
		Hanumant Guri = new Hanumant();
		Guri.Bananas();
		Guri.grapes();
		// Guri.Apples();					// here we are not able to access the object present in Gaurav which is Apples.
	}

}

//public class Hanumant extends Gaurav{			// Keshav -----> Gaurav ------> Hanumant
//	public static void main (String args []) {
//		Hanumant Hanu = new Hanumant();
//		Hanu.Apples();
//		Hanu.grapes();
//		// Hanu.Bananas();				// here we are not able to access the object present in rajesh which is bananas.
//	}
//}