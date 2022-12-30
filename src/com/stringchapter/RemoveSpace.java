package com.stringchapter;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s = "The flower is beautiful";
		
		String ns = s.replaceAll("\\s", "");
		
		System.out.println(ns);

	}

}
