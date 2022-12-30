package com.practise;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("ram");
		al.add(100);
		al.add(40.6);
		al.add(null);
		al.add(100);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.toArray());
		System.out.println(al.stream());
	}
}