package com.practise;

public class Velocity {
	
	public int factorial (int num)  {
		
		int fact = 1;
		
		for (int i = 1; i<=4 ; i++) {
			
			fact = fact*i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		Velocity v = new Velocity ();
		
		int res=v.factorial(4);
		
		System.out.println("The factorial No is >> "  +res);
		
	}
	
	}