package com.demo;

import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {

		// int arr [] = {10,20,30,40,50,60,60};

		// logic 1st

		/*
		 * boolean flag = false;
		 * 
		 * for(int i = 0 ; i<arr.length ; i++) {
		 * 
		 * for(int j = i+1 ; j<arr.length ; j++) {
		 * 
		 * if (arr[i]==arr[j]) {
		 * 
		 * System.out.println("Dulpicate elements in array ..." +arr[i]); flag = true;
		 * break; }
		 * 
		 * if(flag==false) {
		 * 
		 * System.out.println("Not found element in array ...."); } } } }
		 */

		// logic 2nd

		int arr[] = { 10, 20, 40, 10, 20 };

		HashSet<Integer> hm = new HashSet<Integer>();

		/*
		 * System.out.println(hm.add(10)); System.out.println(hm.add(40));
		 * System.out.println(hm.add(20)); System.out.println(hm.add(10));
		 */

		// logic 3rd

		for (Integer i : arr) {

			System.out.println(hm.add(i));
		}

	}
}
