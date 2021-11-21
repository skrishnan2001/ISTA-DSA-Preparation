package Contests.Week03_Contest_Arrays;
import java.util.*;

//Problem link: https://www.hackerrank.com/challenges/the-birthday-bar/problem
//TC: O(n) | SC: O(n + m) where n is the no. of elements in s

public class Q3_SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int prefix[] = new int[n + m];
        prefix[0] = 0;
        
        for(int i = 0; i < n; i++)
            prefix[i + 1] = prefix[i] + s.get(i);
        
        int ans = 0;
        
        for(int i = 0; i <= n - m; i++)
        {
            if(prefix[i + m] - prefix[i] == d)
                ans++;
        }
        return ans;
    }
}
