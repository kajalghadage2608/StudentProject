package com.stringchapter;

public class VowelCount {

	public static void main(String[] args) {

		String s = "life is beautiful enjoy it";

		char[] letters = s.toCharArray();

		int count = 0;

		for (char c : letters) {
			

			switch (c) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				count++;
				break;
			}

		}
		System.out.println("Total vowel count is >> " + count);
	}

}
