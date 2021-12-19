package Week05_Strings;
import java.util.*;

//TC: O(N * |S| * log(|s|)) | SC: O(N * |S|)

public class Q5_Group_Anagrams {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : string_list) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            if (!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList<>());
            anagrams.get(key).add(word);
        }

        return new ArrayList<>(anagrams.values());
    }
}
