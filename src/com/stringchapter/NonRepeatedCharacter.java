package com.stringchapter;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "aabbbcddffe";

		char ch[] = s.toCharArray();

		for (char c : ch) {

			if (s.indexOf(c) == s.lastIndexOf(c)) {

				System.out.println("Non repeated chracter >> " + c);

			}
		}
	}

}
