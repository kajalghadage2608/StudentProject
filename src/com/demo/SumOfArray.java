package com.demo;

public class SumOfArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 8, 5 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

			System.out.println("sum of array is >> " + sum);

		}

	}

}