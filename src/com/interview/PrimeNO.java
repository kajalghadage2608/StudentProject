package com.interview;

public class PrimeNO {

	public static void main(String[] args) {
		
		 int num = 31;
		 int temp = 0;
		 
		 for(int  i = 2 ;i <=num ; i++) {
			 
			 if (num%i==0) {
				 
				 temp =temp+1;    // 0+1 = 1
				
			 }
			 
			 if (temp==0) {
				 
				 System.out.println(" its a prime number...." );
				
			 }
			 
			 else {
				 
				 System.out.println(" its a not prime number..." );
			 }
			 break;
			 
		 }
		  
	}

}
