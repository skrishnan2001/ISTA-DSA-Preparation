package Contests.Week06_Contest_Strings;

//TC: O(|S|) | SC: O(|S|) -> Creating a new string for answer as strings are immutable in java
//Problem link: https://www.hackerrank.com/challenges/caesar-cipher-1/problem

public class Q1_CaesarCipher {
    public static String caesarCipher(String s, int k) {
        String st = "";
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                int a = (int) ch + k % 26;
                if ((Character.isUpperCase(ch) && a > 90) || (Character.isLowerCase(ch) && a > 122))
                    a -= 26;
                st += (char) a;
            } else
                st += ch;
        }
        return st;
    }
}
