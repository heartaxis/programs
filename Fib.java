/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.programs.random;

/**
 *
 * @author santoshkumar
 */
public class Fib {
    
    public static void main(String args[]){ 
        System.out.println(new Fib().solution(10)); 
        
    }
    
    public int solution(int N){
        Integer data=fib(N);
        if(data.toString().length()>6){
            data=new Integer(data.toString().substring(data.toString().length()-6));
        }
        return data;
    }
    
    static int fib(int n) 
    { 
        if (n <= 1) 
           return n; 
        return fib(n-1) + fib(n-2); 
    } 
    
}

