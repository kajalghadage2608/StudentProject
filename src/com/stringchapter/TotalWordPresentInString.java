package com.stringchapter;

public class TotalWordPresentInString {

	public static void main(String[] args) {

		String s = " we are belongs to s group ";

		char[] ch = s.toCharArray();

		int count = 0;

		for (char c : ch) {

			if (c == ' ') {

				count++;
			}
		}

		System.out.println("Total words in string >> " + (count-1));
	}

}
