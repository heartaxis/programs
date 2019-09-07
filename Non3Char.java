package com.programs.random;

class Non3Char {
    public String solution(int A, int B) {
        // write your code in Java SE 8
    	int max,min,diff,cntrMin=0,cntrMax=0;
    	char maxChar,minChar;
    	
    	if(A>B) {
    		max=A;
    		min=B;
    		maxChar='a';
    		minChar='b';
    	}else {
    		max=B;
    		min=A;
    		maxChar='b';
    		minChar='a';
    	}
    	diff=max-min;
    	if(diff>2) {
    	//	max=max/2;
    	}
    	
    	String result="";
    	for(int i=0;i<max;i++) {
    		cntrMax++;
    		result+=maxChar;
        	if(diff>2 && cntrMax<max) {
        		result+=maxChar;
        		i++;
        		cntrMax++;
        	}
    		if(cntrMin<min){
        		result+=minChar;
    		}
    		cntrMin++;
    	}
        return result;
    }
    
    public static void main(String[] args) {
		Non3Char aa=new Non3Char();
		System.out.println(aa.solution(3, 5));
	}
}
