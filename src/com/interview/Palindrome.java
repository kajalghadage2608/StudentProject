package com.interview;

public class Palindrome {

	public static void main(String[] args) {
		
	 // palindrome means reverse is equal to 1 st number  121 = 121   535 = 535
	
		
		 int num = 121;
		 int temp = num;
		 int rev = 0;
		 int rem;
		 
		 while (temp !=0) {
			 
			 rem = temp %10;
			 rev = rev*10 +rem;
			 temp = temp/10;
		 }
		 
		 if(num==rev) {
			 
			 System.out.println("its a palindrome no.... ");
		 }
		 
		 else {
			 

			 System.out.println("its a not  palindrome no.... ");
		 }
		
		

}

}