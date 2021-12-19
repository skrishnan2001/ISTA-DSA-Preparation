package Week05_Strings;
import java.util.*;

//TC: O(|s1| + |s2|) | SC: O(|s1| + |s2|)

public class Q4_RemoveCommonCharAndConcat {
    public static String concatenatedString(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        String ans = "";

        for (char ch : s2.toCharArray())
            set1.add(ch);

        for (char ch : s1.toCharArray()) {
            if (!set1.contains(ch))
                ans += ch;
            set2.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (!set2.contains(ch))
                ans += ch;
        }

        return ans.length() == 0 ? "-1" : ans;
    }
}
