package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		/*
		 * Anonymous lamda = (a, b) -> {
		 * 
		 * System.out.println(a+b);
		 * 
		 * System.out.println("This is lamda expression....!!!!"); };
		 * 
		 * lamda.addition(10, 40);
		 * 
		 * }
		 */

		/*
		 * Anonymous a = (m , n) -> { return (m-n);};
		 * 
		 * System.out.println(a.sub(200, 100));
		 * 
		 * 
		 * }
		 */

		Anonymous a = (x, y) -> {

			return (x * y);

		};

		System.out.println("Multiplication >> " + a.mul(5, 5));
	}

}
