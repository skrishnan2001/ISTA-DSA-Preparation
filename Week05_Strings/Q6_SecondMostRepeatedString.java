package Week05_Strings;
import java.util.*;

//TC: O(N * max(|Si|)) | SC: O(N * max(|Si|))

public class Q6_SecondMostRepeatedString {
    String secFrequent(String arr[], int N) {
        Map<String, Integer> freq = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        String mostFrequent = "";

        for (String str : arr) {
            if (!freq.containsKey(str))
                freq.put(str, 1);
            else
                freq.put(str, freq.get(str) + 1);

            if (freq.get(str) > maxFreq) {
                mostFrequent = str;
                maxFreq = freq.get(str);
            }
        }

        freq.remove(mostFrequent);
        String ans = "";
        int secondMostFrequent = Integer.MIN_VALUE;
        for (String key : freq.keySet()) {
            if (freq.get(key) > secondMostFrequent) {
                ans = key;
                secondMostFrequent = freq.get(key);
            }
        }
        return ans;
    }
}
