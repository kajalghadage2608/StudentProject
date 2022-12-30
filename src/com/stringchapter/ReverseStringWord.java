package com.stringchapter;

public class ReverseStringWord {

	public static void main(String[] args) {
		
		String s = "we are three sibling";
		
		String [] p = s.split(" ");
		
		for(int i =p.length-1 ; i>=0 ; i--) {

			System.out.print(" " +p[i]);
			
		}

	}

}
