package com.interview;

public class FebbonicciSeries {

	public static void main(String[] args) {
		
		 int a = 0 ;  //0+1=2+3+5+8+13+21+
		 int b = 1;
		 
		 System.out.println(a+ " " +b);
		 
		 for (int i =1 ; i<=10 ; i++) {
			 
			 int c = a+b;
			     
			 
			 System.out.println(c);
			 
			 a=b;
			 
			 b=c;
			 
		 }
		 
		
	}

}
