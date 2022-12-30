package com.demo;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str = "welcome to java";
		
		String [] words = str.split("\\s");
		
		String revwords = " ";
		
		for(String a : words) {
			
			StringBuilder sb = new StringBuilder(a);
			
			sb.reverse();
			
			revwords = revwords+sb.toString()+" ";
			
			System.out.println("Reverse each words in string ...."  +revwords);
		}
		
		
	}

}
