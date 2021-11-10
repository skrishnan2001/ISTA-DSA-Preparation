package Week00_JavaBasics;

import java.io.*;

public class PrimeNumber {
    static boolean isPrime(int num)
    {
        if(num <= 1)
            return false;
        
        if(num == 2 || num == 3)
            return true;
        
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        
        for(int i = 5; i * i <= num; i += 6)
        {
            if(num % i == 0 || num % ( i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(buf.readLine());
        System.out.println(isPrime(n));
    }
}
