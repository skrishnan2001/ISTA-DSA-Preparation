package Week05_Strings;

//TC: O(n + m) | SC: O(1)

public class Q1_Anagrams {
    public static boolean isAnagram(String a, String b) {

        int freq[] = new int[26];

        for (char ch : a.toCharArray())
            freq[ch - 'a']++;

        for (char ch : b.toCharArray())
            freq[ch - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
