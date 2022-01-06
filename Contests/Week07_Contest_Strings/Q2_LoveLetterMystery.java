package Contests.Week07_Contest_Strings;

//TC: O(n) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

public class Q2_LoveLetterMystery {
    public static int theLoveLetterMystery(String s) {
        int operations = 0;
        for(int i = 0; i < s.length(); i++)   
        {
            if(s.charAt(i) == s.charAt(s.length() - 1 - i))
                continue;
            else
            {
                int ch = (int)(s.charAt(s.length() - 1 - i) - (int)(s.charAt(i)));
                if(ch > 0)
                    operations += ch;

            }
        }
        return operations;
    }

}
