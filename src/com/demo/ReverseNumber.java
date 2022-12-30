package com.demo;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number : ");

		int num = sc.nextInt();

		int rev = 0;

		// logic 1st

		/*
		 * while (num!= 0) {
		 * 
		 * rev = rev*10 + num%10; num = num/10; }
		 */

		// logic 2nd

		/*
		 * while (num>0) {
		 * 
		 * int rem = num%10; rev = rev*10 +rem; num = num/10;
		 * 
		 * }
		 */

		// logic 3rd

		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num));
		 * 
		 * StringBuffer rev1 =sb.reverse();
		 */

		// logic 4th

		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev2 = sbl.reverse();

		System.out.println("Reverse Number is :  " + rev2);

	}
}
