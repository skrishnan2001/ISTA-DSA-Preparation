package Week05_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(|S|)

public class Q10_NumberFollowingAPattern {
    static String printMinNumberForPattern(String S){
        String ans = "";
        int num = 1;
        Stack<Integer> st = new Stack<>();
        
        for(char ch : S.toCharArray())
        {
            if(ch == 'D')
                st.push(num++);
            else
            {
                st.push(num++);
                while(!st.isEmpty())
                    ans += Integer.toString(st.pop());
            }
        }
        
        st.push(num);
        while(!st.isEmpty())
            ans += Integer.toString(st.pop());
        return ans;
    }
}
