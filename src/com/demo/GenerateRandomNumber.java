package com.demo;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		      Random rd = new Random();
		      
		       int rd_Int = rd.nextInt();
		       
		       System.out.println( rd_Int  );
		       
		        float rd_Float  = rd.nextFloat();
		        
		        System.out.println(rd_Float);
	}

}
