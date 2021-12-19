package Contests.Week06_Contest_Strings;

import java.util.*;

//TC: O(1) | SC: O(1)
//Problem link: https://www.hackerrank.com/challenges/the-time-in-words/problem

public class Q3_TimeInWords {
    public static String timeInWords(int h, int m) {
        Map<Integer, String> numInWords = new HashMap<>();
        numInWords.put(1, "one");
        numInWords.put(2, "two");
        numInWords.put(3, "three");
        numInWords.put(4, "four");
        numInWords.put(5, "five");
        numInWords.put(6, "six");
        numInWords.put(7, "seven");
        numInWords.put(8, "eight");
        numInWords.put(9, "nine");
        numInWords.put(10, "ten");
        numInWords.put(11, "eleven");
        numInWords.put(12, "twelve");
        numInWords.put(13, "thirteen");
        numInWords.put(14, "fourteen");
        numInWords.put(15, "fifteen");
        numInWords.put(16, "sixteen");
        numInWords.put(17, "seventeen");
        numInWords.put(18, "eighteen");
        numInWords.put(19, "nineteen");
        numInWords.put(20, "twenty");
        numInWords.put(21, "twenty one");
        numInWords.put(22, "twenty two");
        numInWords.put(23, "twenty three");
        numInWords.put(24, "twenty four");
        numInWords.put(25, "twenty five");
        numInWords.put(26, "twenty six");
        numInWords.put(27, "twenty seven");
        numInWords.put(28, "twenty eight");
        numInWords.put(29, "twenty nine");

        if (m == 0)
            return numInWords.get(h) + " o' clock";

        else if (m == 1)
            return numInWords.get(m) + " minute past " + numInWords.get(h);

        else if ((m > 1 && m < 15) || (m > 15 && m < 30))
            return numInWords.get(m) + " minutes past " + numInWords.get(h);

        else if (m == 15)
            return "quarter past " + numInWords.get(h);

        else if (m == 30)
            return "half past " + numInWords.get(h);

        else if ((m > 30 && m < 45) || (m > 45 && m < 59))
            return (h + 1) > 12 ? numInWords.get(60 - m) + " minutes to one"
                    : numInWords.get(60 - m) + " minutes to " + numInWords.get(h + 1);

        else if (m == 59)
            return (h + 1) > 12 ? "one minute to one" : "one minute to " + numInWords.get(h + 1);

        else if (m == 45) {
            String common = "quarter to ";
            return (h + 1) > 12 ? common + " one" : common + numInWords.get(h + 1);
        }
        return "";
    }

}
