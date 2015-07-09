package com.amazon.others;
//swap two numbers without third variable
public class Swap {

	public static void main(String[] args) {
		
		int i=5,j=3;
		
		i=i*j;
		j=i/j;
		i=i/j;
		System.out.println(i+"-----"+j);
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i+"-----"+j);
		
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println(i+"-----"+j);		
		
	}
		
}
