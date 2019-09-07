package com.programs.random;


public class SquareRoot {
	public static void main(String[] args) {
		int n=4;
		
		 double a = (double) n;
		 double x = 1.0;
		  
		 // For loop to get the square root value of the entered number.
		 for( int i = 0; i < n; i++)
		 {
			 x = 0.5 * ( x+a / x );
		 }
		  
		 System.out.println("sqrt of " + a + " is --> " + x);
		 System.out.printf("sqrt of " + a + " is --> %1.2f", x);
	}
}
