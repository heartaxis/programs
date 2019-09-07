package com.practice.programs.random;
//Print a character 10 times without using loop and recursion.

public class PrintNosWithoutLoop {
	public static void main(String[] args) {
        int limit=10;
        char ch='a';
        print1(0,limit,ch);
    }
	
	public static void print1(int i,int limit,char ch){
		if(i<limit){
			System.out.println(ch);
			i++;
	        print2(i,limit,ch);
		}
	}
	public static void print2(int i,int limit,char ch){
		if(i<limit){
			System.out.println(ch);
			i++;
	        print1(i,limit,ch);
		}
	}
   
}
