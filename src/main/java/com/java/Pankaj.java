package com.java;

public class Pankaj {

	public static void main(String[] args) {
		/*System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);*/
		
		//System.out.println(args[4]);
	
		
	// increment for loop
		
	for (int i=0; i<args.length; i++) {
		System.out.println(args[i]);
	}
	
	/*for (int i=0; i<=args.length-1; i++) {
		System.out.println(args[i]);
	}*/
	
	//decrement for loop 
	
	for (int j=args.length-1; j>=0; j--) {
		System.out.println(args[j]);
	}

	}
}
