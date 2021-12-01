package Week04_Strings;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q4_RemoveAllDuplicatesInAString {
    String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        String noDuplicates = "";
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                noDuplicates += ch;
                set.add(ch);
            }
        }
        return noDuplicates;
    }
}
