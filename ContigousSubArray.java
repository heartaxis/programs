package com.programs.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
Input : arr[] = {1, 5, 7, 8, 2, 3, 9}
X = 6
Output : 6
Explanation : Sub-arrays are {1}, {5}, {2}, {3},
{1, 5}, {2, 3}
*/

class ContigousSubArray {

    public static long countSubarrays(List<Integer> numbers, int k) {
        long cntr = 0;
        int data;
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            data = numbers.get(i);
            if (data <= k) {
                cntr++;
            }
            for (int j = i + 1; j < size; j++) {
                data = data * numbers.get(j);
                if (data <= k)
                    cntr++;
                else
                    break;
            }
        }
        return cntr;
    }

    // Driver Code
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);

        int k = 6;

        long count = countSubarrays(numbers, k);
        System.out.print(count);
    }
} 

