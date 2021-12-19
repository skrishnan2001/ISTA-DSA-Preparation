package Week05_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(1)

public class Q7_LongestDistinctCharacters {
    static int longestSubstrDistinctChars(String S){
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int n = S.length();
        int len = 0;
        while(right < n)
        {
            char currentChar = S.charAt(right);
            if(map.containsKey(currentChar))
                left = Math.max(map.get(currentChar) + 1, left);
            //To check if the the character last seen lies in range [left...right]
            map.put(currentChar, right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
