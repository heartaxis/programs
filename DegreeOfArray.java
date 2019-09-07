/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.programs.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author santoshkumar
 */
public class DegreeOfArray {
    
    public static void main(String args[]){
       // Integer[] nums={5,1,2,2,3,1};
       // Integer[] nums={1,1,2,1,2,2};
        Integer[] nums={1,2,2,3,1};
        List<Integer> arr=Arrays.asList(nums);
        int result =degreeOfArray(arr);
                System.out.println(result);

    }
    
    public static int degreeOfArray(List<Integer> arr) {
        int listSize = arr.size();
        int degree = 0;
        Map<Integer,Integer> headList = new HashMap<>();
        Map<Integer,Integer> startList = new HashMap<>();
        Map<Integer,Integer> endList = new HashMap<>();
        for(int i = 0;i<listSize;i++){
            headList.put(arr.get(i),headList.getOrDefault(arr.get(i),0)+1);
            if(!startList.containsKey(arr.get(i))){
                startList.put(arr.get(i),i);
            }
            endList.put(arr.get(i),i);
            degree = Math.max(degree,headList.get(arr.get(i)));
        }
        int len ;
        int degreeOfArray = listSize;
        for(int c : headList.keySet()){
            if(headList.get(c)==degree){
                len = endList.get(c)-startList.get(c)+1;
                if(len < degreeOfArray)
                    degreeOfArray = len;
            }

        }
        return degreeOfArray;
    }
}
