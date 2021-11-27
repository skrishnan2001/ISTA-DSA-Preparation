package Contests.Week04_Contest_Arrays;
import java.util.*;

//Problem link: https://www.hackerrank.com/challenges/sorted-subsegments/problem

//Partial solutions -> 6 test cases failing
//TC: O(n log n + q) | SC: O(1) where n is the no. of elements in a and q is the no. of queries

public class Q3_SortedSubsegments {
    public static int sortedSubsegments(int k, List<Integer> a, List<List<Integer>> queries) {
        int minLow = a.size() - 1, maxHigh = 0;
        for (List<Integer> query : queries) {
            int low = query.get(0);
            int high = query.get(1);
            minLow = Math.min(low, minLow);
            maxHigh = Math.max(high, maxHigh);
        }
        Collections.sort(a.subList(minLow, maxHigh + 1));
        return a.get(k);
    }

}
