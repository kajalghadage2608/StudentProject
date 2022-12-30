package com.demo;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		 String str = "my name is kajal";
		
		 System.out.println("Before removing white space >> " +str);
		 
		 str.replaceAll("\\s", "");
		 
		 System.out.println("After removing white space >> " +str);
	}

}
