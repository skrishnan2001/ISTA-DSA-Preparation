package Week00_JavaBasics;

import java.io.*;

public class NthCharInString {
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 2 strings: ");
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        System.out.println("Enter the value of N: ");
        int n = Integer.parseInt(buf.readLine());
        if(n < 0 || n >= s1.length() + s2.length())
        {
            System.out.println("Invalid value for n !!");
            return;
        }
        System.out.println("Nth character in the concatenated string: "+ s1.concat(s2).charAt(n));
    }
}
