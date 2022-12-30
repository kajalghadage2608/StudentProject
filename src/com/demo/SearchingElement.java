package com.demo;

public class SearchingElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 60, 100 };

		int search_ele = 100;

		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			if (search_ele == a[i]) {

				System.out.println("Element  found ...." + i);

				flag = true;

				break;
			}

			if (flag == false) {

				System.out.println("Element not found ....");
			}

		}

	}

}
