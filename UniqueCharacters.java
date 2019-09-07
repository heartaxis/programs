package com.practice.programs.random;

public class UniqueCharacters {

	String str;
	
	public UniqueCharacters(String str){
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
		UniqueCharacters obj=new UniqueCharacters("santoh");
		boolean status=obj.getDuplicateStatus();
		if(status){
			status=false;
		}else{
			status=true;
		}
		System.out.println("string ->"+obj.str+"\n duplicate character status->"+status);
	}

}
