package com.interview;

import java.util.Scanner;

public class Factorial {

 /*	public int getFactorialNumber(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;  // 1*2*3*4*5*6

		}

		return fact;
	}

	public static void main(String[] args) {

		Factorial factorial = new Factorial();
		int c = factorial.getFactorialNumber(6);

		System.out.println("factorial number is >> " + c);
	}  */
	
 	public static void main(String[] args) {
		
		 int fact = 1;
		
		 System.out.println("enter any number...");
		 
		 Scanner sc = new Scanner (System.in);
		 
		 int num = sc.nextInt();
		 
		 for (int i = 1; i<=num; i++) {
			 
			 fact = fact*i;  // 1*1; 1*2 , 1*3,1*4...
			 
			 System.out.println( "factorial is ..." + fact);
			 
			 
			 
			 
		 } 
	
		
		
 	}
 	
}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	


