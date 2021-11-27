package Contests.Week04_Contest_Arrays;
import java.util.*;

//Problem link: https://www.hackerrank.com/challenges/larrys-array/problem
//TC: O(n^2) | SC: O(1)

public class Q2_LarrysArray {
    public static String larrysArray(List<Integer> A) {
        int inversions = 0;
        for(int i = 0; i < A.size(); i++)
        {
            for(int j = i + 1; j < A.size(); j++)
            {
                if(A.get(i) > A.get(j))
                    inversions++;
            }
        }
        return inversions % 2 == 0 ? "YES" : "NO";
    }
}
