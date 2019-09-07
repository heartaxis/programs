package com.programs.hackerrank;

import java.util.Arrays;

public class CompareArrays {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] <= A[k])
                i += 1;
            if (A[k] == B[i])
               return A[k];
        }
        return i>0?i:-1;
    }

    public static void main(String[] args) {
        int[] A={1, 1, 2, 3};
        int[] B={2, 2, 3, 4, 5};
        int[] A1={2, 1};
        int[] B1={2,3};
        int[] A2={2, 1};
        int[] B2={3,3};
        System.out.println(new CompareArrays().solution(A2,B2));
    }
}
