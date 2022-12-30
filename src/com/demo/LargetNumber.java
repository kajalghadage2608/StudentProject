package com.demo;

import java.util.Scanner;

public class LargetNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  number a ....");

		int a = sc.nextInt();

		System.out.println("Enter  number b....");

		int b = sc.nextInt();

		System.out.println("Enter  number c ....");

		int c = sc.nextInt();

		// logic 1st

		/*
		 * if (a > b && a > c) {
		 * 
		 * System.out.println("A is largest.."); }
		 * 
		 * else if (b > a && b > c) {
		 * 
		 * System.out.println("B is largest..");
		 * 
		 * } else {
		 * 
		 * System.out.println("C is largest.."); }
		 */

		// logic 2nd

		/*
		 * int largest = a>b?a:b;
		 * 
		 * int largest1 = c>largest?c:largest;
		 * 
		 * System.out.println(largest1);
		 */

		// logic 3rd

		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);

		System.out.println("Largest number is >> " +largest);

	}
      
}
