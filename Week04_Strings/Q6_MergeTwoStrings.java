package Week04_Strings;

//TC: O(m + n) | SC: O(m + n)

public class Q6_MergeTwoStrings {
    String merge(String S1, String S2) {
        int i = 0, j = 0;
        int len1 = S1.length(), len2 = S2.length();
        char mergedString[] = new char[len1 + len2];
        int x = 0;
        while (i < len1 && j < len2) {
            mergedString[x++] = S1.charAt(i++);
            mergedString[x++] = S2.charAt(j++);
        }

        while (i < len1)
            mergedString[x++] = S1.charAt(i++);

        while (j < len2)
            mergedString[x++] = S2.charAt(j++);

        return String.valueOf(mergedString);
    }
}
