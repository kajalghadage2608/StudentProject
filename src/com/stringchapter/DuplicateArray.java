package com.stringchapter;

public class DuplicateArray {

	public static void main(String[] args) {

		int a[] = { 4, 5, 6, 4, 2, 9, 7 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("Duplicate element in array  >> " + a[i]);
				}
			}
		}

	}

}
