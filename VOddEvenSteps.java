package com.programs.hackerrank;


//https://seolhun.github.io/Java-FindSteps/
public class VOddEvenSteps {


    public int solution(String S) {
        int binary = Integer.parseInt(S, 2);
        return totalSteps(binary, 0);
    }


    private int totalSteps(int binary, int count) {
        if (binary == 0) {
            return count;
        }
        count++;

        if (binary % 2 == 0) {
            return totalSteps(binary / 2, count);
        } else {
            return totalSteps(binary - 1, count);
        }
    }

    public static void main(String args[]) {
        VOddEvenSteps t = new VOddEvenSteps();
        System.out.println(t.solution("011100"));
    }
}
