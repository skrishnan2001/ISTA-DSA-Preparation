package Contests.Week03_Contest_Arrays;

import java.util.*;

//Problem link: https://www.hackerrank.com/challenges/non-divisible-subset/problem
//TC: O(n) | SC: O(k), where n is the no. of elements in S

public class Q1_NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> S) {
        int[] remainderArr = new int[k];

        for (int each : S)
            remainderArr[each % k]++;

        int zeroRemainder = remainderArr[0];
        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;

        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet++;
        }

        return maxNumberOfDivisibleSet;

    }
}
