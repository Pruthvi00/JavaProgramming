package com.Overriding;

public class Test {
	
	public static void main(String[] args) {
		child ch = new child();
//		child.m1();						
		// ch.m2();			// Non-Static Way 
//		Parent.m1();
		
		
			
	}

}


/*             
 *  				****** Method overriding --------- Dynamic Binding --------- Run Time Polymorphism ******                      
 *	
 *
 *		********* For Method overriding, Method name of child and parent should be same and parameters are also Same. *********
 *			
 *								*************** for overriding we need inheritance ******************
 *
 *		************ Static methods we can't override but  we can override using non-static way(by creating object) *************
 *
 *         		  ******** Static keyword is based on the class and Overriding is based on the object *********
 *         
 *         ******** we can't override the Constructor because the constructor has different name in parent and children *******
 *         
 *         
 */