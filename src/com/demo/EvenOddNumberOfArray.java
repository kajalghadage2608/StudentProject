package com.demo;

public class EvenOddNumberOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		// logic 1st

		/*
		 * System.out.println("Even number of array.........");
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (a[i] % 2 == 0) {
		 * 
		 * System.out.println(a[i]); }
		 * 
		 * System.out.println("Odd number of array.........");
		 * 
		 * for (int j = 0; j < a.length; j++) {
		 * 
		 * if (a[j] % 2 != 0) {
		 * 
		 * System.out.println(a[j]); }
		 * 
		 * }
		 * 
		 * }
		 */

		// logic 2nd

		System.out.println("Even number of array ....");

		for (int j : a) {

			if (j % 2 == 0) {

				System.out.println(j);
			}

		}
		
		System.out.println("Odd	 number of array ....");

		for (int j : a) {

			if (j % 2 != 0) {

				System.out.println(j);
			}

		}

	}
	}
