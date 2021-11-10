//TC: O(n) | SC: O(n)
//Problem link: https://www.hackerrank.com/challenges/beautiful-pairs/problem

import java.util.*;

public class Q1_BeautifulPairs {
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        for (int i : A) {
            if (!a.containsKey(i))
                a.put(i, 1);
            else
                a.put(i, a.get(i) + 1);
        }

        for (int j : B) {
            if (!b.containsKey(j))
                b.put(j, 1);
            else
                b.put(j, b.get(j) + 1);
        }
        int ans = 0;

        for (int i : a.keySet()) {
            if (b.containsKey(i))
                ans += Math.min(a.get(i), b.get(i));
        }
        return ans < A.size() ? ans + 1 : ans - 1;
    }
}
