package Week04_Strings;
import java.util.*;

//TC: O(n) | SC: O(n) -> Time is O(n) because each character is visited at most twice

public class Q10_ReverseEachWords {
    String reverseWords(String S)
    {
        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0, n = S.length();
        
        while(i < n)
        {
            while(i < n && S.charAt(i) != '.')
                st.push(S.charAt(i++));
            
            while(!st.isEmpty())
                ans += st.pop();
            
            if(i < n)
                ans += S.charAt(i++);
        }
        
        return ans;
    }
}
