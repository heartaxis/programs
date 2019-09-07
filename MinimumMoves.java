package com.programs.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinimumMoves {

    public static int minimumMoves(List<Integer> a, List<Integer> m) {
        int moves = 0;
        Integer num1, num2, digit1, digit2;
        for (int i = 0; i < a.size(); i++) {
            num1 = a.get(i);
            num2 = m.get(i);
            int length = String.valueOf(num1).length();
            for (int j = 0; j < length; j++) {
                digit1 = num1 % 10;
                digit2 = num2 % 10;
                moves += Math.abs(digit1 - digit2);
                num1 = (num1 - digit1) / 10;
                num2 = (num2 - digit2) / 10;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        a.add(123);
        a.add(543);
        m.add(321);
        m.add(279);
        System.out.println(minimumMoves(a, m));

    }
}
