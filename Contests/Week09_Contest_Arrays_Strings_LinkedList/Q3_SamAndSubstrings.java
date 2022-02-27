package Contests.Week09_Contest_Arrays_Strings_LinkedList;

//TC: O(n) || SC: O(1)
//Problem Link: https://www.hackerrank.com/challenges/sam-and-substrings/problem

public class Q3_SamAndSubstrings {
    public static int substrings(String str) {
        long curr = str.charAt(0) - 48;
        int currSum = (int) curr;
        int mod = 1000000007;
        for (int i = 1; i < str.length(); i++) {
            int currDigit = str.charAt(i) - 48;
            curr = (curr * 10l + (i + 1) * currDigit) % mod;
            currSum = (currSum + (int) curr) % mod;
        }
        return currSum;

    }
}
