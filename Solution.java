package com.programs.random;

public class Solution {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 int temp;
		 int size=A.length;
		 int lastIndex=size-1;
		 int totalWays=0;		 
		 int totalWays1=0;	
		 boolean flag=false;
		 
		 for(int i=0;i<size;i++) {
			 temp=i;
			 if(temp<lastIndex) {
				 if(A[temp]>A[++temp]) {
					 int temp1=i;
					 if(A[--temp1]<=A[temp]) {
						 totalWays++;
						 flag=true;
					 }else {
						 return 0;
					 }
				 }else {
					 totalWays1++;
				 }
			 }
			 if(i==lastIndex) { 
				 totalWays++;
			 }
		 }
		 if(!flag) {
			 totalWays=totalWays1+totalWays;
		 }
		 
		 return totalWays;
	    }
	 
	 public static void main(String[] args) {
		Solution ss=new Solution();
		//int A[]= {1,2,3,4,4};
		int A[]= {3, 4, 5, 4};
		System.out.println(ss.solution(A));
	}
}
