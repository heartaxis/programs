package com.amazon.others;
//find the maximum of two numbers without using if else condition
public class Max {
	public static void main(String[] args) {
		int i=5;
		int j=10;
		double result;

		int k=Math.abs(i-j);
		int l=i+j;
		
		double k1=k;
		double l1=l;
		result=Math.ceil(k1/2) + Math.floor(l1/2);
		System.out.println((int)result);
	}
}
