package Contests.Week06_Contest_Strings;
import java.util.*;

//TC: O(|s|^3) | SC: O(|S|)
//Problem link: https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem

public class Q2_SherlockAndAnagrams {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int freq[] = new int[26];

        for (char ch : a.toCharArray())
            freq[ch - 'a']++;

        for (char ch : b.toCharArray())
            freq[ch - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    public static int sherlockAndAnagrams(String s) {
        int n = s.length();
        int ans = 0;
        for (int len = 1; len <= n; len++) {
            List<String> substringsOfLength_len = new ArrayList<>();
            for (int i = 0; i <= n - len; i++)
                substringsOfLength_len.add(s.substring(i, i + len));

            int length = substringsOfLength_len.size();
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (isAnagram(substringsOfLength_len.get(i), substringsOfLength_len.get(j)))
                        ans++;
                }
            }
        }
        return ans;
    }
}
