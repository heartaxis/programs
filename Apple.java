package com.practice.programs.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {
	public int solution(int[] A, int K, int L){
        int totalApples = 0;
        
        Integer[] a = Arrays.stream(A).boxed().toArray(Integer[]::new);
        
        Integer[] maxArray = getMax(a, K);
        totalApples+=maxArray[0];

        Integer[] startArray = Arrays.copyOfRange(a, 0, maxArray[1]);
        Integer[] endArray = Arrays.copyOfRange(a, (maxArray[1]+K), a.length);

        List<Integer> mergedStartAndEndList = new ArrayList(Arrays.asList(startArray));
        mergedStartAndEndList.addAll(Arrays.asList(endArray));
        Integer[] mergedStartAndEndArray =  mergedStartAndEndList.toArray(new Integer[0]);

        maxArray = getMax(mergedStartAndEndArray, L);
        if(maxArray[0]==0) {
        	totalApples=-1;
        }else {
        	totalApples+=maxArray[0];
        }
        return totalApples;
    }

    static Integer[] getMax(Integer[] A, int elements){
        int sumForFirst = 0;
        int sumForFirstPrev = 0;
        int startingIndexForK = 0;
        Integer[] resultArray = new Integer[2];
        for(int i = 0; i < A.length; i++){
            if(i <= A.length - elements) {
                for (int j = i; j < i + elements; j++) {
                    sumForFirst += A[j];
                }
            }

            if(sumForFirst >  sumForFirstPrev) {
                sumForFirstPrev = sumForFirst;
                startingIndexForK = i;

            }
            sumForFirst = 0;
        }
        resultArray[0] = sumForFirstPrev;
        resultArray[1] = startingIndexForK;
        return resultArray;
    }

    public static void main(String[] args) {
        int a[] = {6, 1, 4, 6, 3, 2, 7,4};
        int a1[] = {10,19,15};
        Apple app=new Apple();
        System.out.println(app.solution(a, 3,2));
     System.out.println(app.solution(a1, 2,2));

    }
}
