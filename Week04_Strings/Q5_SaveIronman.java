package Week04_Strings;

//TC: O(n) | SC: O(1)

public class Q5_SaveIronman {
    static boolean isPalindrome(String s)
    {
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static boolean saveIronman (String s) {
        
        s = s.replaceAll("[,?/:;! ]","");
        return isPalindrome(s.toLowerCase());
    }
}
