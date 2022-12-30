package com.demo;

public class ReverseString {

	public static void main(String[] args) {

		String str = "kajal";

		String rev = " ";

		// logic 1st using string concatnation operator

		/*
		 * int len =str.length();
		 * 
		 * for(int i=len-1 ; i>=0 ; i--) {
		 * 
		 * rev = rev+str.charAt(i);
		 */

		// logic 2nd

		/*
		 * char a[] = str.toCharArray(); 
		 * int len = a.length; for 
		 * (int i = len - 1; i>=
		 * 0; i--) { rev=rev+a[i];
		 */

		// logic 3rd

		      StringBuffer sb = new StringBuffer(str);
		      
		      System.out.println("Reverse String is : " +sb.reverse());
		
	}

}
