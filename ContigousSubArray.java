package com.practice.programs.random;

import java.util.ArrayList;
import java.util.List;

class ContigousSubArray 
{ 
	
	public static long countSubarrays(List<Integer> numbers, int k)
	{ 
		long cntr = 0; 
		int i, j, mul; 
		int size = numbers.size(); 

		for (i = 0; i < size; i++) 
		{ 
			if (numbers.get(i) <= k) 
				cntr++; 
	
			mul = numbers.get(i); 
	
			for (j = i + 1; j < size; j++) 
			{ 
				
				mul = mul * numbers.get(j); 
				if (mul <= k) 
					cntr++; 
				else
					break; 
			} 
		} 
	
		return cntr; 
	} 
	
	// Driver Code 
	public static void main(String args[]) 
	{ 
		List<Integer> numbers =new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		int k = 7; 
		
		long count = countSubarrays(numbers, k); 
		System.out.print(count); 
	} 
} 

