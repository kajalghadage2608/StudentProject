package com.demo;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		System.out.println("Before Swapping  >> " +a+ " "  +b);
		
		// logic 1st with 3rd variable
		
	/*	int temp = a;
		a = b;
		b = temp;  */
		
		// logic 2nd + , - operator 
		
	/*	a = a+b;
		b = a-b;
		a = a-b;   */
		
		// logic 3rd * , / operator 
		
  /*   	a = a*b;
		b = a/b;
		a = a/b;     */
		
		// logic 4 th  ^ operator 
		
	/*	a = a^b;
		b = a^b;
		a = a^b;   */
		
		// logic 5 th single line
		
		b = a+b-(a=b);       //   8- 5 = 3     
		
		
		
		System.out.println("After Swapping  >> "  +a+ " "  +b);
		
		

	}

}
