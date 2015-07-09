package com.amazon.chapter1;


public class Rotation_1_8 {
	String str;
	String str1;
	
	public Rotation_1_8(String str,String str1){
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
		Rotation_1_8 obj=new Rotation_1_8("santosh","toshsan");
		System.out.println(obj.str);
		System.out.println(obj.str1);
		System.out.println("rotation status->"+obj.isSubstring());
	}
}