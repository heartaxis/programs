package com.amazon.chapter1;

public class ReplaceSpaces_1_5 {

	public static void main(String[] args) {
		String str="sant osh kum ar bag hel";
		String str1="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str1+="%20";
			}else{
				str1+=str.charAt(i);
			}
		}
		System.out.println(str);
		System.out.println("replaced space string -->"+str1);
	}
}
