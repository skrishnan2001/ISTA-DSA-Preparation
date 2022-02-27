package Contests.Week09_Contest_Arrays_Strings_LinkedList;

//TC: O(log(min(a, b))) || SC: O(1)
//Problem Link: https://www.hackerrank.com/challenges/harry-potter-and-the-floating-rocks/problem

public class Q2_SummarAndTheFloatingRocks {
    static int gcd(int max, int min) {
        while (min > 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return max;
    }

    public static int solve(int x1, int y1, int x2, int y2) {
        int min = Math.min(Math.abs(y2 - y1), Math.abs(x2 - x1));
        int max = Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
        return gcd(min, max) - 1;
    }
}
