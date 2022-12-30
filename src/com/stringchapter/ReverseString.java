package com.stringchapter;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "life is beautiful enjoy it";
		
/*		for(int i =s.length()-1; i>=0 ; i--) {
			
			System.out.print(s.charAt(i));
		}    */
		
		StringBuilder sb = new StringBuilder(s);
		    System.out.println(sb.reverse());

	}

}
