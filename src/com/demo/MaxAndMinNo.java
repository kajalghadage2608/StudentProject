package com.demo;

public class MaxAndMinNo {

	public static void main(String[] args) {

		int a[] = { 50, 70, 40, 100, 20 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

			System.out.println("Maximum element in array ...." + max);
		}

		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];
			}
			}

			System.out.println("Minimum element in array ...." + min);
		}  

	}


