package com.stringchapter;

public class PalindromeString {

	public static void main(String[] args) {

		String s1 = "nitin";

		StringBuilder sb = new StringBuilder(s1);

		StringBuilder rev = sb.reverse();

		String s2 = rev.toString();

		if (s1.equals(s2)) {

			System.out.println("String is palindrome");
		} else {

			System.out.println("String is not palindrome");
		}
	}

}
