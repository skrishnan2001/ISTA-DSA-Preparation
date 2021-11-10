//TC: O(n) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.util.*;

public class Q3_AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
            for(long i : ar)
                sum += i;
            return sum;
    
        }
}
