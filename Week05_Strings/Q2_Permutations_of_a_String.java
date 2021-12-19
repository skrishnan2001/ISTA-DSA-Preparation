package Week05_Strings;
import java.util.*;

//TC: O(n!) || SC: O(n!)

public class Q2_Permutations_of_a_String {
    public List<String> find_permutation(String S) {
        List<String> ans = new ArrayList<>();
        find_permutation_helper(S, 0, S.length() - 1, ans);
        Collections.sort(ans);
        return ans;
    }

    String swap(String s, int i, int j) {
        char ch[] = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    void find_permutation_helper(String S, int l, int r, List<String> ans) {
        if (l == r)
            ans.add(S);
        for (int i = l; i <= r; i++) {
            S = swap(S, l, i);
            find_permutation_helper(S, l + 1, r, ans);
            S = swap(S, l, i);
        }
    }
}
