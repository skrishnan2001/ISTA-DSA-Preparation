package Week05_Strings;

//TC: O(|S|) | SC: O(1)

public class Q3_NonRepeatingCharacter {
    static char nonrepeatingCharacter(String S) {
        int freq[] = new int[26];

        for (char ch : S.toCharArray())
            freq[ch - 'a']++;

        for (char ch : S.toCharArray()) {
            if (freq[ch - 'a'] == 1)
                return ch;
        }
        return '$';
    }
}
