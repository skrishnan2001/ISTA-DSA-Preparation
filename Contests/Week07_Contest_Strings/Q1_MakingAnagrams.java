package Contests.Week07_Contest_Strings;

//TC: O(n + m) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/making-anagrams/problem

public class Q1_MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        int freq[] = new int[26];
        for (char ch : s1.toCharArray())
            freq[ch - 'a']++;

        for (char ch : s2.toCharArray())
            freq[ch - 'a']--;

        int ans = 0;
        for (int i = 0; i < 26; i++)
            if (freq[i] != 0)
                ans += Math.abs(freq[i]);
        return ans;
    }
}
