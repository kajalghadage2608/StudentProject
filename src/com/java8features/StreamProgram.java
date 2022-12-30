package com.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamProgram {

	public static void main(String[] args) {

		/*
		 * List<Integer> numbers = Arrays.asList(11,34,22,78,13);
		 * 
		 * numbers.stream().map(s -> s + "").filter(s -> s. startsWith("1"))
		 * 
		 * .forEach(System.out ::println);
		 */

		List<String> ls = Arrays.asList("ram","sita" ,"siya","shyam","raman","manas");
		ls.stream().map(x -> x + " ").filter(x -> x.startsWith("r")).forEach(System.out::println);

	}

}
