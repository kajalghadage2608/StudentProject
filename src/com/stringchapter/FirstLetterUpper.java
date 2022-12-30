package com.stringchapter;

public class FirstLetterUpper {

	public static void main(String[] args) {

		String s = "lalu is very handsome boy";

		String p[] = s.split(" ");
                                                     
		for (int i = 0; i < p.length; i++) {
                                                
			char ch[] = p[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {

				ch[0] = Character.toUpperCase(ch[0]);

				System.out.print(ch[j]);
			}

			System.out.print(" ");
		}
                                    
	}
}