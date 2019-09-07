/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programs.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author santoshkumar
 */
public class StringRoller {
    public static void main(String args[]){
        String s = "abz"; 
        Integer k[] = {3}; 
        List<Integer> arr=Arrays.asList(k);

        System.out.println(rollTheString(s,arr)); 
    }
    
    public static String rollTheString(String s, List<Integer> roll) {
        int rollSize = s.length();
        int rollCounts[] = new int[rollSize]; 


        for(Integer rollCount:roll){
            rollCounts[rollCount-1]++;
        }
  
        for (int index = rollSize - 2; index >= 0; index--)  
        { 
            rollCounts[index] += rollCounts[index + 1]; 
        } 
  
        char toRollArray[] = s.toCharArray(); 
        IntStream.range(0, rollSize).forEach(index -> { 
            toRollArray[index] = (char) ('a' + (rollCounts[index] % 26 + toRollArray[index] - 'a') % 26); 
        }); 
  
        return String.valueOf(toRollArray);     
    }
}
