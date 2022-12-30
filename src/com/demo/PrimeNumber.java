package com.demo;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * int count = 0;
		 * 
		 * if (num > 1) {
		 * 
		 * for (int i = 1; i <= num; i++) {
		 * 
		 * if (num % i != 0) {
		 * 
		 * count++; } if (count == 2) {
		 * 
		 * System.out.println("Its a prime number...."); } else {
		 * 
		 * System.out.println("Its a not prime number...."); }
		 */

		int num = 14;

		int temp = 0;

	
			for (int i = 2; i <= num; i++) {

				if (num % i == 0) {

					temp = temp + 1;

				}
				if (temp == 0) {

					System.out.println("prime number......");
				} else {

					System.out.println("Not prime number");
				}
				break;
			}
		}

	}
