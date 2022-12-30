package com.interview;

public class ReverseString {

	public static void main(String[] args) {

		String str1 = "raj";

		System.out.println("original string >> " + str1);

		String str2 = " ";

		char ch;

		for (int i = 0; i < str1.length(); i++) {

			ch = str1.charAt(i);

			str2 = ch + str2;

			System.out.println("reverse string  >> " + str2);
              
			
		}

	}

}
                              