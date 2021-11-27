package Contests.Week04_Contest_Arrays;
import java.util.*;

//Problem link: https://www.hackerrank.com/challenges/picking-numbers/problem
//TC: O(n) | SC: O(n)

public class Q1_PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[101];

        for (int i : a)
            freq[i]++;

        int globalMax = 0;
        for (int i = 1; i < a.size(); i++)
            globalMax = Math.max(globalMax, freq[i - 1] + freq[i]);

        return globalMax;
    }
}
