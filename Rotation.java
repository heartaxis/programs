package com.practice.programs.random;


public class Rotation {
	String str;
	String str1;
	
	public Rotation(String str,String str1){
		this.str=str;
		this.str1=str1;
	}
	public  boolean isSubstring(){
		str+=str;
		System.out.println(str);
		if(str.indexOf(str1)>-1){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Rotation obj=new Rotation("santosh","toshsan");
		System.out.println(obj.str);
		System.out.println(obj.str1);
		System.out.println("rotation status->"+obj.isSubstring());
	}
}