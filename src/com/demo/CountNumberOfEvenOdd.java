package com.demo;

public class CountNumberOfEvenOdd {

	public static void main(String[] args) {

		int num = 1234;

		int even_Count = 0;

		int odd_Count = 0;

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {

				even_Count++;
			}

			else {

				odd_Count++;

			}

			num = num / 10;
		}

		System.out.println("count number of even >>  " + even_Count);
		System.out.println("count number of  odd >>  " + odd_Count);

	}

}
