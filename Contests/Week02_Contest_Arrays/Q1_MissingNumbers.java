package Contests.Week02_Contest_Arrays;

import java.util.*;

//TC: O(n) | SC: O(n)
//Problem link: https://www.hackerrank.com/challenges/missing-numbers/problem
public class Q1_MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> ans = new ArrayList<>();
        int a[] = new int[200001];
        for (int i : brr)
            a[i]++;

        for (int i : arr)
            a[i]--;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > 0)
                ans.add(i);
        }
        return ans;
    }
}
