package com.pune;

public class Static_Var {
	static int a =10;
	int b =20;
	
		public void xyz() {
			System.out.println(a);
			System.out.println(b);
		}
	public static void main(String[] args) {
		Static_Var A = new Static_Var();
		System.out.println(a);
		System.out.println(A.b);
		A.xyz();
	}

}

					/* Static variable can be called directly call or print in Main/static Method
					 * 
					 *
					 *  Non static Variable can be called by creating object.
					 *  Non Static variable can be called in Non-static method
					 *  Non-Static variable can't be called directly call or print in Main/static Method
					 *  
					 *  
					 *  
					 *  	________________________________________________________
					 *  
					 *  	 Variable		|Method(Who accesing)|	Access/Not		|
					 *  	________________________________________________________
					 *  	 static 		|		Non-static 	 |		Access		|
					 *  	 Non-Static 	|		Non-static 	 |		Access		|
					 *  	 Non-Static		|		Static		 |		Not Access	|  // Directly can't using obj possible
					 *  	 Static 		|		Static       |       Access		|
					 *  	________________________________________________________
					 *  
					 *  
					 *  
					 */