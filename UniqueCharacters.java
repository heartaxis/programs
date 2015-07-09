package com.amazon.chapter1;

public class UniqueCharacters_1_1 {

	String str;
	
	public UniqueCharacters_1_1(String str){
		this.str=str;
	}
	
	public  boolean getDuplicateStatus(){
		boolean buf[]=new boolean[255];
		int temp;
		for(int i=0;i<str.length();i++){
			temp=str.charAt(i);
			if(buf[temp]==true){
				return false;	
			}
			buf[temp]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueCharacters_1_1 obj=new UniqueCharacters_1_1("santoh");
		boolean status=obj.getDuplicateStatus();
		if(status){
			status=false;
		}else{
			status=true;
		}
		System.out.println("string ->"+obj.str+"\n duplicate character status->"+status);
	}

}
