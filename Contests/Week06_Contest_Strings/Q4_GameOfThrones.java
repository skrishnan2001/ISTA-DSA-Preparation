package Contests.Week06_Contest_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/game-of-thrones/problem

public class Q4_GameOfThrones {
    public static String gameOfThrones(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray())
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        
        int count = 0;
        for(char ch : freq.keySet())
        {
            if(freq.get(ch) % 2 != 0)
                count++;
        }
        return count <= 1 ? "YES" : "NO";
    }
}
