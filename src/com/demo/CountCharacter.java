package com.demo;

public class CountCharacter {

	public static void main(String[] args) {

		String s = "java is programming langauge";

		int totalcount = s.length();

		int aftercount = s.replace("a", "").length();

		int count = totalcount - aftercount;

		System.out.println("Number of count character is >>  " + count);
	}

}
