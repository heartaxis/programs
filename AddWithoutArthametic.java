package com.practice.programs.random;

import java.math.BigInteger;

//add two numbers without using + operator
public class AddWithoutArthametic {
	public static int add_no_arithm(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b; // add without carrying
		int carry = (a & b) << 1; // carry, but don't add
		return add_no_arithm(sum, carry); // recursion
	}

	public static void main(String[] args) {
		int a = 5, b = 7;
		int sum = BigInteger.valueOf(a).add(BigInteger.valueOf(b)).intValue(); 
		System.out.println(sum);
		System.out.println(add_no_arithm(4,3));
	}
}
