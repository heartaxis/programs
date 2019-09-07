package com.programs.hackerrank;

import java.util.Arrays;
import java.util.Collections;

public class Coins {


    public int solution(int[] A) {
        int count = 0;
        int Arr[]={1,0};

        for (int i = 0; i < A.length - 2; i++) {
            int indexNext=i+1;
            int indexNextNext=indexNext+1;
            if(A[i]!=A[indexNextNext]){
               // A[i]=Arr[A[i]];
                count++;
            }else if(A[i]==A[indexNext] || A[indexNext]==A[indexNextNext]){
                count++;
            }
        }
      //  Collections.reverse(Arrays.asList(A));
     //   System.out.println(Arrays.asList(A));

        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,0,1,0,1,1};
        int[] A1 = new int[]{1,1,0,1,1};
        int count = new Coins().solution(A);
        System.out.println("Count: " + count);
    }

}
