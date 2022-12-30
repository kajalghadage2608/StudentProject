package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class SortElement {

	public static void main(String[] args) {

		// logic 1st

		/*
		 * int a [] = {30,50,20,100,10};
		 * 
		 * System.out.println("Array element before sort >>  " +Arrays.toString(a));
		 * 
		 * Arrays.parallelSort(a);
		 * 
		 * System.out.println("Array element after sort >>  " +Arrays.toString(a));
		 */

		// logic 2nd

		int a[] = { 40, 60, 10, 30, 110 };

		System.out.println("Array element before sort >>  " + Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("Array element after sort >>  " + Arrays.toString(a));

		// logic 3rd

		/*
		 * Integer a[] = { 200,100,50,400,500 };
		 * 
		 * System.out.println("Array element before sort >>  " + Arrays.toString(a));
		 * 
		 * Arrays.sort(a, Collections.reverseOrder());
		 * 
		 * System.out.println("Array element after sort >>  " + Arrays.toString(a));
		 */
	}

}
