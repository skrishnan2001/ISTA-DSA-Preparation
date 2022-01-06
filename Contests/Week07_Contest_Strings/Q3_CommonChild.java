package Contests.Week07_Contest_Strings;

//TC: O(n * m) | SC: O(n * m)
//Problem link: https://www.hackerrank.com/challenges/common-child/problem

public class Q3_CommonChild {
    public static int commonChild(String s1, String s2) {// LCS Problem
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }
}
