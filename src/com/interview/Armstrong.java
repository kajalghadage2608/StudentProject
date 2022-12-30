
/* armstrong

//prime no
//factorial
//febbonicci series
//reverse string
// booble sort
// merge 
// palindrome */


package com.interview;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("enter any no..");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		 
		 int num2 = num;    // 371 =  // 153 = 1*1*1 + 5*5*5 + 3*3*3 153 = 153
		 
		 int rev = 0;
		 
		 while (num>0) {
			 
			int  temp =  num%10;
			rev= (temp*temp*temp)+rev;
			num= num/10;
			
		 }
		 
		 if(rev==num2) {
			 
			 System.out.println("no is armstrong...");
		 }
		 else {
			 
			 System.out.println("no is not armstrong...");
		 }
		 
		
		
	}

}
