package Week05_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(256)

public class Q9_SmallestDistinctWindow {
    public String findSubString(String str) {
        String ans = "";
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray())
            set.add(ch);

        int i = -1, j = -1;
        Map<Character, Integer> map = new HashMap<>();
        while (true) {
            boolean flag1 = false, flag2 = false;
            // Acquire till map.size() < set.size()
            while (i < str.length() - 1 && map.size() < set.size()) {
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                flag1 = true;
            }

            // Release character at j th pos till map.size() = set.size()
            while (j < i && map.size() == set.size()) {
                String potentialAns = str.substring(j + 1, i + 1);
                if (ans.length() == 0 || potentialAns.length() < ans.length())
                    ans = potentialAns;

                j++;
                char ch = str.charAt(j);
                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch) - 1);
                flag2 = true;
            }

            if (!flag1 && !flag2)
                break;
        }
        return ans;
    }
}
