package Week04_Strings;

//TC: O(n) | SC: O(1)

public class Q9_CountSubstrings {
    int countSubstr(String S) {
        int countOnes = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '1')
                countOnes++;
        }

        return countOnes * (countOnes - 1) / 2;// Basically nC2
    }
}
