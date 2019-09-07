/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.programs.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author santoshkumar
 */
public class MaxMinData {
     public static void main(String args[]){
        String s = "abz"; 
        Integer[] nums={1,2,3,1};
        List<Integer> arr=Arrays.asList(nums);
        List<String> operations=new ArrayList<>();
        operations.add("push");
        operations.add("push");
        operations.add("push");
        operations.add("pop");
                System.out.println(maxMin(operations,arr)); 


    }
     
    public static List<Long> maxMin(List<String> operations, List<Integer> x) {
        int arrSize=x.size();
        List<Long> resultList=new ArrayList<>();
        List<Integer> dataList=new ArrayList<>();
        for(int i=0;i<arrSize;i++){
            if(operations.get(i).equalsIgnoreCase("push")){
                dataList.add(x.get(i));
            }else{
                dataList.remove(x.get(i));
            }
            Integer max=Collections.max(dataList);
            Integer min=Collections.max(dataList);
            Long mul=new Long(max*min);
            resultList.add(mul);
        }
        return resultList;
    }
    
}
