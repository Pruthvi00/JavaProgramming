package com.pune;
public class Static_M2 {
	
	public static void M1() {
		System.out.println("Static");
		
	}
	public void M2() {
		System.out.println("Non Static");
		M1();
		M2();
	}
	
	public static void main(String args[]) {
		
		Static_M2 xyz = new Static_M2();
		xyz.M2();
		M1();
		
	}
}




	/* non static Method can't be directly access in static Method
	 * 
	 * 		Preference order :
	 *   "Local variable > global variable" 
	 * 
	 * 		________________________________________________________
	 *  
	 *  	 Method	(Who)   |	Method (Whom)	|	Access/Not		|
	 *  	________________________________________________________
	 *  	 static 		|		Non-static 	|		Not Access	| (Through obj creation we can access)
	 *  	 Non-Static 	|		Non-static 	|		Access		|
	 *  	 Non-Static		|		Static		|		Access		|
	 *  	 Static 		|		Static      |        Access		|
	 *  	________________________________________________________
	 */