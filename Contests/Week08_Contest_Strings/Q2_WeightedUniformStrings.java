package Contests.Week08_Contest_Strings;

import java.util.*;

//TC: O(n ^ 2) || SC: O(|Q|)
//Problem link: https://www.hackerrank.com/challenges/weighted-uniform-string/problem

public class Q2_WeightedUniformStrings {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<String> ans = new ArrayList<>();
        Map<Character, Integer> weights = new HashMap<>();
        int weight = 1, n = s.length();
        for (char ch = 'a'; ch <= 'z'; ch++)
            weights.put(ch, weight++);

        Set<Integer> subWeights = new HashSet<>();

        for (char ch : s.toCharArray())
            subWeights.add(weights.get(ch));

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                subWeights.add(weights.get(s.charAt(i)) * (j - i + 1));
                j++;
            }

            i = j - 1;
        }

        for (int w : queries) {
            if (subWeights.contains(w))
                ans.add("Yes");
            else
                ans.add("No");
        }
        return ans;
    }

}
