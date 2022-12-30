package com.demo;

public class FactorialNo {

	public static void main(String[] args) {

		// logic 1st

		/*
		 * int num = 4 ;
		 * 
		 * int fact = 1;
		 * 
		 * for(int i = 1 ; i<=num ; i++) {
		 * 
		 * fact = fact*i; }
		 */
                                                                         
		// logic 2nd
                                        
		int num = 5;
                            
		int fact = 1;
                                                          
		for (int i = num; i >= 1; i--) {
                                                      
			
			fact = fact * i;
		}
                             
		System.out.println("The factorial number is ...." + fact);
	}
}