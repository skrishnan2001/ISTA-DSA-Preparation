//TC: O(nlogn) | SC: O(n)
//Problem link: https://www.hackerrank.com/challenges/maximum-subarray-sum/problem
//YT sol: https://youtu.be/u_ft5jCDZXk

import java.util.*;

public class MaximumSubarraySum {
    public static long maximumSum(List<Long> a, long m) {
        long maxSum = 0;
        TreeSet<Long> prefix = new TreeSet<>(); //TreeSet in java works like a self-balanced tree BST
        long currSum = 0;
        for (int i = 0; i < a.size(); i++) {
            currSum = (currSum + a.get(i)) % m;
            maxSum = Math.max(maxSum, currSum);
            Long pr = prefix.higher(currSum); 
            /*
            The higher(E ele) method of TreeSet class in Java is used to return the least element in this set 
            which is strictly greater than the given element currSum. If no such element is there then this method
             returns NULL.
            */
            if (pr != null) {
                maxSum = Math.max(maxSum, (currSum - pr + m) % m);
            }
            prefix.add(currSum);
        }
        return maxSum;
    }
}
