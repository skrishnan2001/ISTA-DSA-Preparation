package Contests.Week02_Contest_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)
//Problem link: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

public class Q2_SherlockAndValidStrings {
    static int[] minFreqAndCountOnes(Map<Character, Integer> mp) {
        int min = Integer.MAX_VALUE, countOnes = 0;
        for (char i : mp.keySet()) {
            int currFreq = mp.get(i);
            if (currFreq < min)
                min = currFreq;
            if (currFreq == 1)
                countOnes++;
        }
        return new int[] { min, countOnes };
    }

    public static String isValid(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!mp.containsKey(ch))
                mp.put(ch, 1);
            else
                mp.put(ch, mp.get(ch) + 1);
        }

        int[] minFreqCountOnes = minFreqAndCountOnes(mp);

        int min = minFreqCountOnes[0];
        int countOnes = minFreqCountOnes[1];
        int sumDiffCurrMin = 0, diffCurrMin = 0;

        for (char ch : mp.keySet()) {
            if (mp.get(ch) > min) {
                diffCurrMin = mp.get(ch) - min;
                sumDiffCurrMin += diffCurrMin;
            }
        }

        if (sumDiffCurrMin <= 1)
            return "YES";

        if (countOnes == 1 && sumDiffCurrMin == (mp.size() - 1) * diffCurrMin)
            return "YES";

        return "NO";
    }
}
