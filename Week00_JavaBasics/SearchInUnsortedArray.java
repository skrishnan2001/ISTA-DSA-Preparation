package Week00_JavaBasics;

/*
Find whether the given number x present in the array or not

Input: Array elements, number x
Output: True or false

Note: Should not use ArrayList
*/

import java.io.*;

public class SearchInUnsortedArray {

    static void stringArrayToIntArray(String input[], int arr[]) {
        for (int i = 0; i < input.length; i++)
            arr[i] = Integer.parseInt(input[i]);
    }

    static boolean isPresent(int key, int array[]) // Linear Search 
    {
        for (int element : array) {
            if (element == key)
                return true;
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size = ");
        int n = Integer.parseInt(buf.readLine());
        System.out.println("Enter the elements: ");
        String input[] = buf.readLine().trim().split(" ");
        int arr[] = new int[n];

        stringArrayToIntArray(input, arr);

        System.out.print("Enter the element to be searched: ");
        int element = Integer.parseInt(buf.readLine());
        System.out.println(isPresent(element, arr));
    }
}