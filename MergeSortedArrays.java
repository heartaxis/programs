package com.programs.random;

public class MergeSortedArrays {

	public static void main(String[] args) {
	    int[] arrayA = { 23, 47, 81, 95 };
	    int[] arrayB = { 7, 14, 39, 55, 62, 74 };
	    merge(arrayA,arrayB);
	  }

	  public static void merge(int[] arrayA, int[] arrayB) {
	    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;
	    int sizeA=arrayA.length;
	    int sizeB=arrayB.length;
	    int[] arrayC = new int[sizeA+sizeB];

	    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
	      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
	        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
	      else
	        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

	    while (arrayAIndex < sizeA)
	      arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

	    while (arrayBIndex < sizeB)
	      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
	    
	    for (int i : arrayC) {
		      System.out.print(i+"\t");

		    }
	  }
}
