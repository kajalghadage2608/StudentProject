package com.demo;

public class FebonacciSeries {

	public static void main(String[] args) {

		// logic 1st

		/*
		 * int num = 0; int num1 = 1; int sum;
		 * 
		 * System.out.println(+num + " " + num1);
		 * 
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * sum = num + num1;
		 * 
		 * System.out.println(sum);
		 * 
		 * num = num1; num1 = sum;
		 * 
		 * }
		 */

		int a = 0;

		int b = 1;

		int c;

		System.out.println(+a + " " + b);

		for (int i = 1; i <= 10; i++) {

			c = a + b;

			System.out.println(c);

			a = b;
			b = c;
		}
	}

}
