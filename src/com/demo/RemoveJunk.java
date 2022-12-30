package com.demo;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@#$%^&* latin string";
		
		s = s.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
