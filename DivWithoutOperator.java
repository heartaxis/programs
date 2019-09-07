package com.programs.random;
/*
 write a program to perform divison operation of two numbers without using /, %, and modules operatot
 */
public class DivWithoutOperator {

	public static void main(String[] args) {
		int dividend=14;
		int divisor=7;
		int quotient = 0;
		while (divisor <= dividend) {
			dividend = dividend - divisor;
			quotient++;
		}
		System.out.println(quotient);
		
	}
}
