package Week05_Strings;
import java.util.*;

//TC: O(n) | SC: O(26)

public class Q11_CountOccurrenceOfAnagrams {
    int search(String pat, String txt) {
        Map<Character, Integer> patMap = new HashMap<>();
        Map<Character, Integer> txtMap = new HashMap<>();

        for (char ch : pat.toCharArray())
            patMap.put(ch, patMap.getOrDefault(ch, 0) + 1);

        for (int i = 0; i < pat.length(); i++) {
            char ch = txt.charAt(i);
            txtMap.put(ch, txtMap.getOrDefault(ch, 0) + 1);
        }

        int i = pat.length(), count = 0, len = pat.length();

        while (i < txt.length()) {
            if (txtMap.equals(patMap))
                count++;
            // acquire
            char charToAcquire = txt.charAt(i);
            txtMap.put(charToAcquire, txtMap.getOrDefault(charToAcquire, 0) + 1);

            // release
            char charToRelease = txt.charAt(i - len);
            if (txtMap.get(charToRelease) == 1)
                txtMap.remove(charToRelease);
            else
                txtMap.put(charToRelease, txtMap.get(charToRelease) - 1);
            i++;
        }
        if (txtMap.equals(patMap))
            count++;
        return count;
    }
}
