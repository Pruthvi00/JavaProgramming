package com.Overloading;

public class Test1 {

	public static void main(String[] args) {
		
		GrandChild abc = new GrandChild();
////		Non static Method
//		abc.a();
//		abc.a(4.3f);
//		abc.a(4);
        // Static Method
//		Father.b();
//		Child.b(3);
//		GrandChild.b(4.3f);
		
		// Constructor 
		abc.Child(4);
		abc.Father();
		abc.GrandChild(4.3f);
		
	}

}
