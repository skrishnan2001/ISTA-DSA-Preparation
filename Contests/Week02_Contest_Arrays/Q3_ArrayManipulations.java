package Contests.Week02_Contest_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n) -> Using prefix sum algorithm
//Problem link: https://www.hackerrank.com/challenges/crush/problem

public class Q3_ArrayManipulations {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long arr[] = new long[n + 1];
        for(List<Integer> query : queries)
        {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            arr[a - 1] += k;
            arr[b] -= k;
        }
        
        long max = arr[0];
        for(int i = 1; i < n; i++)
        {
            arr[i] += arr[i - 1];
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
