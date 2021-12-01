package Week04_Strings;

//TC: min(m, n) | SC: O(1)

public class Q14_StringComparison {
    int stringComparsion(String s1,String s2)
{
    if(s1.equals(s2))
        return 0;
    
    int i = 0;
    
    while(i < s1.length() && i < s2.length())
    {
        if(s1.charAt(i) == s2.charAt(i))
        {
            if(s1.charAt(i) == 'n')
            {
                i++;
                
                if(s1.charAt(i) == 'g' && s2.charAt(i) != 'g')
                    return 1;
                if(s1.charAt(i) != 'g' && s2.charAt(i) == 'g')
                    return -1;
            }
            else
            i++;
        }
        else
        {
            if(s1.charAt(i) > s2.charAt(i))
                return 1;
            else
                return -1;
        }
    }
    
    if(i == s1.length())
        return -1;
    return 1;
}
}
