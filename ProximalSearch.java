package com.flipkart;

import java.util.ArrayList;
import java.util.Arrays;

public class ProximalSearch {

	public static void main(String[] args) {
		
		//String str="i buy a lot of things online";
	//	String input="buy a";
		
		//String str="Flipkart is a leading destination for online shopping in inda offering some of the best prices and a completely hassle free experience with options of paying through Cash on Delivery Debit Card Credit Card and Net Banking processed through secure and trusted gateways";
		//String input="Debit Banking online";
		String str="dog mice cat usa en the abc holy cat good dog";
		String input="the holy cat";
		
		String searchStr="";
		int startPos=0,endPos=0;
		int endWordLength=0;
		boolean startPosFlag=false;
		String strArr[]=str.split(" ");
		String inputArr[]=input.split(" ");
		ArrayList matchedPos=new ArrayList();
		int cntr=0;
		for(int i=0;i<strArr.length;i++){
			for(int j=0;j<inputArr.length;j++){
				if(strArr[i].equals(inputArr[j])){
					if(cntr==0){
						matchedPos.add(str.indexOf(inputArr[j]));//=str.indexOf(inputArr[j]);
					}else{
						int prev=Integer.parseInt(matchedPos.get(cntr-1).toString());
						matchedPos.add(str.indexOf(inputArr[j],prev));
					}
					
					cntr++;
					endWordLength=inputArr[j].length();

				}
			}
		}
		
		int arrSize=matchedPos.size();
		int inputStrSize=inputArr.length;
		
		for(int i=arrSize-inputStrSize;i<arrSize;i++){
			if(!startPosFlag){
				startPos=Integer.parseInt(matchedPos.get(i).toString());
				startPosFlag=true;
			}else{
				endPos=Integer.parseInt(matchedPos.get(i).toString());
			}
		}
		String proximalSearchStr=str.substring(startPos, endPos+endWordLength);
		System.out.println(proximalSearchStr);
	}
}
