package Week05_Strings;
import java.util.*;

//TC: O(|s| + |t|) || SC: O(1)

public class Q8_MinimumWindowSubstring
{
    public static String smallestWindow(String s, String t)
    {
        String ans = "";
        Map<Character, Integer> map2 = new HashMap<>();
        for(char ch : t.toCharArray())
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        
        int desiredMatch = t.length();
        int currMatch = 0;
        int i = -1, j = -1;
        
        Map<Character, Integer> map1 = new HashMap<>();
        while(true)
        {
            boolean flag1 = false, flag2 = false;
            
            //acquire
            while(i < s.length() - 1 && currMatch < desiredMatch)
            {
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                
                if(map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0))
                    currMatch++;
                flag1 = true;
            }
            
            //collect answers and release
            while(j < i && currMatch == desiredMatch)
            {
                String potentialAns = s.substring(j + 1, i + 1);
                if(ans.length() == 0 || potentialAns.length() < ans.length())
                    ans = potentialAns;
                j++;
                char ch = s.charAt(j);
                
                if(map1.get(ch) == 1)
                    map1.remove(ch);
                else
                    map1.put(ch, map1.get(ch) - 1);
                
                if(map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0))
                    currMatch--;
                flag2 = true;
            }
            
            if(!flag1 && !flag2)
                break;
        }
        return ans.length() == 0 ? "-1" : ans;
    }
}