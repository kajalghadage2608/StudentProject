package com.practise;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		int temp;
		int num = 568;
		int rev = 0;
		int num2 = num;

		while (num > 0) {

			temp = num % 10;
			rev = (temp * temp * temp) + rev;
			num = num / 10;
		}
		
		if (rev == num2) {

			System.out.println("no is armstrong...");
		}
		
		else {
			System.out.println("no is not armstrong...");
		}

	}

}
