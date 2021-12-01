package Week04_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(|S|)

public class Q1_ReverseWordsInAString {
    String reverseWords(String S)
    {
        StringTokenizer str = new StringTokenizer(S, ".");
        Stack<String> stack = new Stack<>();
        
        while(str.hasMoreTokens())
            stack.push(str.nextToken());
        
        String reverse = "";
        while(stack.size() > 1)
            reverse += (stack.pop() + ".");
        reverse += stack.pop();
        return reverse;
    }
}
