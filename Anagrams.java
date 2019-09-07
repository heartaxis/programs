package com.programs.random;

public class Anagrams {
	private String str1;
	private String str2;
	
	public Anagrams(String str1,String str2){
		this.str1=str1;
		this.str2=str2;
		
	}
	public boolean checkAnagrams(){
		char temp;
		int length=str2.length();
		char buff[]=str1.toCharArray();
		boolean flag;
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		for(int i=0;i<length;i++){
			temp=str2.charAt(i);
			flag=false;
			for(int k=0;k<buff.length;k++){
				if(temp==buff[k]){
					buff[k]=0;
					flag=true;
					break;
				}
			}
			if(!flag){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Anagrams chkAn=new Anagrams("santosh", "shnasot");
		System.out.println(chkAn.checkAnagrams());
	}
}
