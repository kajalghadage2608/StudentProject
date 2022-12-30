package com.stringchapter;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String s = "we belongs to s group";

		char[] ch = s.toCharArray();

		int count = 0;

		for (char c : ch) {

			if (c == 's') {

				count++;

			}
		}

		System.out.println("Given chracter occur >> " + count);
	}

}
