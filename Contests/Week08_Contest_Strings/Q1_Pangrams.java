package Contests.Week08_Contest_Strings;

//TC: O(n) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/pangrams/problem

public class Q1_Pangrams {
    public static String pangrams(String s) {
        
        int freq[] = new int[26];
        for(char ch : s.toLowerCase().toCharArray())
        {
            if(ch != ' ')
                freq[ch - 'a']++;
        }
        
        for(int f : freq)
        {
            if(f < 1)
                return "not pangram";
        }
        return "pangram";
    }
}
