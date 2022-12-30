package com.demo;

import java.util.Arrays;

public class EqualsArray {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5 };

		int a2[] = { 1, 2, 3, 4, 5, 20, 45 };

		// logic 1st

		boolean status = Arrays.equals(a1, a2);

		if (status == true) {

			System.out.println("Array are equals ....");
		} else {

			System.out.println("Not equals.....");
		}

	}

	// logic 2nd

	/*
	 * boolean status = true ;
	 * 
	 * if(a1.length==a2.length) {
	 * 
	 * for(int i = 0 ; i<a1.length ; i++) {
	 * 
	 * if (a1[i] != a2 [i]) {
	 * 
	 * status = false; }
	 * 
	 * if(status==true) {
	 * 
	 * System.out.println("array are equals >> "); }
	 * 
	 * else {
	 * 
	 * System.out.println("array are not equals>> "); } } }
	 */

}
