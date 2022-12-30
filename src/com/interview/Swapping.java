package com.interview;

public class Swapping {

	public static void main(String[] args) {
		
		int a = 20 ;
		int b = 50 ;
		
		System.out.println("before swapping....");
		System.out.println("a " +a);
		System.out.println("b " +b);
		
	/*	int temp;
		
		temp = a ;
		a = b;
		b = temp; */
		
		a = a+b;    // 20+50 = 70
		b = a-b;     // 20-50= 30
		a = a-b;     // 50-30 = 20
		
		System.out.println("after swapping....");
		System.out.println("a " +a);
		System.out.println("b " +b);
		
	}

}
