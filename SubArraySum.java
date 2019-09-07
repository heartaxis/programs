package com.programs.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArraySum {

    // Function to check if array has 2 elements
    // whose sum is equal to the given value
    static int hasArrayTwoCandidates(int A[], int sum) {
        int l, r, cntr = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == sum) {
                    cntr++;
                }
            }
        }
        return cntr;
    }

    static void printpairs(int arr[], int sum) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] +", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String args[]) {
        int A[] = {1, 9, 45, 6, 10, 4};
        int n = 10;

        System.out.println("Array has " + hasArrayTwoCandidates(A, n) + " elements with given sum");
        printpairs(A,  n);
    }
}
