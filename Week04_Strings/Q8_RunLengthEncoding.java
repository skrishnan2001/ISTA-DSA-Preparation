package Week04_Strings;

//TC: O(n) | SC: O(1) -> Not accounting the space for the string returned as that is mandatory as per the return type of the func

public class Q8_RunLengthEncoding {
    String encode(String str) {
        String encodedString = "";
        int n = str.length(), i = 0;
        while (i < n) {
            char currentChar = str.charAt(i);
            int j = i;
            while (j < n && str.charAt(j) == currentChar)
                j++;

            encodedString += (currentChar + Integer.toString(j - i));
            i = j;
        }
        return encodedString;
    }
}
