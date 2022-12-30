package com.stringchapter;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int a[] = { 11, 14, 15, 12 };

		Arrays.sort(a);

		int s = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] == (s + 1)) {

				s = a[i];

			}

			else {

				System.out.println("Missing element in array >> " + (s + 1));
				break;
			}
		}

	}

}
