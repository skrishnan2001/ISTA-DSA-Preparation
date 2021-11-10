package Week01_Arrays;

//TC: O(n); SC : O(n)

import java.util.*;
public class Q8_ValidParantheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                st.push(ch);
            
            else if(!st.isEmpty() && ch == map.get(st.peek()))
                st.pop();
            
            else
                return false;
        }
        return st.isEmpty();
    }
}