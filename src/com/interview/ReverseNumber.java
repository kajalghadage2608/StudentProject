package com.interview;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		   int num = 4729;
		   int rem;
		   int rev= 0;
		   
		   while (num>0) {
			   
			   rem = num%10;  // 4729%10 =9
			   
			   rev = rev*10+rem;   //
			   
			   num = num/10;  
		   }
		   
		   System.out.println("reverse number is.... "  +rev);
	}

}
