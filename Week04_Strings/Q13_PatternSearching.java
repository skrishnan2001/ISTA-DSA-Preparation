package Week04_Strings;

//Note, this problem can be optimized using KMP algorithm
//TC: O(m * n) | SC: O(1)

public class Q13_PatternSearching {
    boolean patternSearch(String text, String pattern)
    {
        return text.contains(pattern);
    }
}
